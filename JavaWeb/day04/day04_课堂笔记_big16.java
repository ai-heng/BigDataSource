今日内容大纲:
	1. JDBC的核心7步
	
	2. JDBCUtils工具类的抽取
	

	3. SQL注入攻击问题.
		//Java代码演示此问题.
		//Java代码解决此问题.
		
		
	4. DBCP(数据库连接池)
		概述: DataBase Connection Pool, 数据库连接池.
			//作用: 优化"释放资源"这步操作的, 将连接对象(conn)从"销毁"变为"自动归还".
			//大白话解释: 就是优化释放资源, 提高效率的.  JDBC的核心步骤还是 7步.
		
	
	
	5. DBUtils
		概述: 操作JDBC的工具类, 将JDBC的操作简化为: 3步, 而且功能更加强大.


今日具体内容:
1. JDBC操作事务		//掌握, 后边项目要用.
	Connection接口:
		public void setAutoCommit(boolean autoCommit);	//设置是否开启事务的自动提交功能
		public void commit();							//提交事务
		public void rollback();							//事务回滚
		public void setTransactionIsolation(int level);	//设置事务的隔离级别.
		/*
			四大权限修饰符对应的数字分别是: 1,2,4,8
			
			Connection接口额外定义了一个常量: NONE(表示不支持事务): 值是0
		*/
		
	案例: 模拟转账
		步骤:
			try{
				//关闭事务的自动提交功能
				账户1 - 1000
				账户2 + 1000
				//提交事务
				//开启事务的自动提交功能
			}catch(Exception e) {
				//事务回滚
				e.printStackTrace();
			}finally{
				
			}

2. JDBC进行批处理
	Statement接口:
		public void addBatch(String sql);	//添加批处理
		public int[] executeBatch();		//执行批处理, 返回值是各个SQL语句的结果集的组合.
		public void clearBatch();			//清空批处理.
		
	记忆:	
		批处理操作是针对于: 更新语句的. 针对于查询语句无效.
		executeBatch()底层其实依赖的是(调用的是): executeUpdate(String sql);

3. DBCP的简介:
	概述: DataBase Connection Pool, 数据库连接池.
	
		/*
			实际开发中, 我们需要频繁操作数据库, 这就意味着我们要创建大量的连接对象, 而我们目前用的连接对象是用完就释放, 系统频繁创建大量生命周期短的连接对象是非常消耗资源的. 针对这种情况, 我们可以创建一个池子出来, 里边放一些连接
			对象, 用的时候从里边拿, 用完之后再放回去. 这个池子就是: 数据库连接池.
			这样做的好处是: 节约资源, 提高效率.
		
		*/
	
	
	作用:
		主要是用来优化"获取连接对象和销毁连接对象"这步动作的, 
		将连接对象从销毁变为自动归还.
		//这样做的好处是: 节约资源, 提高效率.				//记忆
	

	分类:
		采用第三方的 jar包(大白话: 用别人做好的 数据库连接池)		//Spring
			DBCP: 属于Apache公司的, 不会自动回收空闲连接.
			C3P0: 属于Apache公司的, 会自动回收空闲连接.
				  目前JavaWeb的三大核心框架(SSH)的底层涉及到的数据库的部分 用到的就是C3P0.
			Druid: 属于阿里巴巴的. 采用"分布式事务的思路"实现的.
		
		
		自定义数据库连接池:		//补充知识
	
	
	案例:
		使用C3P0数据库连接池操作数据:
			版本1: 手动设置参数.
			版本2: 结合配置文件使用.		//掌握
			版本3: 抽取工具类.				//理解,  个人建议, 掌握
			
		
		使用Druid数据库连接池操作数据:
			版本1: 手动设置参数.
			版本2: 结合配置文件使用.
			版本3: 抽取工具类.


4. DBCP的原理
	采用 画图的方式 讲解.

	
	
5. Druid数据库连接池的使用
	//记忆: 所有的数据库连接池的根接口都是: DataSource
	版本1: 手动设置参数.
	版本2: 结合配置文件使用.
	版本3: 抽取工具类.
	
	
