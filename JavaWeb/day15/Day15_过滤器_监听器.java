昨日内容回顾:
1. JSP
	JSP的注释写法.
		HTML注释(能在页面中显示), Java注释, JSP注释
	
	JSP中如何编写Java代码.
		脚本表达式, 脚本片段, 脚本声明.
		
	页面出现问题了如何解决:
		方案一: 设置单个页面.
			errorPage="要指向的错误页面";
			 
			 如何在页面上显示异常的信息:
				1) 先把页面设置为错误页面.
					isErrorPage="true".
				2) 通过 exception.getMessage()获取.
		
		方案二: 设置所有页面.
			在web.xml文件中设置. <error-page>
			
		
	静态引入和动态引入
		静态引入: 
			<%@ include file="要引入的页面的路径"%>
		动态引入: 
			<jsp:include page="要引入的页面的路径"></jsp:include>
	
		区别:
			静态引入会把所有的引入页面解析为一个 .java文件.
			
			动态引入是把每个引入的页面都解析为一个 .java文件.
			
	向浏览器输出中文:
		out:		往out缓冲区中写.
			//当.jsp文件记载完毕或者out缓冲区满了, 才会把数据写往: response缓冲区.
			
			设置out缓冲区的大小: buffer="8kb"
		response:
			//直接往浏览器中写的.
			
	.jsp文件的内置9大对象:
		page, request, session, application,
		response, config
		out, exception, pageContext
		
		pageContext: 
			作用一: 可以获取其他内置对象的引用.
				例如: getPage(), getRequest()....
				
			作用二: 可以操作域容器.
				放数据: 	//Page_Scope, Request_Scope, Session_Scope, 
					setAttribute(name,value);
					setAttribute(name,value,int scope);
				
				取数据:
					getAttribute(name);
					getAttribute(name,socpe);
					
				移除数据:
					removeAttribute(name)
					removeAttribute(name,scope)
					
				按照顺序获取:
					findAttribute(name);
			
	
	

2. EL表达式
	获取用户提交的参数信息:
		param.属性名
		
	获取请求头信息:
		header["属性名"]
		如属性名没有特殊符号, 可用 header.属性名 的方式获取

	获取cookie中的信息:
		cookie.cookie的属性名

	获取项目路径:
		pageContext.request.contextPath
		pageContext.request.ServletContext.contextPath
		
	获取域容器中的数据
		域容器名.属性名.属性值.
	
	EL表达式执行计算:
		${a + b}
		
		${empty 数组名或者集合名}	//判断数组好欧哲集合是否为空.
		
	获取数组, 集合中的数据
		${数组名或者集合名[索引] }
	
3. JSTL	
	增强for:
		<%@ taglib uri=".../core" prefix="c" %>
		
		<c:forEach items="${数组或集合 }" var="变量名">
			${变量名 }
		</c:forEach>
	
	普通for:
		<c:forEach begin="起始值" end="结束值" step="自变量" var="变量名">
			${变量名 }
		</c:forEach>
		
		<c:if test="判断格式">
		</c:if>
	
	
	格式化日期:
		<%@ taglib uri=".../fmt" prefix="fmt" %>
		
		<fmt:formatDate value="要操作的值" pattern="模板" />
		

4. 商品列表展示案例
	思路:
		通过servlet类读取数据库中的商品信息, 封装成集合List<Product>
		然后通过请求跳转跳转到页面, 将集合中的数据加载到页面中.


今日知识点:
1. 过滤器简介
	为什么要讲过滤器?
		现实生活中的案例: 
			不管去电影院, 地铁, 飞机等, 进站前都要有"检票"的动作.
			而"检票"之前要进行"安检"的工作.
			
		Java中的应用场景:
			我们可以通过浏览器访问: .jsp页面, .java类.
			访问这些资源之前一般都会进行"敏感词过滤"(这个动作类似于: 检票),
			但是操作数据就有可能出现乱码等一些问题, 每个servlet都设置一次的话, 解决起来比较麻烦. 通过过滤器, 上述的问题都可以解决.


