昨日内容回顾:
	1) 关于响应(response)的内容
		A: 重定向
			你找张三借钱, 张三没钱, 张三找李四筹够钱, 借你钱.	//请求转发
				//请求转发:  主要是针对请求的(request)
				request.getRequestDispatcher("请求转发的资源路径").forward(request,response);
				
			你找张三借钱, 张三没钱, 张三说李四有钱, 你找李四.	//重定向
				//重定向:    主要是针对响应的(response)
				response.setStatus(302);	//告诉浏览器进行重定向.
				response.setHeader("location","http://www.itheima.com");
				
				//上述的方式也可以优化为:
				response.sendRedirect("进行重定向的路径");
				
			重定向和请求转发的区别:
				1. 关于请求和响应的次数.
				
				2. 浏览器和窗体内容是否一致?
				
				3. 关于是否写项目名.
				
				4. 关于是否可以跳转项目外部的路径.
				
				5. 如果需要将request当做容器使用, 谁合适?
			
		B: 页面的定时刷新功能:
			response.setHeader("refresh","秒数;url=地址");
			response.setHeader("refresh","5;url=http://www.itcast.cn");
			
		C: 给浏览器响应中文
			response.setContentType("text/html;charset=utf-8");
			
			response.getWriter();			//获取字符流
			response.getOutputStream();		//获取字节流
			
			注意:
				1) 字符流和字节流不能同时使用.
				2) 复制文件建议用: 字节流.  
				   手动生成响应内容建议用: 字符流.
				3) 不需要关流, tomcat会自动调用close(),flush()方法.	
			
	
	
	2) 生成验证码
		//理解即可, 今天我们还要用这个知识点, 直接拿来用.
	
	3) JSP
		Java Server Pages, Java服务器页面, 简单理解: 可以写html,css,js,Java语言的文件.
		
		JSP中Java代码的写法:
			<%=变量名或者值 %>		//脚本表达式, 往页面上打印指定的值, 作用类似于: response.getWriter().println("值");
			
			<%  %>					//脚本片段, 类似于方法中的一段代码
			
			<%! %>					//脚本声明, 类似于定义在类中的成员变量, 成员方法.
		
	4) EL表达式
		作用: 用来简化Java代码的.
	
	
	5) 登陆注册案例
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


今日内容:
1. 为什么使用cookie和session?
	场景: 
		在京东等类似商城购买商品, 需要将商品信息保存到购物车中.
	目前已知的容器:
		request容器: 
			不合适, 因为每次访问服务器都会创建新的request对象, 
			每次响应结束后, 就会立刻销毁request容器.
		
		
		ServletContext容器: 
			不合适. 
			有可能先支付的用户所购买的不一定是自己想要购买的商品.
			因为ServletContext容器是所有servlet的公共容器. 
			

2.  cookie的原理图
	案例: 
		模拟去商店买奶茶, 点餐员(小姐姐)给顾客小票, 顾客凭小票取奶茶.
	步骤:
		1) 浏览器向服务器发送请求(购买商品的Servlet对象).
			//顾客和点餐员说, 我要买3杯奶茶.
		2) 服务器响应浏览器的请求(浏览器想要的数据 + cookie对象)
			//点餐员给客户小票.
		3) 浏览器向服务器发送请求(支付商品的Servlet对象) + cookie对象.
			//顾客向收银员出示: 小票.
		4) 服务器识别客户端的cookie, 进行处理, 并相应结果给浏览器.
			//收银员根据小票收取指定的费用, 并给客户奶茶.
	

3. 	创建cookie和发送cookie.
	Cookie简介:
		创建一个cookie, cookie是servlet发送到Web浏览器的少量信息, 
		这些信息由浏览器保存, 然后发送回服务器.
		// cookie的值可以唯一的标识客户端, 因此cookie常用于"会话"管理.
		//所有的Servlet都可以共享cookie里边的值.
		
	Cookie的特点:
		一个cookie拥有一个名称, 一个值和一些可选属性, 例如: 
			//最大生存时间, 路径.			//记忆.
			//域限定符, 注释, 版本号等.		//理解.
	
	会话简介:
		可以简单理解为:  用户打开浏览器, 点击多个链接, 访问服务器的多个web资源, 然后关闭浏览器. 整个过程称之为是一次回话.
			

	使用步骤:
		1) (服务器)创建Cookie.
			Cookie cookie = new Cookie(name,value);
			/*
				注意: 
					cookie的name,value值都是字符串, value值不能是中文.
					因为cookie的默认编码集是: iso-8859-1(不支持中文).
			*/
		2) (服务器)发送cookie(给浏览器).
			response.addCookie(cookie对象);

		3) 获取cookie(浏览器发送cookie, 服务器接收cookie).
			Cookie[] cookies = request.getCookies();
			for(Cookie co : cookies) {
				name = cookie.getName();
				value = cookie.getValue();
			}
		
