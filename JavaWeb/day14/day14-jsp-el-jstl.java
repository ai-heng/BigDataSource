今日内容大纲:
	JSP
	EL表达式
	JSTL:
	案例: 动态加载商品信息.











今日内容:
1. jsp注释
	为什么要学习JSP?
		1) HTML代码是不能操作数据库的, 目前我们学习的语言, Java代码是可以操作数据库. 
		2) 目前可以和HTML页面交互的只有Servlet,Servlet拼接HTML然后交给浏览器, 浏览器进行显示.
		3) 但是Servlet拼接HTML代码是非常麻烦的, 所以用JSP解决.
		
	jsp中可以写以下的注释:
		<!-- 这个是HTML的注释方式 -->
		
		<%
			//这个是Java的单行注释
			
			/*
				这个是Java的多行注释
			*/
			
			/**
				这个是Java的文档注释
			*/
		%>
		
		<%-- 这个是JSP的注释 --%>
		
		
	注意事项:
		1) html注释对java代码不起作用.
			<!-- 注意1: HTML注释不能注释Java代码, 案例:
				<%=request.getRemoteAddr() %>
			 -->
		2) jsp注释既可以注释html代码, 也可以注释java代码.
			<%-- JSP注释既可以注释HTML代码, 也可以注释java代码 
				<h3>我是标题</h3>
				<%=request.getRemoteAddr(); %>
			--%>
		
		
	结论:
		最终我们通过浏览器查看该jsp页面, 发现只显示html的注释, 为什么?
		因为先把.jsp文件解析成.java文件(此时不识别jsp注释), 
		然后把.java文件编译成.class文件(此时不识别java注释), 
		最后把.class文件加载到页面中并解析, 我们看到的就只有html的注释.
		//我们可以通过查看该.jsp文件在 work文件夹下对应的.java文件得到结果.
		

2. 嵌入java代码的三种方式:
	jsp的原理:
		1) 浏览器访问.jsp文件, 服务器会把.jsp页面解析成.java文件.
		2) 然后把.java文件编译成.class文件.
		3) 最后服务器把.class文件 响应给浏览器.
		4) 浏览器接收到服务器响应的数据后, 解析, 显示.


	嵌入java代码的三种方式:
		//<!-- 脚本表达式, 作用: 向浏览器输出内容 -->
		<%="hello world" %>
		<%=123 %>
		<%=false %>
		<%=10.3 %>
		
		<hr>
		
		//<!-- 脚本片段   作用: 类似于以前写在Java方法中的代码 -->
		<!-- 案例 : 向浏览器输出1-10, 奇数为红色, 偶数为蓝色-->
		<%
			for(int i=1; i<=10; i++) {
				if(i % 2 == 0) {//偶数
		%>
					<font color="blue"><%=i %></font>
		<%	
				} else {
		%>
					<font color="red"><%=i %></font>
		<%	
				}
			}
		%>
		<hr/>
		
		//<!-- .jsp文件本质就是一个Servlet, 它有一些内置对象, //我们可以直接使用. 例如:  -->
		request.getContextPath()...<%=request.getContextPath() %><br/>
		application.getContextPath()...<%=application.getContextPath() %>
		
		<hr/>
		
		//<!-- 脚本声明: 声明当前类的成员变量, 成员方法, 内部类等 -->
		<%!
			String name = "zhangsan";
			int age = 23;
			
			public int getSum(int a,int b) {
				return a + b;
			}
			
			class Inner{
				public Inner() {
					System.out.println("我是内部类");
				}
			}
		%>
		3 + 5 = <%=getSum(3, 5) %>>

3. 出现异常怎么办?
	配置项目的错误页面:
		方式一: 在配置指令中加一句话:
			1) errorPage="/500.jsp"
				例如:
					<%@ 
						page language="java" 
						contentType="text/html; charset=UTF-8"
						pageEncoding="UTF-8"
						errorPage="/500.jsp"
					%>	
			2) 把"资料"文件夹下的"18_错误页面"文件夹中的内容复制到: 
			   项目下的: WebContent文件夹中.
			   
		方式二:  配置当前项目的错误页面
			在项目下的web.xml中进行设置:
				<!-- 配置当前项目的错误页面 -->
				<error-page>
					<error-code>404</error-code>
					<location>/404.jsp</location>
				</error-page>
				
				<error-page>
					<error-code>500</error-code>
					<location>/500.jsp</location>
				</error-page>

	如果页面出现异常了, 我们想看异常信息怎么办?
		1) 在配置指令中设置, 把当前页面设置为错误页面. 
			isErrorPage="true"
			//例如: 可以在404.jsp,500.jsp页面中进行如上的设置
		2) 在想要输出异常信息的地方就可以直接写如下代码了.
			<%=exception.getMessage() %>
	