2. 过滤器的快速入门
	Servlet的三种技术规范:
		Servlet(服务器小程序)
		Filter(过滤器)
		Listener(监听器)
		
	回顾Servlet的用法:
		1) 新建一个类(例如: MyServlet), 去继承HttpServlet.
			//或者实现Servlet接口也可以.
		2) 重写doGet()和doPost()方法.
		3) 在web.xml中 注册和映射.
		
	
	过滤器演示, 
		准备动作:
			1) 新建一个web项目, day15
			2) 新建一个首页(index.jsp)
				<h1>过滤器<h1>
					<h3><a href="${pageContext.request.contextPath }/hello.jsp">访问jsp</a></h3>
					<h3><a href="${pageContext.request.contextPath }/helloServlet">访问Servlet</a></h3>
			3) 编写hello.jsp
				<h1>hello,Jsp <%=new Date().toLocalString() %></h1>
			4) 编写HelloServlet类
				//注意: 因为方便和过滤器,监听器区分, 该类放在: com.itheima.web.servlet包下.
				在doGet()方法中实现, 给浏览器响应一句话:
					//response.getWriter().println("<h1>Hello, Servlet!</h1>" + new Date().toLocalString();
			5) 此时我们把我们的项目运行起来, 发现可以通过index.jsp页面访问 hello.jsp页面及helloServlet.
			
		过滤器的动作(接上):
			1). 新建一个类(例如: Filter1), 实现Filter接口.
				//注意, 实现的是: javax.servlet包下的Filter接口.
			
			2). 重写接口中所有的抽象方法.
				//过滤的动作, 在doFilter()方法中实现.
				//例如: 可以在该方法中写一句话:
				System.out.println("-------执行拦截的动作-------);
			
			3). 去web.xml中 注册和配置过滤器拦截的路径.
				格式:
					//注册filter1(相当于创建了过滤器)
					<filter>
						<filter-name>过滤器名,可以自定义</filter-name>
						<filter-class>过滤器的全类名</filter-class>
					</filter>
					//映射, 配置filter1拦截的路径
					<filter-mapping>
						<filter-name>过滤器名,和上述一致</filter-name>
						<url-pattern></url-pattern>
					</filter-mapping>
					
				例如:
					//注册filter1过滤器
					<filter>
						<filter-name>aaa</filter-name>
						<filter-class>com.itheima.web.filter.Filter1</filter-class>
					</filter>
					//映射, 配置filter1拦截的路径
					<filter-mapping>
						<filter-name>aaa</filter-name>
						//这里的拦截路径, 可以写多个.
						<url-pattern>/hello.jsp</url-pattern>
						<url-pattern>/helloServlet</url-pattern>
					</filter-mapping>
					
		结论:	//记忆
			1) 过滤器可以拦截客户端对服务端的访问.
			2) 过滤器可以控制是否允许访问服务端的资源.
				//这个动作叫: 放行(在Filter1类的doFilter()方法中实现)
				chain.doFilter(request,response);
				
			
3. 配置多个过滤器和调整执行顺序.  
	//记忆:   多个过滤器组成: 过滤器链(FilterChain)
	
	配置多个过滤器(步骤和创建Servlet的方式类似):
		ctrl + n --> 选择"filter", 新建一个 过滤器类
		//注意修改过滤器类: 所拦截的"url"路径.
		
		了解: 关于 Select dispatchers(选择转发的方式)
			REQUEST:	直接请求.
			FORWARD:	请求转发.
			INCLUDE:	引入其他页面.
			ERROR:		错误页面.
	
	当某个浏览器所访问的资源(.jsp页面, servlet类)被多个过滤器拦截, 如何修改这些拦截器的拦截顺序:
		//大白话解释: 坐地铁, 飞机等, 是先过安检, 还是先检票.
		
		解决方案:
			修改web.xml文件中, 拦截器的位置.
			拦截器的配置信息越靠前, 越先执行.
			
		
