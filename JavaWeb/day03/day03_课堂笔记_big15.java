今日内容大纲:
	JDBC:
		Java Data Base Connectivity, Java数据库连接(技术).
		//大白话: 就是用Java语言来操作不同的数据库(DBMS)的类库.
		//核心7步
		
	抽取工具类: JDBCUtils
		方式一: 普通抽取.
		
		方式二: 结合Properties配置文件的抽取.		//掌握
		
	SQL注入攻击:
		SQL语句演示该问题:
		
		Java代码演示该问题:
		
		解决SQL注入攻击:








今日具体内容:
1. JDBC简介(//核心7步)
	概述:		
		Java Data Base Connectivity, Java数据库连接(技术).
		//大白话: 就是用Java语言来操作不同的数据库(DBMS)的类库.
		/*
			接口: Connection, Statement, PreparedStatement, ResultSet, Driver
			类:  DriverManager, Driver
		*/
		
		/*
			集合: 就是Java用来存储不同类型数据的容器, 本质就是一坨类和接口.
				接口: Collection, Set, List, Map
				类:   ArrayList, HashSet, HashMap
				
			IO流: 就是Java用来操作文件(夹)的类库, 本质就是一坨类和接口.
				接口: Serializable接口
				类: InputStream, OutputStream, Writer, Reader
					FileInputStream, FileOutputStream
					
			记忆:
				集合的顶层都是接口, IO流的顶层都是抽象类.
		
		*/
	核心功能(核心步骤):
		1. 连接数据库.
		2. 向数据库发送指令(SQL语句).
		3. 操作数据库返回的结果集.
			A: 如果执行的是更新语句, 返回的结果集是: int
			B: 如果执行的是查询语句, 返回的结果集是: ResultSet


2. 什么是驱动?
	就是设备间进行通信的桥梁.
	
	
3. JDBC的原理
	我们知道JDBC是用来操作不同数据库(DBMS)的, 但是操作不同的数据库需要使用不同的驱动.例如: 我们想操作MySQL数据库, 就需要安装MySQL的驱动, 我们想操作Oracle数据库, 就需要安装Oracle数据库的驱动, 如果我们操作SQLServer数据库,
	就需要安装SQLServer数据库的驱动, 这样做是比较麻烦的. 因为Java已经提供了大量的类和接口了, 但是要要求额外记忆一些
	其他的类和接口, 这样就增加了程序员的学习难度. 
	后来Sun公司发现了这个问题, 就和各大数据库生产商协商决定, 由Sun公司提供统一的规范(就是一些类和接口), 数据库生产商提供具体的实现. Sun公司提供的这些类和接口就是: JDBC.


4. JDBC的代码演示
	A: 创建一个数据库web03.
	B: 在数据库web03中创建一个表(users);
		create table users(
			uid int primary key auto_increment;
			username varchar(20),
			password varchar(20)
		);
	C: 往数据表中添加数据.
		insert into user values(null,'admin01','pw111');
		insert into user values(null,'admin02','pw222');
		insert into user values(null,'admin03','pw333');
		insert into user values(null,'admin04','pw444');
		
	D: 通过JDBC操作表数据.
		1) 导入驱动.
			A: 在项目下新建一个文件夹: lib
			B: 把要使用的jar包拷贝到: lib文件夹中.
			C: 给项目添加依赖.
		2) 注册驱动.
		3) 获取连接对象.
		4) 根据连接对象, 获取可以执行SQL语句的对象.
		5) 执行SQL语句, 获取结果集.
			A: 如果执行的是更新语句, 返回的结果集是: int
			B: 如果执行的是查询语句, 返回的结果集是: ResultSet
		6) 操作结果集.
		7) 释放资源.
		
		
5. JDBC的API详解之: DriverManager
	DriverManager: 主要是用于驱动管理.
		功能一:	注册驱动.
			public static void registerDriver(Driver driver);		//根据传入的驱动对象, 注册驱动.
			//DriverManager.registerDriver(new Driver());
			//			MySQL提供的驱动类				  Sun公司提供的驱动接口
			public class com.mysql.jdbc.Driver implements java.sql.Driver{
				
			}
			//上述的注册驱动的方式, 我们不用, 因为会导致驱动注册两次.
			//因为注册驱动的操作是写在com.mysql.jdbc.Driver类的静态代码块中的, 所以只要该Driver类一加载, 就完成了注册驱动的操作
			//于是我们的需求就变更为: 只要把Driver的字节码加载到内存即可.
			
			Class.forName("全类名");
			
		
		功能二: 可以获取连接对象.
			public static Connection getConnection(String url,String username, String password);	//获取连接对象.
			//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/web03", "root", "123");
			/*
				参数解释:
					url: 		数据库连接字符串.
						格式:
							专业话述: 协议:子协议://要连接的DBMS的ip或者名字:端口号/要操作的具体的数据库
							大白话:	  连接方式:要连接的DBMS://要连接的DBMS的ip或者名字:端口号/要操作的具体的数据库 	
							
						示例:	//以操作本地数据库为例
							jdbc:mysql://127.0.0.1:3306/web03
							jdbc:mysql://localhost:3306/web03
							jdbc:mysql:///web03
					
					username:	要连接的数据库的账号.
					password:	要连接的数据库的密码.
			*/
	
	