4. out对象
	.jsp页面有9大内置对象, 这9大内置对象可以在.jsp页面中直接使用.
	//request, response, 
	//ServletConfig(config), ServletContext(application)
	//exception,out,session, 
	//page, pageContext
	
	案例: 观察如下代码, 看输出结果
		<!-- 猜结果: -->
		<%
			out.print("out输出1 <br/>");
			response.getWriter().println("response输出1 <br/>");
		%>
		
		//结论: 输出结果为: response输出1, 然后才是 out输出1.
		
		/*
			原因: 因为.jsp页面有 out缓冲区, response缓冲区, 当.jsp文件执行完或者out缓冲区满了, 
				  才会把out缓冲区中的内容直接放入到 response缓冲区中, 
				  最后浏览器直接解析response缓冲区的内容.
		*/
		
		优化:  如果想输出结果为: out输出1, response输出1, 怎么办?
			在页面的配置指令中做如下设置:
				buffer="0KB"
			这样就越过out缓冲区, 直接往response缓冲区中放置数据了.
			
		新问题:
			当文件内容比较大, 既用out,也用response就无法保证文件内容的顺序了, 怎么解决?
			
			解决方案: 要么只用out, 要么只用response.
			
5. 通过pageContext对象获取其他内置对象
	pageContext对象的作用一:
		通过它可以获取(.jsp文件中)其他内置对象的引用.
		
	示例代码:
		<%
			// 通过pageContext内置对象获取4个域容器对象
			Object p = pageContext.getPage();
			ServletRequest  sr = pageContext.getRequest();
			HttpSession hs = pageContext.getSession();
			ServletContext sc = pageContext.getServletContext();
			
			//问题: 上述的 sr === request  是等价的吗?
			//答:  是等价的.
			sr.setAttribute("meinv", "wanglikun");		
		%>
			<%=request.getAttribute("meinv") %>
		
		
6. 通过pageContext对象操作域容器中的数据
	先把Product类, Category类的代码拷贝到项目下的: com.itheima.domain包下.
	然后在页面中完成如下测试:
		<%
			// 1 通过pageContext内置对象 增加数据
			pageContext.setAttribute("city", "北京1", PageContext.PAGE_SCOPE); //page
			pageContext.setAttribute("city", "北京2", PageContext.REQUEST_SCOPE); //request		
			pageContext.setAttribute("city", "北京3", PageContext.SESSION_SCOPE); //session
			pageContext.setAttribute("city", "北京4", PageContext.APPLICATION_SCOPE); //ServletContext

			// 3 通过pageContext内置对象 删除数据
			//pageContext.removeAttribute("city");	//删除所有域中指定的参数

			pageContext.removeAttribute("city", PageContext.PAGE_SCOPE);
			pageContext.removeAttribute("city", PageContext.REQUEST_SCOPE);
			pageContext.removeAttribute("city", PageContext.SESSION_SCOPE);
			pageContext.removeAttribute("city", PageContext.APPLICATION_SCOPE);

			// 2 通过pageContext内置对象 获取数据
			/* out.println(pageContext.getAttribute("city"));
			out.println(pageContext.getAttribute("city",PageContext.REQUEST_SCOPE));	
			out.println(pageContext.getAttribute("city",PageContext.SESSION_SCOPE));	
			out.println(pageContext.getAttribute("city",PageContext.APPLICATION_SCOPE)); */

			out.println("<hr />");

			// 4 通过pageContext内置对象 获取域中数据的简化方式
			//按照page, request, session, application的顺序进行查找
			out.println(pageContext.findAttribute("city"));
			out.println("<hr />");

			// 5 通过pageContext内置对象 操作复杂数据
			Category c = new Category("C011", "运动健身");
			Product p = new Product("P666", "跳绳", 500, c);
			
			//把商品放到page容器中.
			pageContext.setAttribute("product", p);
		%>
		商品名称: <%=((Product)pageContext.getAttribute("product",PageContext.PAGE_SCOPE)).getPname() %> <br/>
		商品类别名称: <%=((Product)pageContext.getAttribute("product",PageContext.PAGE_SCOPE)).getCategory().getCname() %>
		<hr/>
		<h1>EL表达式</h1>
		商品名称: ${pageScope.product.pname }	<br/> 
		商品类别名称: ${pageScope.product.category.cname }
	
