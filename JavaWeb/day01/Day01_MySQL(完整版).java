数据库:
	MySQL: 基础, 单表.
	MySQL: 表设计, 多表.
	
	JDBC: 核心7步, 工具类(Properties). 
	DBCP(效率), DBUtils
	
1. 你知道的存储数据的方式有几种?
	变量, 常量, 数组, 集合: 可以对数据进行临时性存储, 程序执行结束后数据就丢失了.
	IO流: 可以对数据进行永久性存储, 不方便用户进行精细化管理.
	数据库: 就是存储数据的仓库, 其本质是一个文件系统, 可以有规律的对数据进行存储, 方便用户进行增删改查.
		//增删改查: CURD(create, update,read,delete)
		//数据库才是实际开发中我们真正存储数据的地方.
	
	
2. 我们常说的数据库其实指的是数据库管理系统(DBMS), 数据库管理系统和数据库之间有什么关系?
	数据库管理系统: DataBase Management System
		类似于: Eclipse
	数据库:
		类似于:	Eclipse中的项目
	
	数据表:
		类似于: Java(项目)中的类
	
	数据表中的数据: 
		类似于: Java中的实体对象.


3. 常见的数据库管理系统(DBMS)有哪些?
	MySQL, Oracle, SQLServer, DB2, SyBase, SQLite.
	
	
4. 我们常用的这些数据库管理系统都是: 关系型数据库, 那么什么是关系型数据库呢?
	所谓的关系型数据库: 其实描述的就是实体与实体之间的关系.
		
	ER模型图(Entity Relational Model)
		实体: 矩形
		属性: 椭圆形
		关系: 菱形
	
	
5. MySQL的安装和卸载:
	安装:
		A: 安装之前关闭防火墙.
		B: 最好不要直接安装到盘符根目录下.
		C: 安装路径最好不要出现中文, 空格, 特殊符号等.
	
	卸载:
		A: 卸载之前一定要备份数据.
			//直接把data文件夹给复制一遍即可.
		B: 不要直接删除MySQL文件夹.
		C: 可以采用MYSQL自带的卸载程序进行卸载.
		D: 在控制面板中进行删除.			//推荐
		

6. MySQL的登陆
	方式一:
		window徽标键 + 字母r --> cmd --> mysql -u root -p --> 回车 --> 录入密码 --> 回车
	
	方式二:
		window徽标键 + 字母r --> cmd --> mysql -u用户名 -p密码 --> 回车
		
	登陆数据库的时候有可能遇到的问题:
		using password yes:  录入的用户名或者密码错误. 
		10061: mysql服务没有开启.
			开启MySQL服务:	net start mysql
			关闭MySQL服务:  net stop mysql
			
			打开"服务"界面: services.msc

7. SQL语句
	概述:
		SQL: Structured Query Language, 结构化查询语言.
			//人和数据库之间进行交互的语言.
	分类:
		DDL: 数据定义语言. 主要指的是操作数据库, 操作数据表, 增加列.
			//create, drop, alter
		DML: 数据操作语言. 主要指的是操作数据, 增删改.
			//SQL语句中,把对数据的增删改操作合称为: 更新语句.
			//DML语句可以和 事务 相结合使用.
			事务:
				佳乐10000, 凤姐10000
				
				开启事务
					佳乐 - 1000
					sop(1/0);
					凤姐 + 1000
				提交事务: commit
				事务回滚: rollback
			
		DCL: 数据控制语言. 主要指的是 创建用户, 设置权限, 设置安全级别.
		DQL: 数据查询语言. 主要指的是操作数据: 查询.
			//select, from, where  
			
使用SQL语句时的注意事项:
	A: SQL语句不区分大小写, 建议关键字大写,其他小写.
	B: 我们今天写数据类型的时候要注意, Java中的String类型, 对应的是数据库中的 varchar(长度).
	C. 值的个数必须和列的个数对应.
	D. 值的类型和列的类型也必须对应.
	E. 如果是数字类型可以直接写, 其他类型用''括起来.
	F. SQL语句的结束标记是: 分号;
	G. 进行删除和修改操作之前, 一定一定一定要备份.
	