6. JDBC的API详解之: Connection
	Connection接口: 连接对象, 可以理解为是: 数据库和Java代码之间的通信使者.
	功能一:	获取可以执行SQL语句的对象.
		public Statement createStatement();						//获取可以执行SQL语句的对象.
		public PreparedStatement prepareStatement(String sql);	//获取可以执行SQL语句的对象, 可以进行预编译.
																//能解决SQL注入攻击问题.
		
		// Statement stat = conn.createStatement();
	
	
	功能二: 可以进行事务管理.	//明天讲.


7. JDBC的API详解之: Statement	
	Statement: 可以执行SQL语句的对象
	
	功能一: 执行SQL语句, 获取结果集.
		public ResultSet executeQuery(String sql);		//执行查询语句
		public int executeUpdate(String sql);			//执行更新语句
		
		 //ResultSet rs = stat.executeQuery(sql);
	
	功能二: 可以进行批处理.			//明天讲


8. JDBC的API详解之: ResultSet
	ResultSet: 表示查询语句的结果集.
		public boolean next();		//判断结果集中是否有数据
		
		public Xxx getXxx(int columnNumber);	//根据列的编号获取该列的值, Xxx是数据类型的意思.	编号从1开始
		public Xxx getXxx(String columnName);	//根据列的名字获取该列的值, Xxx是数据类型的意思.	//推荐


9. JDBC的CURD操作
	//参见:  7. JDBC的API详解之: Statement	
	
	
10. JDBC的释放资源的代码优化


11. JDBCUtils工具类的抽取
	方式一: 普通抽取	
		public class JDBCUtils {
			//1. 构造私有.
			
			//2. 注册驱动, 静态代码块实现.
			
			//3. 获取连接对象.
			
			//4. 释放资源.    try-catch-finally 语句的嵌套实现.
		}
		
		此时, 虽然我们已经成功的抽取出来了JDBCUtils工具类, 但是和一个开发原则相违背"对修改关闭, 对扩展开放".
		例如: 如果我们想操作web05这个数据库了, 就得修改工具类中url的写法, 如果我们操作的数据库的用户名和密码
		改变了, 我们也得修改工具类中username,password的写法, 这样做扩展性较差.
		于是, 我们就想着如何解决这个问题?
		
		能不能创建一个文件(配置文件), 里边记录的是各项配置信息, 然后由工具类读取该配置文件的信息即可.
		这个配置文件就是:  **.properties
		
		
		Properties集合类:
			概述:  它是一个双列集合, 键值都是String类型, 它是Hashtable集合的子类.
					//记忆: Properties集合是唯一可以直接和IO流相结合使用的集合类.
					//它可以直接从流中读取数据, 也可以直接写数据到流中.
					
			成员方法:
				public void load(InputStream is);			//从流中读取数据
				public void load(Reader r);					//从流中读取数据
				
				public void store(OutputStream os);			//写数据到流中
				public void store(Writer w);				//写数据到流中
				
				public String getProperty(String key);				//根据键获取值
				public void setProperty(String key,String value);	//设置键值对
			
			
			
		
			面试题:
				Hashtable和HashMap的区别?
					HashMap: 线程不安全, 效率高, 可以存null值和null键.
						     JDK1.2出来来.
					Hashtable: 线程安全, 效率低. 不可以存null值和null键.
							 JDK1.0出来的.
					整个Java命名规范是从: JDK1.2开始完善的.
	
	
	方式二: 结合配置文件的使用
		public class JDBCUtils {
			//1. 构造私有.
			
			//2. 定义变量, 记录配置文件的信息.
			
			//3. 读取配置文件, 并将读取到的值赋值给变量.
			
			//4. 注册驱动, 静态代码块实现.
			
			//5. 获取连接对象.
			
			//6. 释放资源.    try-catch-finally 语句的嵌套实现.
		}

	
12. SQL注入攻击问题	
	概述:
	
	
	代码演示SQL注入攻击问题:
	
	
	解决方案: PreparedStatement接口的预编译, 占位符.









	