6. C3P0数据库连接池的使用
	//记忆: 所有的数据库连接池的根接口都是: DataSource
	版本1: 手动设置参数.
	版本2: 结合配置文件使用.
	版本3: 抽取工具类.
	
	
7. DBUtils简介:
	概述: 用来优化"JDBC核心操作步骤的", 将其从7步操作变为3步操作.
	
	步骤:
		1) 创建数据库连接池对象.
		2) 创建可以执行SQL语句的对象(QueryRunner).
			//将其(数据库连接池对象)作为参数传入QueryRunner类的构造方法, 创建QueryRunner类的对象.
		3) 执行SQL语句, 获取结果集.
		4) 操作结果集.
	
	QueryRunner类:
		//可以用来执行SQL语句.
		
		构造方法:
			public QueryRunner();
			public QueryRunner(DataSource ds);
		
		成员方法:
			int update(String sql,Object... obj);		//执行更新语句.
			*** query(String sql,ResultSetHandler rsh,Object... obj);	//执行查询语句.
				//ResultSetHandler是一个接口, 表示对结果集的处理方式. 
				//传入的子类不同, 结果集的类型也不同.
		
		//记忆: 可变参数的底层其实是一个: 数组.
		ResultSetHandler接口的子类:
			ArrayHandler		将结果集第一行转成对象数组		Object[]
			ArrayListHandler									List<Object[]>
					将结果集中的每一行数据都转成一个对象数组，再将转成的多个对象数组存放到List中

			BeanHandler			将结果集第一行数据封装到一个对应的业务类实例中
								//  new BeanHandler<业务类的类型>(业务类的字节码文件对象);
								//  new BeanHandler<Ledger>(Ledger.class);
			BeanListHandler		
					将结果集中的每一行数据都封装到一个对应的业务类实例中，再将多个业务类实例对象存放到List里。
					//  new BeanListHandler<业务类的类型>(业务类的字节码文件对象);
					//  new BeanListHandler<Ledger>(Ledger.class);
			MapHandler			将结果集中的第一行数据封装到一个Map中，key是列名 String ，value是对应的值 Object 
			MapListHandler		将结果集中的每一行数据都封装到一个Map里，然后再将多个Map存放到List

			ColumnListHandler	将结果集中的指定列的数据存储到List集合
				   //new ColumnListHandler<该列的类型_写的是引用类型>(列名);
				   //new ColumnListHandler<Double>("money");
			ScalarHandler		进行单值查询,如：select count(*) from	//一行一列
				//new ScalarHandler<该列的类型_写的是引用类型>(列名);
				//new ScalarHandler<Long>("counts");   求满足条件的数据共有多少行
			KeyedHandler		将结果集中的每一行数据都封装为一个Map(Map<String,Object>)，
								再将这些Map再存到一个Map里，其key为KeyedHandler指定的列，
								如果没有指定则使用第一个查询的字段。
				/*
							1		2															3		4	
					Map <String,Map<String,Object>> map= qr.query(conn, sql, new KeyedHandler<String>("lid"));

					1：代表的是 传入的指定的列名(要求不能重复，一般传的是主键)
					2：代表的是 数据库表中的每一行数据（列名做键，具体的数据做值）
					3：代表的是 传入的指定的列的 数据类型
					4：代表的是 传入的指定的列
				
				*/


***********************************************以下为扩展内容***********************************************