7. 通过el获取参数信息
	EL表达式的作用:
		代替.jsp文件中的Java代码, 因为JSP获取指定的数据比较麻烦.
		
	EL表达式的格式:
		${...}
		
	EL获取参数信息的格式:
		${param.参数名 }
		
	示例:
		username = ${param.username } <br/>
		city = ${param.city } 
		
8. 获取请求头信息
	//<!-- 需求: 获取用户请求头信息 -->
	//<h3>Java代码实现</h3>
		Accept = <%=request.getHeader("accept") %> <br>
		User-Agent = <%=request.getHeader("user-Agent") %>
		
	//<h3>EL表达式实现</h3>
		Accept = ${header.accept }					//这种方式适用于: 属性名中不带特殊符号的.
		User-Agent = ${header["user-agent"] }		//这种方式适用于: 所有的属性名.
 
9. 获取cookie中的数据
	//<!-- 需求: 获取浏览器给服务器传递的cookie信息 -->
	//<h3>Java代码获取</h3>
	<%
		Cookie[] cookieArr = request.getCookies();
		if(cookieArr != null) {
			for(Cookie cookie : cookieArr) {
				if("JSESSIONID".equals(cookie.getName())) {
					out.println("Java Code : JSESSIONID = " + cookie.getValue());
				}
			}
		}
	%>
	<hr>
	//<h3>EL表达式</h3>
		EL Code : JSESSIONID = ${cookie.JSESSIONID }<br />
		EL Code : JSESSIONID = ${cookie.JSESSIONID.name }<br />
		EL Code : JSESSIONID = ${cookie.JSESSIONID.value }
	
10. 获取项目路径
	//<!-- 需求: 获取项目路径 -->
	//<h3>Java代码</h3>
		项目路径 = <%=request.getContextPath() %> <br>
		项目路径 = <%=((HttpServletRequest)pageContext.getRequest()).getContextPath() %><br>
		
		项目路径 = <%=request.getServletContext().getContextPath() %><br>
		项目路径 = <%=((HttpServletRequest)pageContext.getRequest()).getServletContext().getContextPath() %><br>
		
	<hr>		
		
	//<h3>EL表达式</h3>
		项目路径 = ${pageContext.request.contextPath }	<br>	//推荐写法
		项目路径 = ${pageContext.request.servletContext.contextPath }	<br>
		
	案例: 把index页面的项目名, 用${pageContext.request.contextPath }替换.
		
	
11. 通过EL获取域容器的简单数据
	//<!-- 需求: 获取域容器中的简单数据 -->
	<%
		// 1 通过pageContext内置对象 增加数据
		pageContext.setAttribute("city", "北京1", PageContext.PAGE_SCOPE); //page
		pageContext.setAttribute("city", "北京2", PageContext.REQUEST_SCOPE); //request		
		pageContext.setAttribute("city", "北京3", PageContext.SESSION_SCOPE); //session
		pageContext.setAttribute("city", "北京4", PageContext.APPLICATION_SCOPE); //ServletContext
		
		pageContext.removeAttribute("city");
	%>
	
	
	//<h3>Java代码</h3>
		<%=pageContext.getAttribute("city") == null ? "" : pageContext.getAttribute("city") %>
		<%=pageContext.getAttribute("city",PageContext.REQUEST_SCOPE) %>
		<%=pageContext.getAttribute("city",PageContext.SESSION_SCOPE) %>
		<%=pageContext.getAttribute("city",PageContext.APPLICATION_SCOPE) %>
	
	<hr>
	
	<h3>EL表达式获取 域容器中的简单数据</h3>
		${pageScope.city }
		${requestScope.city }
		${sessionScope.city }
		${applicationScope.city }
		
	<hr>
	
	//<h3>Java代码 由小到大依次获取 域容器中的简单数据</h3>
	<%=pageContext.findAttribute("city") %>
	
	<hr>
	
	//<h3>EL表达式 由小到大依次获取 域容器中的简单数据</h3>
		${city }
	
