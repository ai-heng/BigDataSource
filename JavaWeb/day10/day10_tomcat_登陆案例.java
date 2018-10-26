1. 课程简介
	JDBC接口: Java代码和数据库之间交互的规则.
	Servlet接口: 服务器软件和Java代码之间交互的规则.
	Http协议: 浏览器和服务器软件之间交互的规则.
	
2. Web开发的常用概念
	Web资源: 
		存在于Web服务器, 供外界访问的资源就是Web资源.
		//例如: 存在于Web服务器内部的: html,js,图片, 视频等资源.
		
		
		分类:
			静态资源: 指web页面中供人们浏览的数据是始终不变的.
				//例如: 图片, 视频, 音频, html文件, js文件等.
				//例如：优酷上挂的电影，我们之前写的html页面。
			
			动态资源: 指web页面中供人们浏览的数据是由程序产生的, 不同的时间点访问web页面看到的内容各不相同. 
				//Javaweb领域的动态资源: 指通过Java代码生成html, 例如: JSP/Servlet, ASP, PHP等.
				//例如：12306买票：不同时刻票数不同。
				
	常用的Web服务器：
		Tomcat：它是一个免费，开源的web服务器，支持servlet规范和jsp规范，它不支持JavaEE的13种规范， 所属公司为： Apache公司。
		//tomcat软件早期属于sun公司，是sun公司的架构师詹姆斯·邓肯·戴维森开发的，后来sun公司为了推动Java语言的发展，无偿将Tomcat捐助给Apache公司。
		Weblogic： 大型的收费服务器， 它完美支持JavaEE的所有规范，所属公司：Oracle。
		//如果将来想自己开公司, 可以看下Oracle公司的发展史, 会有帮助的.
		Websphere：大型的收费服务器，它完美支持JavaEE的所有规范，所属公司： IBM。
		JBOSS: 
			
	
3. tomcat的安装和关闭
	下载:
		http://tomcat.apache.org
		
	tomcat文件夹中的各个文件夹解释:
		bin: 里边记录的是tomcat的一些指令.
			//掌握: startup.bat, shutdown.bat
		conf: 配置文件.
			//掌握: server.xml, web.xml
		libs: 引入的jar包.
		logs: 日志文件
		temp: 临时文件.
		webapps: 里边放的是我们写的Java项目
		work: 和JSP相关的.	//目前先了解, Day13讲解.

	  
		1. tomcat是绿色版软件, 解压直接使用.
		2. 找到tomcat\bin\startup.bat, 双击运行.
		3. 打开浏览器, 输入 ip:端口号, 如果提示tomcat页面则说明安装成功.
			/*
				例如: 192.168.81.66:8080
				如果操作本机, 可以下如下的形式:
					127.0.0.1:8080
					localhost:8080
			*/
		//注意: 安装路径不要出现中文,空格,特殊符号等.	

	
	遇到的问题:
		1) 发生闪退: 
			没有配置JAVA_HOME环境变量, 配置下即可.
		2) 端口号被占用了
			方式一: 
				A: 在DOS命令窗口中输入: netstat -nao, 查找占用该端口号的程序的 pid值.
				B: 打开任务管理器, 选择"详细信息", 找到该pid值对象的应用程序.
				C: 关闭该应用程序, 然后重新开启tomcat程序即可.
				
			方式二:
				A: 找到tomcat\conf\server.xml文件.
				B: 修改端口号即可.
	
	
4. tomcat发布项目
	直接把项目复制到: tomcat\webapps文件夹中即可.
	
	然后在浏览器中输入: http://IP:端口号/项目名/指定的html页面,  即可访问指定的页面.
	
	
	
	
5. Idea集成tomcat及添加依赖.
	//详见文档.
	
6. Servlet的快速入门
	Servlet概述: 服务器认识Java代码的规则.
		
	步骤:	//大白话: 就是掩饰浏览器访问Java代码
		1) 新建一个类(HelloServlet)实现Servlet接口.
			//该类可以放在 com.itheima.web包下(后边讲分层详细讲解)
		2) 重写接口中所有的抽象方法.
			//在service()方法中, 给浏览器写一句回执信息(先不要写中文).
			response.getWriter().print("this is HelloServlet' Method" + new Date().toLocaleString());
		3) 在web.xml中 注册和映射.
			<!-- 确定访问的Java代码 -->
				<servlet>
					<!-- 起别名,可以随便写 -->
					<servlet-name>abc</servlet-name>
					<!-- 确定唯一的Java代码, 要写全类名 -->
					<servlet-class>com.itheima.web.HelloServlet</servlet-class>
				</servlet>
			  
			<!-- 确定浏览器访问Java代码的路径 -->
				<servlet-mapping>
					<!-- 起别名, 要和上边的别名一致 -->
					<servlet-name>abc</servlet-name>
					<!-- 
						第一个"/"表示:         http://ip:端口号/项目名/  
						"/helloServlet"表示:  http://ip:端口号/项目名/HelloServlet
						-->
					<url-pattern>/HelloServlet</url-pattern>
				</servlet-mapping>
			
	注意: 
		request: 请求, 浏览器给服务器传输的数据.
		response: 响应, 服务器给浏览器传输的数据.
		
		ctrl + shift + 字母R: 可以快速搜素项目下的文件.
		
	
7. Servlet的细节:
	1) 根据ip和端口号, 找到对应的软件: tomcat.
	2) tomcat根据项目名找到对应的项目, 进而可以找到web.xml文件.
	3) 再根据web.xml文件中的资源路径找到对应类的全路径.
	4) 服务器将其(第三步)找到的 全路径的类.
	
	
