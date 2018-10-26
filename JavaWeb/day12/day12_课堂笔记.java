1. 重定向的原理图:
	response是专门给客户端响应数据的响应对象.
	Http协议规定: 响应数据也要分成三部分:	
		响应行:	主要学习设置状态码.
			
		响应头:	主要学习重定向(重点)		//掌握
			//你找张三借钱, 张三没钱, 张三找李四沟通, 借钱给你(请求转发).
			//你找张三借钱, 张三没钱, 张三告诉你思聪有钱, 你去找他(重定向).
		
		响应体: 主要是给客户端响应页面上要展示的数据(验证码).
		
	功能:
		public void setStatus(int sc);		//200, 302, 404, 500
			//200: 请求成功.
			//302: 请求重定向.
			//404: 访问的资源不存在.
			//500: 服务器内部错误.
		
		public void setHeader(String name, Stirng value);
			//设置响应头信息. name表示属性名, value表示属性值.
		
			//响应重定向的路径
			//response.setHeader("location","http://www.itcast.cn");
			
	重定向原理步骤:
		1) 浏览器访问Servlet1, 但是该请求Servlet1实现不了, 想交给别的Servlet对象来实现.
		2) 在Servlet1中完成如下设置:
			A: 设置状态码302, 通知浏览器找其他资源.
				response.setStatus(302);
			B: 设置响应头, 告诉浏览器访问新资源的路径.
				response.setHeader("location", "/项目名/servlet名");
		3) 浏览器识别服务器返回的状态码.
			马上准备访问新资源.
			//取出新资源的路径, 马上访问新资源.
		4) 浏览器向新资源(新的Servlet对象)发出请求.
		5) 新的Servlet对象响应浏览器的请求.
		
		
		
2. 重定向的实现
	需求: 使用浏览器访问"/responseServlet1", 通过重定向跳转到: 黑马官网.
	
	实现方式:
		方式一:  分解式
			//1) 响应状态码.
		    response.setStatus(302);

			//2) 响应重定向的路径
			response.setHeader("location","http://www.itcast.cn");

		方式二: 合并式
			response.sendRedirect("http://www.itcast.cn");
			
	
3. 重定向和请求转发的区别:
	1. 相对于浏览器而言, 是几次请求几次响应?
		重定向: n次请求, n次响应.
		请求转发: 一次请求, 一次响应.
	
	2. 浏览器地址和窗体内容是否一致?
		重定向:		一致.
		请求转发: 	不一致.
	
	3. 页面跳转是在服务器内部, 还是服务器外部?
		重定向:		可以是服务器内部, 也可以是服务器外部.
		请求转发:	只能在服务器内部. (思路: 把request对象当做容器)
	
	4. 关于是否可以跳转项目外部的路径.
		重定向:		response.sendRedirect("/项目名/servlet名");
		请求转发:	request.getRequestDispatcher("/servlet名").forward(request,response);
	
	5. 如果需要将request当做容器使用, 谁合适?
		重定向:		不合适.
		请求转发: 	更合适.
		
		
4. 页面定时刷新到新网页
	应用场景:
		1) 访问的资源不存在, 5s 后跳转到首页.
		2) 支付成功, 10s 后跳转到首页.
	
	实现方式:
		通过设置refresh响应头信息来完成这个功能.
		
	格式:
		response.setHeader("refresh","秒数;url=网址");
		
	例如:
		response.setHeader("refresh","5;url=http://www.itcast.cn");


5. 向浏览器输出中文
	应用场景:
		浏览器显示的内容, 下载文件等.
		
	response: //以流的形式, 将内容输出给浏览器.
		response.getWriter();		//获取响应体的字符输出流.
		response.getOutputStream();	//获取响应体的字节输出流.

	注意:
		1) 字符流和字节流不能同时使用.
		2) 复制文件建议用: 字节流.  
		   手动生成响应内容建议用: 字符流.
		3) 不需要关流, tomcat会自动调用close(),flush()方法.	

	案例:
		需求: 向浏览器输出: "你们真的很棒!"
		//字符流实现
		//方式一: 字符流, 合并式		//推荐使用
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("你们真的很棒!");
		
		//方式二: 字符流 分解式
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		response.getWriter().println("你们真的很棒!");
		
		//方式三:
		response.getOutputStream().write("你们真的很棒!".getBytes("gbk"));
				
		
