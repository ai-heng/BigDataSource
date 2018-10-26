昨日内容回顾:
	tomcat服务器:
		作用: 部署项目, 可以让不同的浏览器访问.
		
		下载:
			http://tomcat.apache.org
			
		安装: 
			解压即可直接用.
			//路径不要带中文.
		测试:
			startup.bat
			shutdown.bat
			
	Eclipse集成tomcat:
		//参见: 教案.doc
		
		
	Servlet:
		自定义类实现:
			1) 自己写类, 实现Servlet接口.
			2) 重写接口中所有的抽象方法.
			3) 配置web.xml文件.
			
		采用servlet模板实现:
			1) 配置servlet模板.
			2) 自定义类实现HttpServlet类.
			
		//Servlet接口和HttpServlet类之间的关系.
		
		读取浏览器请求的数据:
			String getParameter(String name);
			String[] getParameterValues(String name);
			Map<String,String[]> getParameterMap();
			
		登陆案例:
		
		
		


今日内容大纲:
	ServletConfig:
		概述: 当前Servlet的配置信息对象, 每个Servlet都独有自己的: 配置信息对象.
			  这些配置信息对象之间是相互: 隔离的. 
			  //大白话解释: Servlet1不能访问Servlet2的配置信息.
		
	
	ServletContext:
		概述: 当前项目的配置信息对象, 里边的配置参数可以被: 该项目下所有的Servlet共享.
	
	
	Http协议:
		概述: 超文本传输协议(HyperText Transfer Protocol) , 就是服务器和浏览器之间相互交互的规则.
		
		组成:
			浏览器给服务器发送数据:	 请求	//request
				请求行:
				请求头:
				请求体:	//get方式没有请求体
				
				//请求转发:  一次请求, 一次响应.
			
			服务器给浏览器响应数据:	 响应	//response
				响应行:
				响应头:
				响应体: 
				
				//重定向: n次请求, n次响应.
				
	
	
	
		
今日内容:
1. ServletConfig对象.
	概述: 当前Servlet的配置信息对象.

	作用: 可以读取当前Servlet对象的配置信息.
	
	需求:  Java代码中涉及到配置参数了, 如何修改配置参数?
		传统方式:
			1) 修改Java代码. (开发环境中实现)								//开发环境中实现
			2) 将项目打成war包(JavaWeb应用程序包, 能被tomcat服务器识别).	//开发环境中实现
			3) 将war包拷贝到生产环境(机房, 服务器)					  	
			4) 启动项目.													//生产环境中实现
			//这样做和开发原则"对修改关闭, 对扩展开放"相违背.
			
		结合配置文件的方式:
			1) 修改配置文件的内容.
			2) 重启项目.
		
	
	背景: 
		实际开发中, 我们会把项目相关的配置属性写入到配置文件中, 
		这样当配置属性的值发生改变时, 我们只需要修改配置文件, 
		重启服务即可. 
		
		
	实现步骤:
		1) 将当前servlet配置信息放到web.xml中.
			//设置当前Servlet对象的配置信息, 该标签可以写多组.
			<init-param>
				<param-name>属性名</param-name>
				<param-value>属性值</param-value>
			</init-param>
			<init-param>
				<param-name>size</param-name>
				<param-value>250</param-value>
			</init-param>
		2) 服务器将配置信息放到servletConfig中.
		3) 将ServletConfig传给Servlet.
		4) 在servlet中就可以通过 this.getServletConfig()方法获取
		   ServletConfig对象的引用, 进而获取配置信息.
			ServletConfig sc = getServletConfig();
			//获取指定属性名对应的值.
			String str = sc.getInitParameter("属性名");	   
		   
	特点:
		每个Servlet都会有一个ServletConfig对象, 这些对象之间是: 相互隔离的.
		
	
	
	总结: ServletConfig接口中的方法
		public String getInitParameter(String name);		//根据参数名获取其值
		public Enumeration<String> getInitParameterNames();	//获取所有的参数名
		
		
2. ServletContext对象: 获取当前项目的参数信息
	ServletContext对象:		//记忆
		和tomcat中的项目是一一对应的, 一个项目就会有一个ServletContext对象.
		
	作用: 
		可以读取当前项目的参数信息.
	
	步骤:
		1) 把项目的配置参数写入到当前项目下的: web.xml文件中.
			  //设置当前项目的配置信息, 可以写多组.
			  <context-param>
				<param-name>gongsi</param-name>
				<param-value>百度</param-value>
			  </context-param>
			  <context-param>
				<param-name>jingli</param-name>
				<param-value>李彦宏</param-value>
			  </context-param>
		2) 获取当前项目的配置信息
			

