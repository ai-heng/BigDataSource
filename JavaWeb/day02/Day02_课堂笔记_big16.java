今日大纲:
	1. truncate table  和 delete from 区别?
	
	2. 约束的演示(主外键约束)
	
	3. SQLYog工具(MySQL的图形化界面)
	
	4. 多表查询
		多表设计分析
		多表设计原理
		多表设计案例: 购物商城.
		多表查询:		//重点掌握
			交叉查询:
			
			
			连接查询:
				内连接查询:
					显式内连接查询:
					
					
					隐式内连接查询:
					
				外连接查询:
					左外连接:
					
					右外连接:
			
			
			子查询:
				//in, any, all
		
	5. 事务


今日具体内容:
1. truncate table  和 delete from 区别?
	//truncate(重置),  delete(删除表数据), drop(删除数据库, 数据表)
	truncate table:
		可以清除数据, 而且会重置Id, 相当于是: 把表摧毁了, 然后创建一张和该表一模一样的表.
		属于DDL语句, 不可以结合 事务使用.
	
	delete from:
		可以清除数据, 但是不会重置id.
		属于DML语句, 可以结合 事务 使用.


2. 约束的演示(主外键约束)
	概述(作用):
		约束是用来保证数据的完整性和安全性的.

	分类:
		单表约束:
			主键约束: 	
				primary key 	//auto_increment
			唯一约束:
				unique
			非空约束
				not null
				
		多表约束:
			主外键约束:
				foreign key 
			格式:
				alter table 数据表A add foreign key(列名) references 数据表B(列名);
				/*
							外键表(从建表)		外键列				  主键表(主键列)
							员工表									  部门表
							
					总结:
						外表的外键列不能出现主表的主键列没有的内容(数据).
				*/
			
	案例: 裁部门.
		现实中的逻辑: 
			先裁员, 再裁部门.
			//只要这个部门有员工, 那么这个部门就不能解散.
			
		代码实现:
			#创建部门表
				create table category(
					cid int primary key auto_increment,
					cname varchar(20)
				);
				insert into category values(null,'人事部'),(null,'研发部'),(null,'财务部'),(null,'设计部');
				#insert into category values(3,'财务部'),(4,'设计部');
			
			
			#创建员工表:
				create table employee(
					eid int primary key auto_increment,
					ename varchar(20),
					gender varchar(10),
					salary double,
					eno int					#这个字段表示, 员工所属的部门
				);
				insert into employee values(null,'芳芳','女',100,1);
				insert into employee values(null,'项羽','男',18000,2);
				insert into employee values(null,'虞姬','女',3000,1);
				insert into employee values(null,'哈撒给','男',6000,3);
		

3. SQLYog工具(MySQL的图形化界面)
	创建数据库
	创建数据表
	对表数据的CURD
	添加和删除约束
	查看架构设计器
	删除数据表
	删除数据库
	备份数据库
	
	
4. 多表设计分析			//理解
	一对多的关系:
		一个部门可以有多名员工, 一名员工只能属于一个部门.
			班级		  学生
			用户		  订单
			分类表		  商品表
	
	多对多的关系:
		一名老师可以有多名学生, 一名学生也可以有多名老师.
			学生		  选修课
			订单		  商品
		
	
	一对一的关系:
		//实际开发中, 遇到这种需求了, 一般我们是把数据放到一张表中的. 
		一个公司只能对应一个注册地址.
		一个人只能有一个身份证号.


5. 多表设计原理
	一对多的关系:
		//一个部门可以有多名员工, 一名员工只能属于一个部门.
		//部门表(category),  员工表(employee)
		原则:
			在"多"的一方新建列(外键列), 关联"一"的一方的列(主键列).
			
	多对多的关系:
		//学生(student)		  选修课(course)
		原则:
			需要创建第三张表(中间表), 该表至少有两列(外键列), 分别取关联"多"的两方的列(主键列).
	

	一对一的关系:
		//公司表(company), 注册地址表(address)
		
		原则:
			唯一外键约束:
			
			
			主键对应
		


6. 多表设计案例
	用户表:
	订单表:
	商品表:
	分类表:




7. 多表查询:			//重点掌握
	分类:
		交叉查询:	//查询结果是多张表的 笛卡尔积. 即: 表A的总条数 * 表B的总条数,   无意义, 一般不用.
			select * from 表A,表B;
		
		连接查询:
			内连接查询:	inner join
				显示内连接:
					select * from 表A inner join 表B on 条件;
					//select * from 表A join 表B on 条件;
					
				隐式内连接:
					select * from 表A,表B where 条件;
			
			外连接查询: outer join
				左外连接查询:
					select * from 表A left outer join 表B on 条件;
					//select * from 表A left join 表B on 条件;
				
				右外连接查询:
					select * from 表A right outer join 表B on 条件;
					//select * from 表A right join 表B on 条件;
	
	
		子查询:
			//in, any, all