8. 自定义数据库连接池	
	版本1: 最基本的实现
		A: 自定义一个类(MyDataSource), 去实现 DataSource接口.
		B: 重写接口中所有的抽象方法.
		C: 在该类中完成对数据库连接池初始化的动作.
			public class MyDataSource{
				//1. 定义一个List<Connection>用于存储: 连接对象.
				
				//2. 在构造方法中, 完整数据库连接池的初始化动作
				//创建连接对象, 然后将其添加到List集合中.
				
				//3. 对外提供获取连接对象的方法.
				public Connection getConnection() {
					return list.remove(0);
				}
				
				//4. 对外提供 归还连接对象的方法.
				public void addBack(Connection conn) {
					list.add(conn);
				}
			}
			
	此时, 虽然我们实现了: 自定义数据库连接池, 但是有瑕疵. 此时我们用的归还连接的方法是我们自定义的方法.
	这样做不好, 需要让程序员记忆一些额外的API, 针对这个问题, 我们可以将Connection#close()方法的功能进行
	升级, 将其功能从 "销毁" 变为 "自动归还". 此时涉及到的问题是:
		如何升级某个类(或者接口)的某个具体方法(功能).
	
	解决方案有三种:
		A: 继承.
			好处: 提高代码的复用性.
			弊端: 类与类之间的耦合性增强了.
		B: 通过 装饰设计模式实现.
			好处: 降低了程序的耦合性.
			弊端: 代码量增加了. 需要对"不需要升级功能的方法"也进行重写.
				  //通过 适配器设计模式 解决上边这个问题.
		C: 通过 动态代理实现.
			好处: 更灵活, 可以直接升级某个类(接口)的某个具体方法.
				  //灵活就意味着代码量多, 目前我们只做了解.

	版本二: 通过 装饰设计模式实现. 
		设计模式:
			概述: 实际开发中, 我们发现项目中的好多模块是相似的, 于是我们把这些相似的模块抽取出来定义成模型, 
				  这样照着模型做出来的东西就是符合某种特定规则或者具有某些特性的, 这些模型就是: 设计模式.
				  //记忆: 设计模式一共有: 23种.
				  
				  //闫闳
				  
			分类:
				创建型:	 就是需要创建对象的.
					单例设计模式, 工厂设计模式.
				
				结构型:	 描述的是类与类之间的关系.
					装饰设计模式:	
						步骤:
							1. 在装饰类中获取被装饰类的应用.
							2. 在装饰类的构造方法中, 获取被装饰类的对象.
							3. 对"被装饰类的对象的"原有功能进行升级.
						记忆: 被装饰类的改变对装饰类没有影响.
					
					适配器设计模式:
						当接口中有多个抽象方法, 而我们只使用其中的部分方法时, 也需要对其他的抽象方法进行重写.
						针对这种情况, 我们可以定义一个抽象类去实现接口, 重写所有的抽象方法, 只不过方法体是空.
						这个抽象类就是: 适配器类.
						这种设计模式是: 适配器设计模式.
					
				
				行为型: 事物能够做什么. 
					模板方法设计模式
				  
			
			
	
	
	版本三: 通过 装饰设计模式 + 适配器设计模式 实现.
	
	
	
	
	准备工作:
		继承版: 对Student#code()功能进行升级.
		
		装饰设计模式版: 对Student#code()功能进行升级.
			Coder: 顶层接口
				Student:		//被装饰类.
				HeiMaStudent: 	//装饰类
				
			Reader:	顶层接口
				BufferedReader:
				FileReader:
				
			Connection: 顶层接口
				MySQLConnection 数据库厂商提供的Connection接口的子类.		//被装饰的类.
				MyConnection:								//装饰类
				
			List<Connection>	MySQLConnection		//之前的写法
			List<Connection>	MyConnection		//现在的写法
			
			MyConnection mc = new MyConnection(new MySQLConnection, list);
			
			conn.close();
			
			
		适配器设计模式案例:
			需求: 接口中有多个抽象方法, 但是我们只使用其中的部分抽象方法, 这个时候其他不用的方法也要重写.
			
			public interface Player{
				public abstract void 上单();
				
				public abstract void 中单();
				
				public abstract void ADC();
				
				public abstract void 辅助();
				
				public abstract void 打野();
				
				public abstract void 小学生();
			}
				
			public abstract class Wrapper_适配器类  implements Player{

				@Override
				public void 上单() {
				}

				@Override
				public void 中单() {
				}

				@Override
				public void ADC() {
				}

				@Override
				public void 辅助() {
				}

				@Override
				public void 打野() {
				}

				@Override
				public void 小学生() {
				}
			}
			
			public class JiaLe extends Wrapper_适配器类{
				@Override
				public void 打野() {
					System.out.println("打野抢Buff, 反被野怪杀");
				}
			}
	
	
	Studying接口:									Connection接口:
		Student:		//被装饰类						MySQL厂商提供的类: JDBCUtils.getConnection();
			
		HeiMaStudent:	//装饰类						MyConnection类