3. ServletContext对象的应用之: 当做容器来使用.

	应用场景:
		1) 每个servlet中都可以通过ServletContext对象获取当前项目在web.xml中配置的参数信息.
		
		2) 多个servlet可以将ServletContext对象当做一个容器去使用, 为什么?
			"容器" --> "域"
			//大白话	专业名词
			
		3) 通过ServletContext对象可以获取项目内资源的绝对路径.
		
		4) 通过ServletContext对象可以获取项目内资源的类型
		
		5) 通过ServletContext对象可以获取项目名
	

	案例演示:  ServletContext对象的应用场景(2) 
		/*
			一个ServletContext对象获取访问的ip地址, 保存到context容器中.
				//获取浏览器请求时的ip, 调用ServletRequest#getRemoteAddr();
				String ip = request.getRemoteAddr();
			另一个ServletContext对象从context容器中读取出该IP.
		*/
		
	ServletContext中的方法:
		public String getInitParameter(String name);	//根据参数名获取其值
		public Enumeration<String> getInitParameterNames();	//获取所有的参数名
		
		public Object getAttribute(String name);	//根据属性名, 获取其值.
		public void setAttribute(String name,Object value);	//设置属性
		public void removeAttribute(String name);	//根据属性名, 移除该属性.
		
		
		

	结论:
		ServletContext对象当做容器这种使用方式, 以后开发中尽量不要使用,
		因为ServletContext对象是和项目对应的, 如果项目负担过大, 将会影响
		用户的体验.
		
		
	
4. ServletContext对象的其他应用
	ServletContext接口中的方法:
		public String getRealPath(String filePath);	//获取资源文件的绝对路径.
		public String getMimeType(String fileName);	//获取资源文件的类型
		public String getContextPath();				//获取当前项目的项目名.
		//也可以通过: String name = request.getContextPath(); 的方式获取项目名
		

5. http协议:
	概述: 
		超文本传输协议(HyperText Transfer Protocol)是,浏览器和服务器之间进行交互的规则.
		由请求和响应组成.
		
		请求: //浏览器向服务器传输的数据, request
			由三部分组成, 分别为:
				请求行: 
				请求头: 
				请求体: 	//get请求没有请求体, post请求有请求体.
			
		
		
		响应: //服务器向浏览器回送的数据, response
			由三部分组成, 分别为:
				响应行: 
				响应头: 
				响应体: 
				
	案例: 检验请求和响应的组成.
		1) 谷歌和火狐浏览器的F12就可以, 但是不适合教学, 适合开发.
		2) IE浏览器安装httpwatch插件, 适合教学, 因为比较直观.
		
	
	
6. 获取请求行数据
	Request对象的方法:
		public String getMethod();		//获取请求的方式
		public String getRequestURI();	//获取请求资源
		public String getProtocol();	//获取协议类型
		public String getContextPath();	//获取项目名(项目路径)
		public String getRemoteAddr();	//获取IP地址.
		public int getLocalPort();		//获取端口号
		
	
7. 获取请求头数据
	Request对象的方法:
		public String getHeader(String name);	//根据给定name名获取其对应的值
			//获取 HOST + User Agent等信息
		public Enumeration getHeaderNames();	//获取所有的请求头的属性名
			
8. 解决get方式的中文乱码问题
	原因:
		1) 浏览器先对数据进行"utf-8"编码, 然后发送给服务器.
			//浏览器的默认编码格式是"gbk", 但是我们Eclipse的工作空间已经改为
			//UTF-8码表了, 所以创建在Eclipse中的页面也是采用"utf-8"码表.
		2) 服务器接收到浏览器发送的数据后, 按照"iso-8859-1"码表解码.
		3) 服务器将"乱码"后的数据传输给: Servlet对象.
		4) 此时, Servlet对象从服务器获取的数据肯定是乱码的.
		
	解决方案:
		方案一: 把服务器的默认码表改为"utf-8". 	
			//不推荐, 因为有可能项目不是这个饿吗表.
	
		方式二: 先编码, 再解码.
			方案一:  //通过URLEncoder#encode(), URLDecoder#decode()
				1) Servlet对象先对服务器传过来的数据进行"iso-8859-1"编码.
					//这样做的目的是将数据 还原到 浏览器传输给服务器的原始状态.
					String str = URLEncoder.encode("要编码的字符串","指定的码表");
					
				2) 然后对编码后的数据进行"utf-8"解码操作即可.
					String str = URLDecoder.decode("要解码的字符串","指定的码表");
			
			方案二: 通过String类的功能实现
				public byte[] getBytes("指定的码表");	
					//将字符串转成指定码表的 字节数组形式.
				public String(byte[] bys,String charsetName);
					//将字节数组按照指定的码表转成其对应的 字符串形式.
					
				
9. 解决post方式的中文乱码问题
	方式一: 和(9)里边标注的方式一样.
	
	
	方式二:  该方式只针对post有效(因为该方式是针对于请求体的, post有请求体)
		//设置客户端对请求体进行"utf-8"码表编码
		request.setCharacterEncoding("utf-8");
		
		
10. 请求转发原理图
	目前我们知道的"页面跳转"的方式:(下述这些都是HTML和JS的)
		<a>, <form>, BOM对象之Location.href, Window对象的open()
	那么Java代码中能不能完成"页面跳转"的功能呢?
		接下来我们要学习的"请求转发"就是Java代码进行"页面跳转"的一种方式.
	
	原理思路:
		1) 浏览器给服务器发送数据, 服务器把数据给到RequestServlet1.
		2) RequestServlet1把Request,Response两大对象传给RequestServlet2.
		3) 由RequestServlet2完成数据的处理, 然后把数据传输给浏览器.
		
		
	
11. 请求转发实现页面跳转
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
			