8. Servlet的生命周期
	1) 构造Servlet, 然后使用init方法将其初始化.
	2) 处理来自客户端的对 service()方法的所有调用.
	3) 从服务中取出Servlet, 然后使用destroy()方法销毁它, 
	   最后进行垃圾回收并终止它.
	
	
	规律:
		1) 每次访问Servlet, 都会调用service()方法.
		2) 第一次访问, 会调用构造和初始化方法, 只会调用一次.
		3) 当前Servlet类被销毁时才会调用销毁方法.
	
	
9. servlet和httpServlet的关系
	每次我们都需要新建一个类, 然后去实现Servlet接口, 重写接口中所有的方法, 最后在配置web.xml文件. 这样做比较麻烦, 我们就想着, 能不能优化这个步骤呢?
	新建一个 servlet即可(程序会自动让该类去继承HttpServlet, 然后自动配置web.xml文件). 
	
	关系:
		Servlet接口:		
			//定义了服务器和Java代码交互的规则
		
		GenericServlet类:	
			//一般的servlet, 只是实现了方法, 注意: 不针对任何协议.
		
		HTTPServlet类:
			//针对HTTP协议做的实现.
			//HTTP有8种不同的请求方式, 其中get和post是最常见的请求方式.
	
		自定义的Servlet:  
			//例如:Demo1Servlet类
			//只需要重写: doGet()方法和doPost()方法即可.
	
	
		service()方法和 doGet(),doPost()方法的联系?
			1. 在service()方法中, 获取请求的方式.
			2. 判断:
				如果是get请求方式, 调用doGet()方法.
				如果是post请求方式, 调用doPost()方法.
	
	
10. 给浏览器响应中文内容	
	doGet()方法:
		作用: 处理get方式的请求
		
		哪些请求方式属于get方式?
			1. <form>表单, method="get"
			2. 超链接<a>
			3. 通过地址栏直接访问.
	
	doPost()方法:
		作用: 处理post方式的请求
		
		哪些请求方式属于post方式?
			表单<form>, method="post"
			
	//response.setContentType("text/html;charset=utf-8");
	
			

11. URL-Pattern的书写方式
	我们目前写的<url-pattern>是全路径方式访问, 可以写多个.
		//全路径访问方式: http://ip:端口号/项目名/文件名
		例如:
			<servlet-mapping>
				<servlet-name>Demo3</servlet-name>
				<url-pattern>/demo3</url-pattern>
				<url-pattern>/demo3/aaa</url-pattern>
				<url-pattern>/demo3/aaa/bbb</url-pattern>
				<url-pattern>/demo3/aaa/bbb/ccc</url-pattern>
			</servlet-mapping>
			
	可以优化为: 通过 通配符匹配, 要求前半部分一样.
		格式: 
			// <url-pattern>/名字/*</url-pattern>
		特点: 
			前半部分(*之前的部分)一样, 
			后半部分(*之后的部分)可以随便写(因为 * 代表所有)
	
	也可以优化为: 通过 扩展名匹配, 要求后缀名一样.
		格式:
			// <url-pattern>*.do</url-pattern>
			//后缀名可以自定义.
			
			
	优先级如下:		//建议
		全路径  >  通配符  >  扩展名
			
		
	总结:
		如果级别相同, 取相似度最高的.
		
	
12. 获取参数
	用户在浏览器可能通过<form>标签提交到服务器一些数据, 我们怎么知道用户提交的是什么标签, 什么值呢?
	这就需要用到: 获取参数.
		
	HTTPServletRequest类中的方法:
		String getPrrameter(String name);	//根据表单项name的属性值, 获取非多选框的值.
		String[] getParameterValues(String name);  //根据表单项name的属性值, 获取多选框的值.
		Map getParameterMap();	//由服务器创建的map, 表单项的name属性值作为key, 用户填写或者选择的值作为值.
			
			
		
13. 登陆案例: 需求分析和数据准备.
	1)分析:
		A: 用户在浏览器中输入用户名和密码, 点击提交按钮进行提交.
		B: 数据提交到后台(服务器)后, 再去数据库查找有无该条数据.
		C: 如果有就提示登录成功, 如果没有就提示登录失败.
	
	2) 数据准备:
		create database day10_db;

		use day10_db;

		create table user(
			id int primary key auto_increment,
			username varchar(50) unique not null,
			password varchar(50) not null,
			nickname varchar(50)
		);

		insert into user values(null, 'zhangsan','123','张三');
	
	3) 新建一个Dynamic Web Project项目.
		A: 把要用的jar包拷贝到lib文件夹中
		B: 把c3p0-config.xml文件复制到src文件夹下.
		C: 把工具类拷贝到com.itheima.utils包下.
		D: 新建一个JavaBean类(User), 字段名要和数据库表名一致.
					
14. 登录案例		
	1) 在WebContent文件夹下新建一个: login.html页面.
		<form action="/day1002/loginServlet" method="post">
			用户名: <input type="text" name="username" /> <br />
			密码: <input type="password" name="password" /> <br />
			<input type="submit" value="登录" />
		</form>
			
	 
			
			
			
			
			
面试题:
	1. Writer, 字节缓冲流, 字符缓冲流的默认缓冲区的大小分别是多少?
		2KB		 8kb(8192字节)		16KB(8192字符)
		
			
			
			
			
			
	
	
	
	