4. 获取cookie的注意事项
	问题: 
		如果浏览器没有缓存(cookie), 在服务器直接读取cookie的值, 有可能能会出现: 空指针异常(NullPointerException).
	解决方案:
		在服务器的Servlet中, 遍历Cookie[]数组前, 先做不为null校验.
		示例代码:
			//需求: 获取浏览器给服务器的所有cookie 
			Cookie[] cookies = request.getCookies();
			//问题: 如果浏览器不向服务器发送cookie, 就会出现空指针异常.
			//解决: 判断数组, 非空时, 再做遍历的操作.
			if (cookies != null) {
				for (Cookie cookie : cookies) {
					response.getWriter().println("CookieServlet2:  " + cookie.getName() + " = " + cookie.getValue());
				}
			}


5. 设置cookie的最大生存时间
	问题: 
		默认情况下, 浏览器关闭时cookie过期, cookie就被删除了.
	解决: 
		设置cookie的最大生存时间.
			负数:关闭浏览器时删除. 	//默认值
			0:立马删除. 
			正数:过指定时间删除.
	示例代码:
		cookie.setMaxAge(20);	//20秒后删除
	
	
6. 设置cookie的路径
	/*
		API中Cookie类的一句话: 
			一些 cookie 可能有相同的名称，但却有不同的路径属性。 
			上述: 路径可以理解为Java中的包, cookie可以理解为类名.
			不同包下是可以出现类名的相同的类的. 
	*/
	
	为什么设置cookie路径?
		背景: 某公司的门户网站, 有篮球栏目, 汽车栏目.
		案例:
			某用户通过浏览器访问该门户网站的"汽车栏目", 服务器会给该浏览器返回一个cookie, 例如: "car=汽车栏目",
			此时该用户再次访问网站的"汽车栏目"时, 也会把"car=汽车栏目"这个cookie值传过去, 这样做不合适, 就需要通过"设置cookie的路径"来解决.
	
	
	Cookie类的成员方法:
		public void setPath(String uri);	//设置cookie的有效目录
		//假如设置cookie的路径为"/项目名/资源名称", 那么访问"/项目名/资源名称"或者"/项目名/资源名称/aaa/bbb.."子目录都会携带当前cookie.
	
		需求: 将cookie的路径设置为"/项目名/资源名称", 观察访问哪些资源携带当前cookie.
			//设置cookie的路径
			//cookie.setPath("/day13_ceshi/aaa");
			cookie.setPath(request.getContextPath() + "/aaa");
			
			//实际开发的写法
			//cookie.setPath("/day13_/ceshi");
			cookie.setPath(request.getContextPath());
		
7. 观察cookie的默认路径
	问题: 
		如果不设置cookie的路径, 默认访问路径是啥?
	答:
		就是访问servlet的父目录.
	案例:
		servlet对象的路径为:
			<url-pattern>/cookieServlet3/aaa/bbb</utl-pattern>
		浏览器中记录的cookie的默认路径为:
			/项目名/cookieServlet3/aaa
	
8. 删除指定的cookie
	//需求: 删除指定的cookie
	//1. 确定删除哪个cookie: 名称和路径保证cookie的一致性.
	Cookie cookie = new Cookie("meinv","");
	cookie.setPath("/day13_ceshi/aaa");
	
	//2. 动作: 立即删除.
	cookie.setMaxAge(0);
	
	//3. 服务器通知浏览器立即删除.
	response.addCookie(cookie);
	
	//4. 给浏览器提示
	response.setContentType("text/html;charset=utf-8");
	response.getWriter().println("CookieServlet4删除成功" + new Date().toLocaleString());
		
	
9. cookie案例显示上次访问时间
	背景:
		各个门户网站, 手机APP, 都会有类似的需求.
		例如: 每次登陆QQ时, 会提示上次登陆的时间.
		
	思路:
		关于服务器: 
			1. 获取所有的cookie.
			2. 找到"保存上次访问时间的cookie"
			3. 判断.
				如果存在cookie, 显示上次访问时间.
				如果不存在cookie, 显示欢迎访问本网站.
			4. 创建cookie, 保存当前时间.
			5. 发送cookie给浏览器.
			
		关于浏览器:
			1. 接收到服务器的响应后, 显示对应的内容.
			2. 识别cookie, 将cookie保存到浏览器管理的缓存中.
	
	
	