8. SQL语句操作数据库(CURD)
	增:
		创建数据库:  create database 数据库名;
	删:
		删除数据库:  drop database 数据库名;
	改:
		修改数据库的码表:
			alter database 数据库名 charset 指定的字符集;
			alter database 数据库名 character set 指定的字符集;
	查:
		查询所有的数据库
			show databases;
		查询指定数据库(字符集)
			show create database 数据库名;
	使用指定的数据库(切换库):
		use 数据库名;
	

9. SQL语句操作数据表
	增:		
		创建数据表:			//掌握
			create table 数据表名(
				列名1 数据类型 [约束],
				列名2 数据类型 [约束],
				列名3 数据类型 [约束]
			
			);
			数据类型:
				Java中的数据类型			MySQL中的数据类型
				byte/short/int/long			tinyint/smallint/int/long
				float/double				float/double
				char/String					char/varchar(长度)
				Date						Date/Time/DateTime/StampDate
											DateTime: 可以自定义时间.
											StampDate: 时间戳, 采用当前系统的默认时间.
											
				File						BLOB/TEXT(CLOB)
				
			约束
				作用: 用来保证数据的完整性和安全性.
				分类: 
					单表约束:
						主键约束: primary key		//auto_increment(自动增长)
						唯一约束: unique
						非空约束: not null
					多表约束:	
						外键约束: foreign key
		
		创建用户表:
			create table users(
				uid int primary key auto_increment,
				uname varchar(20),
				pw varchar(20)
			);

			
	删:
		删除数据表: drop table 数据表名;
	改:		//了解
		给表增加一列字段
			alter table 表名 add 列名 数据类型 约束;
		修改某列字段的约束和类型
			alter table 表名 modify 列名 数据类型 约束;
		修改某列字段的名字,约束,类型
			alter table 表名 change 旧列名 新列名 数据类型 约束;
		删除指定的列
			alter table 表名 drop 列名;
		修改表名
			rename table 旧表名 to 新表名;
		修改表的码表
			alter table 表名 character set 指定的码表;
			alter table 表名 charset 指定的码表;
		
	查:
		查询所有的数据表
			show tables;
		
		查询指定数据表(表结构)
			desc 数据表名;