6. JSP简介
	需求: 使用servlet向浏览器输出一个百度超链接页面.
		response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("<html>");
        response.getWriter().println("<head><titile>百度超链接</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<a href='http://www.baidu.com'>百度</a>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
			
			
		//缺点: 由于使用字符串拼接, 阅读困难, 维护困难, 开发困难.
		//可以通过: JSP解决该问题.
	
	JSP概述:
		Java Server Pages, Java服务器页面, 其本质就是一个Servlet.
		//是一门动态语言, 里边既可以写html代码, 也可以写css代码,
		//可以写js代码, 也可以写Java代码.
		
	
7. 在JSP中嵌入Java代码(JSP的快速入门)
	//写在.jsp文件中即可, 例如: helloworld.jsp文件中即可.
	
	方式一: 脚本表达式, 向浏览器输出内容.
		//类似于输出语句.
		格式:
			<%=变量名或者值 %>
		例如:
			<%="hello world" %>
			<%=777 %>
			<%=true %>
			
	方式二: 脚本片段, 类似于: 方法中一段代码.
		<%
			for(int i=1; i<=10; i++) {
		%>
			<h3><%=i %><h3>
		<%
			}
		%>
		
	方式三: 脚本声明, 声明当前类的成员变量, 成员方法, 内部类等.
		<%!
			int x = 666;
			
			public int add(int x,int y) {
				return x + y;
			}
			
			class InnerClass{}
		%>
		
		成员变量: <%=x %><br>
		成员方法: 3 + 5 = <%=add(3,5) %>
		
		<%
			request.setAttribute("money",1500);
		%>
		薪资: <%=request.getAttribute("money") %>
		
		
	原理:
		1) 浏览器访问服务器上的.jsp文件.
		2) .jsp文件会被解析成.java文件(针对于Eclipse: 存在tomcat\work文件夹中)
		3) .java文件会被编译成.class文件(虚拟机只认识.class文件)
		4) 浏览器加载该.class文件到内存, 将内容显示到页面上.
		
	/*
		C:\Users\用户名\.IntelliJIdea2016.3\system\tomcat\项目名称\work\Catalina\localhost\ROOT\org\apache\jsp
		
		C:\Users\Liu\.IntelliJIdea2017.2\system\tomcat\Unnamed_cs2018_2\work\Catalina\localhost\jspProject\org\apache\jsp
	*/
		
		
		
8. JSP中的内置对象
	常见面试题: 请写出JSP的内置对象.
		page(当前页面), request, session(当前会话), application,
		pageContext, response, config, out, exception
		
	
9. EL表达式
	EL: Expression Language(表达语言的意思), 是为了使JSP写起来更加简单.
		//如果使用自定义类型的值, 需要导包: 
		//<%@page import="com.itheima.domain.Product"%>
		
	作用:
		快速获取域容器中的数据(request容器, context容器).
		
	格式:
		${域对象.类名.属性名}
		
	例如:
		${requestScope.product.name}
		
		
10. 项目的准备工作
	1) 完成数据表的创建及表数据的添加动作.
	2) 把要使用的jar包拷贝到: web-inf\lib中.
	3) 把c3p-config.xml文件复制到src文件夹中.
	4) 新建包:
		com.itheima.utils
		com.itheima.domain
		com.itheima.web
		com.itheima.service
		com.itheima.dao
	5) 把JDBCUtils工具类拷贝到:utils包中.
	6) 新建JavaBean类.
		
		
11. 登陆案例的分析
	优化的地方:
		如果登陆失败: 
			使用请求转发跳转到 login.jsp页面, 显示错误信息.
		如果登陆成功:
			使用重定向跳转到首页: index.jsp
			
			
12. 获取参数封装到JavaBean中.
	BeanUtils的原理(作用):
		将map中的数据复制到指定的JavaBean中.
	

	
	
13. 登陆注册案例
	准备工作: 
		1) 复制jar包.
		2) 新建文件夹(分层)
		3) 拷贝c3p-config.xml文件 和 JDBCUtils工具类.
		4) 新建实体类.
		
	登陆案例:
		1) 新建index.jsp页面,  里边写一句话<h1>欢迎登陆本网站</h1>
		2) 新建login.jsp页面, 关联 /项目名/loginServlet	这个servlet对象.
			//里边写的是form表单, 包裹<table>, 表格里边是: 用户名, 密码, 提交按钮(登陆)
		3) 在com.itheima.web包下新建LoginServet类, 并在其doGet()方法中完成如下功能:
			A: 获取用户通过浏览器提交过来的数据.
				request.getParameter("参数名");
			B: 将用户提交过来的数据封装成: User对象.
				//可以通过BeanUtils工具类实现.
				User user = new User();
				BeanUtils.populate(user, request.getParameterMap());
			C: 调用Service层的功能, 将该对象传输过去校验, 并接收返回结果.
				UserService us = new UserService();
				User loginUser = us.login(user);
			D: 编写Service层的代码.
				UserDao ud = new UserDao();
				User loginUser = ud.login(user);
			E: 编写Dao层的代码.
				//创建QueryRunner对象, 去数据库查找该数据, 并返回.
				//结果集的处理方式用: BeanHandler
			F: 在LoginServlet类中, 根据Service层的返回结果做校验.   
				User用户存在:
					//重定向页面到: 首页(index.jsp)
					response.sendRedirect("/项目名/index.jsp");
				
				User用户不存在:
					//给页面一个反馈信息: 用户名或者密码错误
					
					//版本一: 请求跳转页面到: 登陆页面(login.jsp), 让用户接着登陆
					
					//版本二: 请求跳转页面到: 注册页面(register.jsp), 让用户注册账号
					
	
	注册案例:
		//思路和登陆案例类似, 自己动手实现.

			
			
			
			
			
			