4. 过滤器的生命周期方法
	1) 先执行过滤器的构造方法.
		//类似于: 成立安监部
	2) 在执行拦截器的初始化方法(init()方法)
		//类似于: 配置安检人员和装备等工作
		
	3) 执行拦截的动作. (doFilter()发放)
		//客户端每访问一次被拦截的资源(url路径), 都会执行该方法.
		//类似于: 执行安检动作,来一个人检查一个人.
	
	4) 销毁拦截器.	(destory()方法)
		//关闭服务器的时候销毁 该拦截器.
		//类似于: 解散安监部.
	
	现实生活举例:  //站在调度者的角色, 模拟安检的全过程.
		//过滤器 像 地铁站(火车站, 飞机场)的安检部门
		1) 成立安检部门.
		2) 干活前: 配置安检人员和装备等工作.
		3) 每天干活: 来一个检查一个...
		4) 解散, 收回安检设备, 发放遣散费(例如: 300W)
		//这四步刚好对应: 过滤器的四个动作.
	
	结论: 
		在tomcat服务器启动前, 拦截器的构造方法和初始化方法已经执行完了.
		
		

5. 过滤器的配置对象
	现实案例场景:
		不同时间, 不同的地点, 需要的安检人员是不一样的, 那就意味着要频繁调度安检人员.
		对应Java代码, 就是需要我们频繁的去修改init()方法中的参数值.
		而这些参数, 我们一般是放在: web.xml文件中的.
		
	案例: 在web.xml文件中, 配置当前过滤器的变量
		格式: 
			//注意, 写在过滤器的标签中(也就是写在<filter>标签中.).	
			//<!-- 配置当前过滤器的参数信息 -->
			<init-param>
				<param-name>参数名</param-name>
				<maram-value>参数值</param-value>
			</init-param>
		
		示例代码:
			<init-param>
				<param-name>size</param-name>
				<maram-value>666</param-value>
			</init-param>
			
		完成上述配置后, 在Filter类的init()方法中,就可以通过如下的方式获取属性了
			String 变量名 = config.getInitParameter("属性名");
			例如:
				String ss = config.getInitParameter("size");
				//这里的config是 FilterConfig类型的对象.
				
	//这个内容非常类似Day11我们讲解的ServletConfig对象(servlet类的配置信息对象).


6. 过滤器的拦截方式
	思考: 目前我们学习的客户端访问服务器资源有几种方式?
		1) 直接访问(一种).
			就是我们学习的: request.	//默认的拦截方式
			
		2) 间接访问(三种).
			A: 请求转发. 		forward
			B: 引入其他页面		include
			C: 配置错误页面.	error
			
	结论: 
		默认的拦截方式是: request, 如果想修改"拦截方式"可以通过
		<dispatcher>标签实现.
		例如:
			<dispatcher>FORWARD</dispatcher>
			<dispatcher>REQUEST</dispatcher>
			
		注意: 
			拦截方式可以同时设置多个.
			

7. 案例1的编写
	背景:
		服务器获取客户端的请求数据时, 为了防止出现乱码, 都会写上:
			request.setCharacterEncoding("utf-8");
		服务器响应客户端的信息时, 为了访问出现乱码, 也都会写上:
			response.setContentType("text/html;charset=utf-8");
			
		每个servlet都设置一次的话, 很麻烦, 所以我们可以把上述的代码
		放到过滤器中. 之后客户端访问服务器都会先经过该过滤器, 这样就
		不用再每个Servlet类都设置:  上述的两行代码了.
		
		
	需求: 通过过滤器解决: 请求和响应的乱码问题.
		1) 在项目下编写input.jsp页面.
			<form action="${pageContext.request.contextPath}/demo1Servlet" method="post">
				请输入您的大名 <input type="text" name="username" /> <br/>
				<input type="submit"/>
				
			</form>
			
			
		2) 新建Demo1Servlet类, 读取浏览器的数据, 并给浏览器响应一句话.
			//解决请求时的乱码问题
			request.setCharacterEncoding("utf-8");
			//解决响应时的乱码问题
			response.setContentType("text/html;charset=utf-8");
		
			//1. 读取浏览器发过来的数据.
			String username = request.getParameter("username");
			
			//2. 给浏览器响应内容.
			response.getWriter().println("幸会, " + username);


		3) 此时虽然解决了"请求和响应"时的乱码问题, 但是每次设置很麻烦.
		
		4) 我们可以新建一个过滤器类(例如: EncodingFilter).
			//该类实现: Filter接口.
			//在该类的的doFilter()方法中编写: 解决乱码问题的代码
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");

		5) 此时就可以把刚才写在Demo1Servlet类中的: 下述两行代码删除了.
			//解决请求时的乱码问题
			request.setCharacterEncoding("utf-8");
			//解决响应时的乱码问题
			response.setContentType("text/html;charset=utf-8");