10. SQL语句操作数据表中的数据
	增:
		添加一条数据:
			insert into 数据表名(列名1,列名2,列名3) values(值1,值2,值3);
			//insert into users(uid,uname,pw) values(1,'jiale','a123');
		
		批量添加: //添加多条数据
			insert into 数据表名(列名1,列名2,列名3) values(值1,值2,值3),(值1,值2,值3),(值1,值2,值3);
			insert into users(uid,uname,pw) values(1,'jiale','a123'),(2,'fengjie','a123'),(3,'furongjiejie','a123');
			
		实际开发中的写法:
			insert into users values(null,'jiale','a123');
			
		通过"DOS命令窗口"往MySQL中添加中文, 然后查看的时候发现会出现乱码情况, 为什么?		//面试题
			因为控制台默认码表是: GBK, MySQL的服务器端和客户端的默认码表都是: UTF8, 所以会出现乱码.
			
			解决方案:
				方式一:  临时性的把 MySQL的客户端的码表设置为: gbk
					set names 'gbk';
				
				方式二:  永久性设置, 在my.ini配置文件中, 将client的码表改为: GBK.
			
	删:
		delete from 数据表名 where 条件;
		
	改:
		update 数据表名 set 列名1=值,列名2=值,列名3=值 where 条件;
		
		备份数据: 			//理解, 只能备份数据, 不能备份主键.
			备份表不存在:
				create table 备份表名 select * from 要备份的表名;
			
			备份表已经存在:
				insert into 备份表名 select * from 要备份的表名;
			
	查:
		最基本的查询:
			select * from 数据表名;
			select 列名1,列名2,列名3 from 数据表名;

		带别名的查询:  
			关键字 as.	
		
		带条件的查询:
			需求: 成绩表exam(eid,ename,chinese,math,english)
			create table exam(
				eid int primary key auto_increment,
				ename varchar(20) not null,
				chinese int  not null,
				math int  not null,
				english int  not null
				
			);
			insert into exam values(null,'佳乐', 59,59,59),(null,'佳乐', 59,59,59),(null,'佳乐', 59,59,59);
			
			分类:
				1. 条件运算符
					>,<, >=, <=, =, !=(<>)
					select * from exam where eid>=2;
				2. 区间(范围)运算符
					between 值1  and 值2;
					select * from exam where eid between 3 and 5;
				3. 逻辑运算符
					and or not
					select * from exam where eid=3 or eid=4 or eid=5;
				4. 固定值的查询
					in (值1,值2,值3)
					select * from exam where eid in (1,3,5);
					select * from exam where eid%2 != 0;
				5. 模糊查询
					like 条件.
					//一般会结合占位符使用.
					//_占一个位置  %占多个位置
					select * from exam where ename like '张_';
					select * from exam where ename like '张%';
					select * from exam where ename like '%张%';
		
		排序查询:
			关键字: order by 要排序的列 [asc/desc];
			//asc表示升序, 但是程序默认是升序, 所以asc可以省略不写. desc表示降序.
			//无论一个SQL语句简单还是复杂, 排序语句必须放在整个SQL语句的最后边.
			
			//需求: 查找所有语文成绩及格的学生信息, 并且按照语文成绩进行降序排列,
			//	    如果语文成绩一样, 按照数学成绩升序排列.
			select * from exam where chinese >= 60 order by chinese desc,math asc;
		
		聚合函数:
			count()	//一般用于计算数据一共有多少条.
				 select count(*) from exam;
			max()
			min()
			avg()	//平均值有可能是一个小数.
			sum()
			
			//where 条件后边不能跟 聚合函数
		
		分组查询:
			关键字: group by 要分组的列.
			已知: 创建一个商品表: product
				create table product(
					pid int primary key auto_increment,
					pname varchar(20),
					price double
				);
				insert into product values(null,'冰箱',2000),
				(null,'冰箱',1000),
				(null,'冰箱',1500),
				(null,'洗衣机',2000),
				(null,'电视机',3000),
				(null,'洗衣机',1000),
				(null,'电视机',10000);
	
			需求:
				1. 统计每类商品的个数.
					select pname,count(*) from product group by pname;
				2. 统计每类商品的总金额.
					select pname,sum(price) from product group by pname;
				3. 统计每类商品的总金额, 并且总金额大于4000	
					select pname,sum(price) from product group by pname having sum(price)>4000;
					select pname,sum(price) as sp from product group by pname having sp > 4000;
					select pname,sum(price) sp from product group by pname having sp > 4000;
				4. 统计每类商品的总金额, 并且总金额大于4000, 然后按照总金额进行降序排列.	
					select pname,sum(price) sp from product group by pname having sp > 4000 order by sp desc;
					
					
					
					
				5. 统计每类商品的总金额, 并且总金额大于2000, 然后按照总金额进行降序排列,
				   只统计单价在1500(包括)以上的商品.
					 select pname,sum(price) sp from product where price>=1500 
					 group by pname having sp >2000 order by sp desc;
				
				一个完整的SQL查询语句的格式:
					select 列名1,列名2,列名3 from 数据表名 where 分组前的条件筛选 group by 要分组的列 
					having 分组后的条件筛选 order by 排序的列 [asc/desc];
					

	
	
	
面试题:
	1. delete from 和 truncate table 都可以删除表中的数据, 这两种删除方式之间有什么区别?
		delete from: 
			清空表中的数据, id不会重置.
			属于DML语句, 可以和 事务 结合使用.
		truncate table:
			相当于把表给删除, 然后再创建一张一模一样的表出来.		//可以理解为: id会重置.
			属于DDL语句, 不可以和 事务 结合使用.

	2. where 和 having 之间有什么区别?
		where: 用于做分组前的条件筛选, 后边不能跟聚合函数.
		having: 用于做分组后的条件筛选, 后边可以跟聚合函数.

		
		
		
		
		
		
		
		
		
		
		
		
		
		