8. 事务
	要求:
		能用Java代码操作事务即可.	
			
		今天讲事务是为了个这个需求做铺垫, 也就是说, 今天讲解的事务的内容, 能理解即可.	
	
	记忆:
		1. MySQL默认开启了事务的自动提交功能, Oracle没有, 需要手动开启.
			//SHOW VARIABLES LIKE '%commit%';		//查看是否开启了事务的自动提交功能.
		2. MySQL的默认隔离级别是:		repeatable read
			//select @@tx_isolation;				//查看事务的隔离级别.
			//set session transaction isolation level 指定的隔离级别;
		   Oracle的默认隔离级别是:		read committed
		
	
	概述:
		事务指的是逻辑上的一组操作, 组成该操作的各个逻辑单元, 要么全部成功, 要么全部失败.
		
	案例:
		//模拟转账   项羽 --> 虞姬 转 1000
		
		开启事务;
		项羽 - 1000		//update account set money = money - 1000 where aid = 1;
		sop(1/0);
		虞姬 + 1000
		
		如果全部执行成功, 提交事务.	
		但凡有一个执行失败, 事务回滚(会把数据还原到事务开始执行之前的状态)
		
		
	特点:
		1. 原子性.
		2. 一致性.
		3. 隔离性.
		4. 持久性.
	
	如果不考虑隔离性, 就有可能引发安全问题:
		关于读的问题:
			脏读:
				一个事务读取到了另一个事务还没有提交的数据.
				
			不可重复读:
				一个事务读取到了另一个事务已经提交的: 修改数据.
				导致多次查询结果不一致.
			
			虚读(幻读): 
				一个事务读取到了另一个事务已经提交的: 添加数据.
				导致多次查询结果不一致.
		
		关于写的问题:
			丢失更新.

	
	其实所谓的考虑"隔离性"其实就是在设置隔离级别:
		隔离级别的范文从小到大分别是:
			read uncommitted < read committed < repeatable read < Serializable
			
		安全性从小到大分别是: 
			read uncommitted < read committed < repeatable read < Serializable
			
		效率从大到小分别是:
			read uncommitted > read committed > repeatable read > Serializable

		
		read uncommitted: 可能发生脏读, 不可重复读, 虚读.
		read committed:	  能规避脏读, 但是可能发生不可重复读, 虚读.
		repeatable read:  能规避脏读, 不可重复读, 但是可能发生虚读.
		Serializable:	  能规避脏读, 不可重复读, 虚读.



	演示:
		演示"脏读"的产生:
			1. 开启两个cmd窗口A, B.
			2. 查看当前的事务的隔离级别:
				select @@tx_isolation
				//默认为: repeatable read
			3. 将A窗口的隔离级别修改为: read uncommitted;
				set session transaction isolation level read uncommitted;
			4. 再次查看下两个窗口的的隔离级别:
				select @@tx_isolation;
			5. 在A, B两个窗口中分别开启事务:
			6. 在B窗口中完成转账.
				//注意: 先不要提交事务.
			7. 在A窗口中进行查询.
				//发现转账已经成功, 说明脏读已经发生了.
				//脏读: 一个事物读取到另一个事务未提交的数据.
			
		
		演示"不可重复读"的产生:
			1. 开启两个cmd窗口A, B.
			2. 查看当前的事务的隔离级别:
				select @@tx_isolation
				//默认为: repeatable read
			3. 将A窗口的隔离级别修改为: read committed;
				set session transaction isolation level read committed;
			4. 再次查看下两个窗口的的隔离级别:
				select @@tx_isolation;
			5. 在A, B两个窗口中分别开启事务:
			6. 在B窗口中完成转账.
				//注意: 先不要提交事务.
			7. 在A窗口中进行查询.
				//发现A窗口中的数据没有变化, 说明脏读没有发生.
				//脏读: 一个事物读取到另一个事务未提交的数据.
			8. 在B窗口中提交事务.
				//发现A窗口中的数据已经变化了, 说明"不可重复读"已经产生了,
				//不可重复读: 指的是一个事务读到了另一个事务已经提交的 update的数据, 
				//导致多次查询结果不一致.
			
		避免演示"不可重复读"的产生:
			1. 开启两个cmd窗口A, B.
			2. 查看当前的事务的隔离级别:
				select @@tx_isolation
				//默认为: repeatable read
			3. 将A窗口的隔离级别修改为: repeatable read;
				set session transaction isolation level repeatable read;
			4. 再次查看下两个窗口的的隔离级别:
				select @@tx_isolation;
			5. 在A, B两个窗口中分别开启事务:
			6. 在B窗口中完成转账.
				//主要: 先不要提交事务.
			7. 在A窗口中进行查询.
				//发现A窗口中的数据没有变化, 说明脏读没有发生.
				//脏读: 一个事物读取到另一个事务未提交的数据.
			8. 在B窗口中提交事务.
				//发现A窗口中的数据已经变化了, 说明"不可重复读"已经产生了,
				//不可重复读: 指的是一个事务读到了另一个事务已经提交的 update的数据, 
				//导致多次查询结果不一致.	
			
		演示: Serializable 串行化的