8. 案例2的原理图
	需求: 案例二: 过滤器解决请求时的乱码问题
	//装饰类的代码
		/**
		 * 这个是内部类, 用来装饰request对象的, 对其"获取浏览器提交数据的方法"进行升级
		 * 
		 * 装饰设计模式思路:
		 * 	1. 定义一个成员变量, 用来记录被装饰的类的引用.
		 *  2. 在构造方法中, 传入被装饰的对象的引用.
		 *  3. 升级指定的方法即可.
		 * @author Liu
		 *
		 */
		class MyRequest extends HttpServletRequestWrapper {
			//1. 
			private HttpServletRequest hsr;
			
			//2.
			public MyRequest(HttpServletRequest request) {
				super(request);
				//2
				this.hsr = request;
			}
			
			//问题: 如果属性值是重复获取的, 有可能导致该方法的调用次数过多, 导致乱码问题出现.
			//解决方案: 用标记变量记录, 只调用一次即可.
			boolean isUpdate = false;   //true:修改过了, false:没有修改
			
			//3. 升级getParameterMap()方法
			@Override
			public Map<String, String[]> getParameterMap() {
				//3.1 获取提交方式, 然后判断
				String method = hsr.getMethod();
				//3.2 如果是post方式提交数据, 用设置编码表的方式解决
				if ("post".equalsIgnoreCase(method)) {
					try {
						//设置编码表
						hsr.setCharacterEncoding("utf-8");
						//返回从被装饰后的 request对象中获取的数据.
						return hsr.getParameterMap();
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
					
				//3.3 如果是get方式提交数据, 用先编码, 后解码的思路解决
				} else if ("get".equalsIgnoreCase(method)) {
					//get方式需要把每一个值都进行"编解码"操作. 
					Map<String, String[]> maps = hsr.getParameterMap();
					if (!isUpdate) {
						//先做不为null校验
						if (maps != null) {
							for (String key : maps.keySet()) {
								//key表示的就是浏览器提交的属性名,  maps.get(key)就是浏览器提交的值
								String[] values = maps.get(key);
								//因为值是数组, 我们接着遍历
								if (values != null) {
									for (String value : values) {
										try {
											value = new String(value.getBytes("iso-8859-1"),"utf-8");
										} catch (UnsupportedEncodingException e) {
											e.printStackTrace();
										}
									}
								}
							}
							
						}
						isUpdate = true;
					}
					return maps;
				}
				
				//如果不是get和post方式提交数据, 该怎么处理就怎么处理.
				return super.getParameterMap();
			}
			
			@Override
			public String getParameter(String name) {
				String[] values = this.getParameterMap().get(name);
				return values != null && values.length > 0 ? values[0] : null;
			}
			
		}
		

9. 监听器简介
	案例: 宝强找私家侦探调查MR.
		1. 私家侦探肯定记录MR"不好"的事情.
		2. 其中: 私家侦探充当的就是"监听者"的身份, MR就是"被监听者"的身份.
		
		转化成Java代码, 叫:
			监听器对象:    				//类似于私家侦探.
			被监听对象(也叫事件源)		//类似于MR
			监听到的动作(也叫事件对象):	//类似于记录的MR"不好"的事情.
			
	
	结论:
		监听器监听 指定对象的 指定行为.
		
		被监听对象有哪些呢?
			request, session, servletContext
			
		监听哪些行为呢?
			1. 监听容器的创建和销毁.
			2. 监听容器中属性的变化(增加, 替换, 删除).
			3. 让对象感知自己被绑定和解绑, 钝化和活化.
				绑定和解绑: 
					//指的是对象感知自己被放到session中和从session中移除.
				钝化和活化:
					//指的是对象感知自己随session的钝化和活化.
					//钝化: 内存到硬盘.
					//活化: 硬盘到内存.
				
				
10. 监听器的API简介
	监听器术语:
		1. 事件源：被监听对象。（目标对象）
		2. 监听器对象：用于监听“事件源”的对象	
		3. 注册（绑定）：将“监听器对象”注册给“事件源”。
			当“事件源”发生某些行为时，监听对象将被执行。
		4. 事件：事件源行为的称呼。
		5. 事件对象：在“监听器对象”中获得“事件源”.
	监听器的编写流程
		1.	编写监听器实现类，需要实现指定的接口
		2.	在web.xml文件配置监听器（部分监听不需要配置）
			<listener>
				<listener-class>xxx</listener-class>
			</listener>

	
11. request对象和session对象的创建和销毁
	request对象:
		写在Demo1Servlet类的doGet()方法中的代码:
			//需求1: 测试request的创建和销毁
			//结论: 每次请求都会创建新的request对象, 请求完毕后就request就销毁了.
			request.setAttribute("username", "张三");
			System.out.println(request.getAttribute("username"));
			
			
			//需求2: 测试session的创建和销毁
			//结论1: 第一次调用request.getSession()才会创建session对象.
			//结论2: 调用session.invalidate(), 超时30分钟(默认), 断电, 才会销毁.
			HttpSession hs = request.getSession();
			hs.setAttribute("city", "新乡");
			System.out.println("session city=" + hs.getAttribute("city"));
			hs.invalidate();
			
		监听器类的代码:	//下边是两个监听器类的代码
			public class MyRequestListener implements ServletRequestListener {

				public MyRequestListener() {
				}

				public void requestDestroyed(ServletRequestEvent sre)  { 
					System.out.println("监听request对象的销毁");
				}

				public void requestInitialized(ServletRequestEvent sre)  {
					System.out.println("监听新的request对象的创建");
				}
				
			}
			
			
			public class MySessionListener implements HttpSessionListener {

				public MySessionListener() {
				}

				public void sessionCreated(HttpSessionEvent se)  { 
					//Event: 事件, 通过事件对象可以获取事件源对象(被监听对象)的引用
					HttpSession hs = se.getSession();
					System.out.println(hs.getId() +"对应的session被创建了......");
					
				}

				public void sessionDestroyed(HttpSessionEvent se)  { 
					HttpSession hs = se.getSession();
					System.out.println(hs.getId() +"对应的session被销毁了......");
				}
				
			}
	

12. 监听context对象的创建和销毁
	public class MyContextListener implements ServletContextListener {

		public MyContextListener() {
		}

		public void contextDestroyed(ServletContextEvent sce)  { 
			System.out.println("==========ServletContext被关闭了 等价于  项目关闭了========");
		}

		public void contextInitialized(ServletContextEvent sce)  { 
			System.out.println("==========ServletContext被创建了  等价于 项目启动了========");
			
			//定时器, 了解即可: JS中也有: setInterval()方法.
			//Java中的定时器: Timer
			
			//创建定时器.
			Timer timer = new Timer();
			//定时执行任务
			System.out.println("================" + new Date().toString());
			/*
			 * 第一个参数: 每次执行的任务代码
			 * 第一个参数: 多少毫秒后开始执行
			 * 第一个参数: 每隔多少毫秒执行一次
			 */
			//执行10次结束如何实现?
			timer.schedule(new TimerTask() {
				int num = 0;
				@Override
				public void run() {
					num++;
					System.out.println("定时执行----" + new Date().toString());
					if (num == 10 ) {
						 //取消定时器
						timer.cancel();
					}
				}
			}, 3000, 1000);
		}
		
	}


13. 监听session容器属性的变化
	//因为request, session, ServletContext容器的: 属性变化都相似, 所以这里只演示session容器.
	
	public class MySessionAttributeListener implements HttpSessionAttributeListener {

		public MySessionAttributeListener() {
		}

		public void attributeAdded(HttpSessionBindingEvent se)  {
			//获取监听对象
			HttpSession hs = se.getSession();
			
			//获取增加的属性名
			String name = se.getName();
			
			//获取增加的属性值
			Object value = hs.getAttribute(name);
			
			System.out.println("*******session 增加了属性..." + name + "=" + value);
		}

		public void attributeRemoved(HttpSessionBindingEvent se)  { 
			//获取监听对象
			HttpSession hs = se.getSession();
			
			//获取删除的属性名
			String name = se.getName();
			
			System.out.println("*******session 删除了属性..." + name);
		}

		public void attributeReplaced(HttpSessionBindingEvent se)  { 
			//获取监听对象
			HttpSession hs = se.getSession();
			
			//获取替换的属性名
			String name = se.getName();
			
			//获取替换的属性值
			Object value = hs.getAttribute(name);
			
			System.out.println("*******session 替换了属性..." + name + "=" + value);
		}
		
	}



14. 绑定和解绑
	1) 在com.itheima.domain包下新建一个类: Bean1
		//属性: String info
		
	2) 在Demo1Servlet类中完成如下代码:
		//需求4： 使对象感知自己被放到session中和从session中移除
		//例如: 可以用来统计某网站等的: 在线人数.
		Bean1 b = new Bean1();
		
		b.setInfo("夯夯是最纯洁的!");
		
		HttpSession hs = request.getSession();
		hs.setAttribute("bean1", b);
		
		//移除的方式一: 
		hs.removeAttribute("bean1");
		
		//移除的方式二: session容器被销毁, 里边的数据也被销毁.
		hs.invalidate();

	3) 让Bean1类实现: HttpSessionBindingServlet, 重写接口中的方法
		//往session容器中添加该类对象时调用.
		@Override
		public void valueBound(HttpSessionBindingEvent event) {
			System.out.println(this + "感知自己被放到session中");
		}

		//从session容器中往外移除本类对象时调用.
		@Override
		public void valueUnbound(HttpSessionBindingEvent event) {
			System.out.println(this + "感知自己被从session中移除");
		}