12. 通过EL获取域容器的复杂数据
	//<!-- 需求: 获取域容器中的复杂数据(自定义对象)-->
	<%
		Category c = new Category("C011", "运动健身");
		Product p = new Product("P666", "跳绳", 500, c);
		
		//把商品放到page容器中.
		pageContext.setAttribute("product", p);
	%>
	//<h3>Java代码获取</h3>
		商品名称  : <%=((Product)pageContext.getAttribute("product")).getPname() %>
		分类名称 : <%=((Product)pageContext.getAttribute("product")).getCategory().getCname() %>
	<hr>
	
	//<h3>EL表达式获取</h3>
		  商品名称  : ${pageScope.product.pname }
		  分类名称 : ${pageScope.product.category.cname }
	
	
13. 执行简单运算
	//<h1>需求1: 将a和b保存到page域中, 使用el计算 a+b</h1>
		<%
			pageContext.setAttribute("a", 2);
			pageContext.setAttribute("b", 5);
			pageContext.setAttribute("c", 9);
		%>
			a + b = ${a + b }	
		
	//<h1>需求2: 将a和b保存到page域中, 使用el计算 a+b+c</h1>
		a + b + c = ${a + b + c}	
		
	//<h1>需求1: 使用el表达式 判断集合是否为空</h1>
		<%
			List list = new ArrayList();
			list.add(1);
			pageContext.setAttribute("list1", list);
		%>	
		empty list = ${empty list1 } <br/>	 <!-- 意思是: list1是否为空 -->
		not empty list = ${not empty list1}
		
	//<h1>需求2: 使用el表达式 判断用户是否存在</h1>
			<%
				User loginUser = new User(1,"zhangsan","123","张三");
				pageContext.setAttribute("loginUser", loginUser,PageContext.SESSION_SCOPE);
			%>
			empty loginUser : ${empty loginUser }	<br/>
			not empty loginUser : ${not empty loginUser }
		<hr>
		
	//<!-- 案例: 判断用户是否存在, 存在就打印昵称, 不存在就提示 匿名登录 -->
			${empty loginUser ? "匿名登录" : loginUser.nickname }
	
	
14. el获取数组_集合_map中的数据
	//<!-- 需求: 获取域容器中的复杂数据(数组, list, map)-->
		<%
			//创建数据
			int[] arr = { 1, 2, 3, 4, 5 };

			//把数据放到域容器中
			pageContext.setAttribute("arr1", arr);
		%>
		数组 : arr = ${arr1 } <br/>
		元素: ${arr1[0] }  ${arr1[1] } ${arr1[2] } ${arr1[222] }	<br/>   
		
		<hr>
		
		<%
			List<String> list = new ArrayList<String>();
			Collections.addAll(list, "a","b","c");
			pageContext.setAttribute("list1", list);
		%>
			集合: ${list1 }<br/>   
			元素: ${list1[0] }  ${list1[1] }  ${list1[2] }  ${list1[222] } <br/>   
		<hr>
		
		<%
			Map<String,Integer> map = new HashMap<String,Integer>();
			map.put("aaa",111);
			map.put("bbb",222);
			map.put("ccc",333);
			pageContext.setAttribute("map1", map);	
		%>
			集合 : ${map1 }  <br/>
			元素: 
				aaa = ${map1.aaa }
				bbb = ${map1.bbb }
				ccc = ${map1.ccc }
			
	//<!-- 我们发现一个问题, 如果元素比较多, 一个一个写比较麻烦, 可以不可以通过遍历的方式实现呢? 这就是接下来我们要学习的: JSTL -->
	
	