***********************************************************************************************************************
请求转发实现页面跳转
	要转发的RequestServlet对象.
		1) 将IP地址保存到request容器中.
			request.setAttribute("ip",request.gerRemoteAddr());
		
		2) 获取请求转发对象.
			RequestDispatcher rd = request.getRequestDispatcher("要转发的路径");
			//例如:  request.getRequestDispatcher("/requestServlet2");
		3) 执行转发动作.
			rd.forward(request对象, response对象);
		4) 使用return结束.	//可写可不写, 建议写上.
			return;
	
	
	被转发的RequestServlet对象.
		1) 从request容器中取出ip地址, 打印到浏览器中
			String ip = (String)request.getAttribute("ip");
			
		2) 把获取到的ip, 打印到浏览器中即可.
		

	请求转发的
		特征:
			浏览器访问的是Demo1Servlet, 但是给你响应内容的是: Demo2Servlet.
		
		注意:	//记忆
			1) 每次请求都会创建新的request对象和response对象.
			2) 每次响应结束后, request对象和response对象就会被立刻销毁.
			
	



扩展内容**********************************************************************
验证码代码
	作用: 防止暴力破解.
	
	页面上的验证码生成:
		验证码一般是一个图片, 而这个图片是在Java程序中动态生成的.
		需要使用Java中GUI的技术完成.
		
	页面显示图片的原理:
		1) 浏览器向服务器发送请求, 例如请求: 1.html
			/*
				文本A;
				文本B;
				图片C;
				图片D:
			*/
		2) 服务器把该页面响应给浏览器.
		3) 浏览器按照从上往下的顺序解析页面.
			是文本, 就自动解析.
			是图片, 会再次向服务器发送请求, 加载该图片.
			
	代码实现:
		//以后用到了, 直接复制即可.
		 //给浏览器绘制一个: 带验证码的图片即可.
        int width = 120;
        int height = 40;

        //1. 创建一张图纸(宽, 高, 颜色类型).
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        //3. 获取画笔.
        Graphics g = bi.getGraphics();

        //4. 设置图片的背景色.
        //4.1 选定颜色.
        g.setColor(Color.white);
        //4.2 选定填充的大小
        g.fillRect(0, 0, width, height);

        //5. 设置验证码的边框
        //5.1 选定颜色
        g.setColor(Color.red);
        //5.2 选定绘制的方式(大小)
        g.drawRect(0, 0, width - 1, height - 1);

        //7. 获取生成的验证码, 在控制台中输出
        String str = "";

        //6. 生成随机的字符(生成4个), 然后显示在该图片上.
        //6.1 获取数据源(数字, 字母)
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        //6.2 创建随机数对象.
        Random r = new Random();
        //6.3 因为要生成4个, 所以用循环改进.
        for (int i = 0; i < 4; i++) {
            //6.4 设置字体大小及随机字体颜色.
            g.setFont(new Font("楷体", Font.BOLD, 25));
            g.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
            //6.5 把字符绘制到页面上.
            String s = "" + data.charAt(r.nextInt(data.length()));
            g.drawString(s, 10 + i * 30, 30);
            str += s;
        }

        //8. 绘制干扰线
        for (int i = 0; i < 10; i++) {
            g.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
            g.drawLine(r.nextInt(width),r.nextInt(height),r.nextInt(width),r.nextInt(height));
        }

        //2. 把图纸显示在浏览器中(图纸, 图片格式, 字节输出流(网页面中写数据的)).
        ImageIO.write(bi, "jpg", response.getOutputStream());

        System.out.println(str);	
			
			
			
			
			
			
			
			
			
			
			