15. 钝化和活化
	钝化: 使对象感知自己随session钝化到硬盘上.
	活化: 使对象感知自己随session活化到内存中.


	步骤:
		1) 自定义类, 编写Bean2类.
			//属性: String name, String city

		2) 在Demo1Servlet中完成: 		//设置属性 
		
		3) 在Demo2Servlet中完成:		//读取属性

		4) 让Bean2类实现HttpSessionActivationListener接口, 重写接口中的方法.
			
				@Override
				public void sessionWillPassivate(HttpSessionEvent se) {
					System.out.println(this + "感知自己随session钝化到硬盘上....");
				}

				@Override
				public void sessionDidActivate(HttpSessionEvent se) {
					System.out.println(this + "感知自己随session活化到内存中");
				}
		5) 让Bean2类实现: Serializable接口.
			//类想实现序列化或者反序列化, 必须实现这个接口.
			//序列化:	把对象写入到文件中.
			//反序列化: 从文件中加载对象到内存.




			
			
补充知识:	Debug断点调试:
	
调试的步骤:
	1. 加断点.
		//哪里不会点哪里.
		
	2. 选择"debug"进入调试页面即可.
	
	3. 进去以后看哪?
		左上:	代码执行到哪里了.
		
		左中:	源码区(显示的就是源代码)
		
		左下:	控制台, 可以查看结果.
		
		右上:	变量值的变化, 以及断点.
		
		
	4. 怎么调试?
		F5: 逐过程调试.	//step in
			遇到方法了, 会进到方法中, 一行一行的调试.
		F6: 逐行调试. 	//step out
			不管遇到的是啥, 都当做一行处理.
		F8: 调到下一个断点(如果断点是最后一个, 会结束调试.)
		
		System.out.println(1);
		int sum = getSum(a,b);
		System.out.println(2);
			

	5. 移除断点.
		breakpoints  --> 选择"双叉", 表示移除所有的断点.