10. session简介
	为什么讲Session?
		cookie的缺点: 
			1) 保存到浏览器中, 存在安全隐患.
			2) 只能保存少量的信息.
			
		session的优点:	//相对于cookie的缺点而言.
			1) 保存到服务器中, 相对更加安全.
			2) 保存大量的信息.
			
	session的特点:
		1) session由服务器创建的, 获取引用: request.getSession();
		2) 每个客户端(浏览器)都会有一个对应的session容器.
			//注意: 比如你电脑上有三个浏览器访问京东时, 
			//京东商城就会创建三个对应的session容器.
			
	session原理:	//重点掌握	
		//记忆: session依赖cookie, 浏览器采用cookie的方式记录session容器在服务器上的唯一id(JSESSIONID)
		//浏览器中的cookie: Cookie cookie = new Cookie("JSESSION","Session容器在服务器上的唯一id");
		1) 浏览器向服务器发送请求.
			//录入: 要买娃娃等.
		2) 服务器针对浏览器的请求, 创建一个session容器, 记录浏览器请求的属性信息.
		3) 服务器将该session容器的唯一id封装成cookie对象, 响应给浏览器.
		4) 浏览器接收到服务器响应的数据后, 记录住: 该session容器的id.
		5) 浏览器继续向服务器发送请求时, 服务器就可以根据浏览器记录的"JSESSIONID", 找到和浏览器关联的Session容器.
		
	记忆:
		1. session依赖的是cookie, 浏览器采用cookie的方式记录: session容器在服务器上的唯一ID.
		2. 浏览器中的cookie: 
			Cookie cookie = new Cookie("JSESSIONID","session容器的唯一id");
		
11. session保存数据和获取数据
	HttpSession hs = request.getSession();	//获取session容器.
	//设置属性
	hs.setAttribute("属性名","属性值");
	
	//获取属性
	hs.getAttibute("属性名");
	
		
12. session保存会话数据的原理
	以一次"会话"为例:
		1) 浏览器第一次向服务器发送请求.
		2) 服务器接收到浏览器的请求后会给浏览器一个JSESSIONID.
		3) 浏览器第二次想服务器发送请求.
		4) 服务器根据浏览器的JSESSIONID的值就能找到其对应的Session容器.
		
		
13. 解决关闭浏览器session丢失的问题
	原因:
		浏览器中存储JSESSIONID的那个cookie对象, 在会话接收后就销毁了.
		这就导致了服务器找不到JSESSIONID, 从而找不到与其Session容器.
		
	解决方案:
		修改存储JSESSIONID的cookie容器的最大生存时间即可.
		//创建Cookie对象
		Cookie cookie = new Cookie("JSESSION",hs.getId());
		//设置cookie对象的路径
		cookie.setPath(request.getContextPath());
		//设置cookie对象的最大生存时间
		cookie.setMaxAge(60 * 60 * 24 * 30 * 3);
		//把该cookie对象响应给浏览器
		response.addCookie(cookie);
		

14. session的生命周期
	session什么时候被创建?
		方式一:
			初次调用: request.getSession();
		方式二:
			第一次访问jsp页面.
			
	session什么时候被销毁?
		方式一: 
			Session对象在服务器内部有默认的存活时间, 是30分钟.
			//思考: 为什么设置session的默认存活时间.
			
		方式二:
			调用 session.invalidate()方法, 通知服务器销毁对应的session容器.
			
		方式三:
			服务器断电, 内存数据消失, session保存在内存中, 肯定也消失.
			//如果是正常关闭服务器, session中的数据还在, 没有丢.
			/*
				演示: 
					在Servers界面关闭服务器(正常关闭), 在console界面关闭服务器(类似于服务器断电)
			*/
					
15. 搭建项目的准备工作.
	需求:
		必须登录才可以访问首页(session)
		登录成功后, 显示欢迎用户信息(session)
	准备工作:
		1) 把要用的jar包拷贝到lib文件夹中.
		2) 把c3p0-config.xml拷贝到项目下的src文件夹下.
		3) 新建包:
			com.itheima.web
			com.itheima.service
			com.itheima.domain
			com.itheima.dao
			com.itheima.utils
	
16. 登录案例的原理分析图
	1) 编写index.jsp页面.
		获取session中用户信息(开发中, 将session是否有用户信息作为判断是否登录的依据)
		
	2) 判断session中的用户信息.
		如果有用户信息:		显示欢迎信息.
		如果没有用户信息:	提示: 未登录, 请先登录再操作.
		
	3) 编写login.jsp页面.
		用户名:
		密码:
		登录按钮
	
	4) 编写LoginServlet
		A: 获取参数, 封装到User对象中.
		B: 调用业务类, 查询用户信息.
		C: 判断是否查到用户信息
			如果没查到: 	//表示登陆失败
				使用请求转发, 跳转到login.jsp页面, 并显示错误信息.
				
			如果查到:	//表示登陆成功
				a. 将用户信息, 保存到session中, 作为判断用户是否已登陆的依据.
				b. 使用重定向, 跳转到 index.jsp
				
				
	
17. 登陆案例实现.