15. jstl增强for循环
	JSTL的概述:
		JavaServlet规范.
		
	步骤:
		1) 导包.
		
		2) 引入名称空间.
			//  标签库											前缀
			<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
	
		3) 遍历数组和集合即可.
			<c:forEach items="${属性名 }" var="元素名">
				${元素名 }   <br />
			</c:forEach>
			
			示例:
				<c:forEach items="${arr1}" var="element">
					${element}
				</c:forEach>
	
	案例代码:
		//<!-- 需求: 遍历域容器中的复杂数据(数组, list, map) -->
			<%
				//创建数据
				int[] arr = { 11, 22, 33, 44, 55 };

				//把数据放到域容器中
				pageContext.setAttribute("arr1", arr);
			%>
				<c:forEach items="${arr1 }" var="element">
					${element } <br/>
				</c:forEach>
			
			<hr>
			
			<%
				List<String> list = new ArrayList<String>();
				Collections.addAll(list, "a","b","c");
				pageContext.setAttribute("list1", list);
			%>
				<c:forEach items="${list1 }" var="e">
					${e }	<br/>
				</c:forEach>
			
			<hr>
			
			<%
				Map<String,Integer> map = new HashMap<String,Integer>();
				map.put("aaa",111);
				map.put("bbb",222);
				map.put("ccc",333);
				pageContext.setAttribute("map1", map);	
			%>
				<c:forEach items="${map1 }" var="entry">
					${entry.key } = ${entry.value } <br>
				</c:forEach>
	

16. 普通循环和判断
	案例: 遍历1~10, 偶数为红色, 奇数为蓝色
	1) 引入名称空间.
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
	2) 普通循环的格式
		<c:forEach begin="开始的值" end="结束的值" step="递增量" var="变量名">
			${变量名 }
		</c:forEach>
		示例代码:
			<c:forEach begin="1" end="10" step="1" var="i">
				${i }
			</c:forEach>
	3) 判断.
		使用c:if 标签，在JSP页面上可以完成if判断。
		//注意在JSTL核心标签库中没有c:else.只有c:if
		示例代码:
			<c:if test="${i%2 ==0 }">
				<font color="red">${i }</font>
			</c:if>
	
	
17. 格式化日期
	案例: 把日期对象转换成我们喜欢看的格式
		1) 引入名称空间.
			<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
		2) 设定要操作的值和模板即可.
			<fmt:formatDate value="${date1 }" pattern="yyyy-MM-dd HH:mm:ss"/>
		
	案例代码:
		<!-- 需求: 格式化日期 -->
		<%
			Date date = new Date();
			pageContext.setAttribute("date1", date);
		%>
			时间  :  ${date1 }
		<hr>
		<fmt:formatDate value="${date1 }" pattern="yyyy-MM-dd HH:mm:ss"/>		
		
18. 商品展示原理图
	//和以前登陆注册案例比较类似, 还是需要用到分层的思想.
	
19. 搭建项目的准备工作.
	1) 创建数据库, 数据表, 及数据.
	
	2) 创建项目.
	
	3) 把资料\原型(文件夹)下所有的内容拷贝到: 项目的WebContent文件夹下.
	
	4) 把要使用的jar包拷贝到: lib 文件夹中.
	
	5) 把c3p0-config.xml拷贝到src文件夹下.
	
	6) 新建包.
	
	7) 把JDBCUtils工具类拷贝到com.itheima.utils包下.
	
	8) 在com.itheima.domain包下创建 Product实体类, 对应数据表中的字段名.
		private String pid;			//编号
		private String pname;		//名称
		private double market_price;//市场价格
		private double shop_price;	//商城价格
		private String pimage;		//图片
		private Date pdate;			//上传日期
		private int is_hot;			//是否热门: 1:是; 0:否
		private String pdesc;		//商品的描述信息
		private int pflag;			//是否商家: 1:是; 0:否
		private String cid;			//类别编号
	
	
	
20. 代码编写.


21. 静态导入和动态导入
	静态导入:
		<%@ include file="/01_jsp/jingtai/top.jsp"%>
		<%@ include file="/01_jsp/jingtai/body.jsp"%>
		<%@ include file="/01_jsp/jingtai/footer.jsp"%>
		
		//静态导入思路: 把多个.jsp页面合并为一个: .java文件, 然后编译成.class, 再被浏览器解析.
		
	动态导入:
		<jsp:include page="/01_jsp/jingtai/top.jsp"></jsp:include>
		<jsp:include page="/01_jsp/jingtai/body.jsp"></jsp:include>
		<jsp:include page="/01_jsp/jingtai/footer.jsp"></jsp:include>
		
		//动态导入思路: 每个导入的页面都会生成其对应的.java文件, 然后编译成.class文件, 再被浏览器识别.

22. 静态导入和动态导入的应用场景
	某项目多个页面, 页面的部分内容是一致的, 部分模块是可变的, 就可以使用动态导入和静态导入解决.
	例如:
		网站的各个网页: logo, 公司法人, 联系电话, 地址都是一样的.
	
	
	
	


