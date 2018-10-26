1. 案例一: 全选, 全不选
	$(function() {
		//全选
		$("#checkall").click(function() {
			$("input[name='items']").prop("checked",true);			
		});
		//全不选
		$("#checkallNo").click(function() {
			$("input[name='items']").prop("checked",false);			
		});
		//全选/全不选
		$("#checkAllOrNot").click(function() {
			//获取目前的状态
			//JS写法
			var status = this.checked;
			//JQuery写法
			//var _status = $(this).prop("checked");
			$("input[name='items']").prop("checked",status);
		});
		//反选
		
		$("#check_revsern").click(function() {
			$("input[name='items']").each(function() {
				var _status = $(this).prop("checked");
				$(this).prop("checked", !_status);
			});			
		});
	});


2. 案例二: 表格隔行变色和高亮
	//核心思路: 其实就是给表格的指定行 添加样式(addClass())和删除样式(removeClass()).
	$(function(){
			//给奇数行(索引为奇数)设置样式为: one
			$("table tr:odd").addClass("one");
		
			//给偶数行(索引为偶数)设置样式为: two
			$("table tr:even").addClass("two");
		
			//分解版
		/* 	//设置鼠标悬浮事件
			$("table tr").mouseover(function() {
				$(this).addClass("over");
			});
			
			//设置鼠标移出事件
			$("table tr").mouseout(function() {
				$(this).removeClass("over");
			}); */
			
			//合并版
			$("tabl e tr").hover(
				function() {
					$(this).addClass("over");
				},
				function() {
					$(this).removeClass("over");
				}
			);
		});
		

3. JSON简介
	/* 
		JSON对象: 
			JavaScript Object Notation, JavaScript对象表示法.
			简单理解, 就是JS对象 对应的字符串形式的写法.
			其格式为: 
				键值对类型的数据, 
			例如:
				var v = {键 : 值}
				
	*/
	var studentJson = {"name":"张三", "age":"23"};
	
	//获取值的第一种方式
	document.write("name = " +  studentJson.name + "<br/>");
	document.write("age = " + studentJson.age + "<hr>");
	
	//获取值的第二种方式
	document.write("name == " + studentJson['name'] + "<br>");
	document.write("age == " + studentJson['age'] + "<hr>")
	
	//获取值的第三种方式
	for(var key in studentJson) {
		document.write(key + " === " + studentJson[key] + "<br>");
	}
	document.write("<hr>")
	
	//JSON数组, 里边记录的是3个学生的信息
	var studentJsonArr = [
		{"name":"王丽坤", "age":"23"},
		{"name":"王洛丹", "age":"24"},
		{"name":"刘亦菲", "age":"25"}
	];
	//JSON数组的遍历方式:
	for(var i=0; i<studentJsonArr.length; i++) {
		var studentJson = studentJsonArr[i];
		for(var key in studentJson) {
			document.write(key + "..." + studentJson[key] + "<br>");
		}
		document.write("<br>");
	}
	
	

4. 案例三: 菜单联动
	$(function(){
		//2.1 定义一个字符串, 记录要往province下拉列表中添加的数据 
		var provinceStr = "<option value='none'>--请选择省--</option>";
		//1. 获取所有的省份信息(p_id,p_name) 
		for(var i = 0; i< china.length; i++) {
			//1.1 china[i] 记录的就是每个省份的信息
			var province = china[i];
			//document.write(province.p_id + "..." + province.p_name + "<br>")
			//2 把省份信息保存到: id为: province下拉列表中
			//2.2 拼接字符串
			provinceStr += "<option value='"+ province.p_id +"'>" + province.p_name +"</option>";
		}
		//2.3 省份信息保存到下拉列表中
		$("#province").html(provinceStr);
		
		//3. 当省份信息发生变更是, 城市信息也发生改变.
		//获取该省份对应的城市信息, 把城市信息加入到id为city的下拉列表中.
		$("#province").change(function() {
			//3.1 获取用户选择的省份的p_id值.
			var province_id = $(this).val();
			
			var cityStr = "<option value='none'>--请选择市--</option>";
			//3.2 获取所有的城市的 p_id值, 然后比较
			for(var i = 0; i<china.length; i++) {
				//china[i]记录的是每个省份的信息
				var province = china[i];
				//判断id是否一致
				if(province_id == province.p_id) {
					//此时province记录的就是: 要往city下拉列表中添加的省份的所有信息.
					//获取到该省份对应的市信息, 加入到city下拉列表即可.
					for(var j=0; j<province.cities.length; j++) {
						cityStr += "<option value='"+ province.cities[j].c_id +"'>"+ province.cities[j].c_name +"</option>";
					}
				}
			}
			//3.3 如果id一致, 就将该id对应的所有城市信息, 加入id为city的下拉列表中.
			$("#city").html(cityStr);			
			
		});
	});
	
	
5. ajax的简介
	为什么要讲ajax?
		例如: 用户注册账号的时候, 当用户录入用户名的时候, 假设该用户名被占用了, 会立马提示, "该用户已存在" , 这个需求, 就可以通过ajax实现.
		//由ajax读取数据库的数据, 然后给出提示, 这个是"局部刷新"技术.
		
		
	ajax是什么?
		AJAX即“Asynchronous Javascript And XML”（异步JavaScript和XML）可以使网页实现异步更新.
		就是不重新加载整个网页的情况下，对网页的某部分进行更新（局部刷新）。
		传统的网页（不使用 AJAX）如果需要更新内容，必须重载整个网页页面。	
		AJAX = 异步 JavaScript和XML，是一种新的思想，整合之前的多种技术，用于创建快速交互式网页应用的网页开发技术.
		//重点记忆:  ajax就是不重新加载整个页面的情况下, 对页面的某部分进行"局部刷新".
		
		案例:
			我要给大家上课, 又要吃早点. 怎么并发的解决这两件事呢?
				我给大家上课, 由班主任老师帮我买早点.	
				//浏览器 通过 Ajax 实现获取后台(数据库)的数据.
				//我		班主任老师					早餐.
		

	
6. ajax的原理图
	案例: 模拟注册账号的动作.
		传统校验:	//同步
			1) 用户在浏览器录入账号信息(用户名, 昵称, 密码等),
			   点击"注册"按钮, 把表单数据提交到服务器.
			   
			2) 服务器查询数据库, 判断账号是否存在.(假设昵称被占用了).
			
			3) 将信息封装到response对象中, 返回给浏览器.
			
			4) 浏览器接收服务器端响应的数据, 刷新页面.
			   此时用户填写的所有的信息都会被清空.
			   //如果"注册表单"的表单项比较多的话, 这样做非常麻烦.
			 
		
		Ajax校验: 	//异步
			1) 用户在浏览器录入账号信息(用户名, 昵称, 密码等),
			   此时会给这些"表单项"注册"离焦"事件,用来校验该项信息.
			   
			2) 由ajax对象接收用户在浏览器录入的数据, 然后去查询
			   数据库获取指定的结果. 并将结果封装在ajax对象中.
			   
			3) 由ajax对象把从数据库中查询的结果返回给浏览器.
			   这样浏览器只需要刷新"局部"即可, 不需要全部刷新.
			   
7. 传统ajax操作
	步骤:
		1) 新建一个web项目 day17.
		2) 在项目下新建一个首页index.jsp.
			<h1>ajax操作</h1>
			<h3><a href="/day17/js_ajax.jsp">传统的ajax</a></h3>
			<h3><a href="/day17/jquery_ajax.jsp">jquery的ajax</a></h3>
			<h3><a href="/day17/jquery_ajax2.jsp">jquery的ajax(简化版)</a></h3>
			
		3) 在项目下新建一个页面. js_ajax.jsp
			<form>
				<table>
					<tr>
						<td>用户名(get)</td>
						<td>
							<!-- 当光标离开用户名输入框时校验用户名是否被占用,绑定离焦事件. -->
							<input type="text" name="username" onblur="_checkUsername(this)"/>
							<script type="text/javascript">
								function _checkUsername(usernameObj) {
									//1. 获取用户填写的用户名.
									var usernameVal = usernameObj.value;
									//2. 创建ajax对象.	//通过CV大法实现
									var xmlhttp;
									if (window.XMLHttpRequest){// code for IE7+, Firefox, Chrome, Opera, Safari
										xmlhttp=new XMLHttpRequest();
									}
									else {// code for IE6, IE5
										xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
									}									
									//3. 建立连接.
									//第一个参数: 请求方式: get,post
									//第二个参数: 请求的路径
									//第三个参数: true表示异步, false:表示同步
									xmlhttp.open("GET","/day17/checkUsernameServlet?username=" + usernameVal,true);
									//4. 发送请求
									xmlhttp.send();
									
									//5. 处理响应
									xmlhttp.onreadystatechange=function()
									  {
									  if (xmlhttp.readyState==4 && xmlhttp.status==200){
										document.getElementById("username_msg").innerHTML=xmlhttp.responseText;
										}
									  }

								}
							</script>	
						</td>
						<td>
							<span id="username_msg"></span>
						</td>
					</tr>
					<tr>
						<td>昵称(post)</td>
						<td>
							<input type="text" name="nickname" />
						</td>
						<td>
							<span id="nickname_msg"></span>
						</td>
					</tr>
					<tr>
						<td>年龄</td>
						<td colspan="2">
							<input type="text" name="age" />
						</td>
					</tr>
					<tr>
						<td colspan="3">
							<input type="submit" value="注册 "/>
						</td>
					</tr>
				</table>
			</form>
			
		4) 在项目下新建一个: Servlet类(自定义类名为:CheckUsernameServlet)
			// 在该类的doGet()方法中完成如下的功能:
				//这里我们就模拟数据库的校验动作了, 假设数据库中存的用户名: 只有zhangsan
				//1. 获取浏览器请求的数据, 
				String username = request.getParameter("username");
				username = new String(username.getBytes("iso-8859-1"),"utf-8");
				
				System.out.println(username);
				//2.0 解决响应时的乱码问题:
				
				response.setContentType("text/html;charset=utf-8");
				//2. 校验数据.
				if (username == null || username.length() == 0 || "zhangsan".equals(username)) {
					//2.1 如果用户名不存在就提示: 该账号已被占用.
					response.getWriter().println("<font color='red'>该账号已被占用</font>");
				} else {
					//2.2 如果用户名存在就提示: 该账号可用.
					response.getWriter().println("<font color='green'>该账号可用</font>");
				}
		5) 同样的步骤, 解决校验"昵称"的问题.
			//在js_ajax.jsp页面中给nickname文本框一个"离焦"事件, 
			//在CheckNicknameServlet类中校验数据.
			
			//注意: post方式和get方式, 解决请求时的乱码问题, 代码是不一样的.

			   
8. jquery的ajax_版本一
	1) 在项目下新建有给 jquery_ajax.jsp(表单项和js_ajax.jsp的表单项一致, 所以可以直接复制)
	2) 因为涉及到Jquery代码了, 所以要把jquery的脚本文件复制到项目中.
	3) 在jquery_ajax.jsp页面中, 编写jquery代码, 校验用户名和昵称.
		//校验用户名的代码
		<!-- 引入JQuery脚本文件 -->
		<script type="text/javascript" src="/day17_ceshi/js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript">
			/* 通过jquery代码来操作ajax */
			//1. 因为所有的动作都是在窗体加载完毕之后实现的, 所以我们先编写: 页面加载事件.
			$(function() {
				//校验用户名, 其实就给是username文本框注册一个离焦时间
				$("input[name='username']").blur(function() {
					//1. 获取用户录入的用户名.
					var usernameVal = $(this).val();
					//2. 通过ajax(异步刷新技术), 来校验该用户名是否可用
					$.ajax({
						type: "get",
						url: "/day17_ceshi/checkUsernameServlet",
						data: "username="+usernameVal,	//这个data是浏览器给服务器发送的数据
						success: function(data) {		//这个data是服务器给浏览器响应的数据
							$("#username_msg").html(data);
						}
					});
				});
				
				
			});
		</script>
		
	4) 校验昵称的代码.
		//校验昵称
		$("input[name='nickname']").blur(function() {
			//1. 获取用户在浏览器录入的数据
			var nicknameVal = $(this).val();
			//alert(nicknameVal);
			
			//2. 通过ajax校验昵称是否存在
			$.ajax({
				type: "post" , 
				url: "/day17_ceshi/checkNicknameServlet", 
				data: "nickname=" + nicknameVal,	//这个是浏览器发给服务器的数据
				success: function(data) {			//这个是服务器响应给浏览器的数据
					$("#nickname_msg").html(data);
				} 
			});
		});

9. jquery的ajax_版本二
	//思路和上个版本比较类似, 知识优化了$.ajax()的代码, 改为: $.get(), $.post(); 代码如下:
	<!-- 引入JQuery脚本文件 -->
	<script type="text/javascript" src="/day17_ceshi/js/jquery-1.11.0.min.js"></script>
	<script type="text/javascript">
		/* 通过jquery代码来操作ajax */
		//1. 因为所有的动作都是在窗体加载完毕之后实现的, 所以我们先编写: 页面加载事件.
		$(function() {
			//校验用户名, 其实就给是username文本框注册一个离焦时间
			$("input[name='username']").blur(function() {
				//1. 获取用户录入的用户名.
				var usernameVal = $(this).val();
				//2. 通过ajax(异步刷新技术), 来校验该用户名是否可用
				$.get("/day17_ceshi/checkUsernameServlet",{"username" : usernameVal}, 
					function(data) {
						$("#username_msg").html("jquery_ajax2..." + data);
					});
			});
			
			
			//校验昵称
			$("input[name='nickname']").blur(function() {
				//1. 获取用户在浏览器录入的数据
				var nicknameVal = $(this).val();
				//alert(nicknameVal);
				
				//2. 通过ajax校验昵称是否存在
				$.post("/day17_ceshi/checkNicknameServlet",{"nickname" : nicknameVal},
					function(data) {
						$("#nickname_msg").html("jquery_ajax2..." + data);	
				});
			});
			
		});
		
	</script>


10. 案例1的分析图
	案例1: 
		添加商品时, 显示类别信息.
		
	思路:
		1) 浏览器中打开"添加商品页面". //例如: 表单项为以下几项
			商品名称: _______
			商品价格: _______
			类别名称: _______(这个是下拉列表, 从数据库里边获取的)
		2) 其中"类别名称"是通过ajax对象, 从数据库中获取的.
			//"浏览器" --> ajax对象 --> 服务器 --> java代码 --> 数据库,操作数据返回list集合 -->
			//java代码把list集合转成json字符串 --> 返回给ajax --> 
			//ajax把数据推送到浏览器 --> 浏览器显示数据
			
11. 将JavaBean转成Json字符串
	//这里我们是通过FlexJson jar包实现的, 所以要记得导包.
	1) 在项目下的com.itheima.domain包下创建实体类: 
		Category类:		//分类表
			int cid; 		//分类编号
			String cname;	//分类名称
			
	2) 导包. 把FlexJson jar包拷贝到项目下的lib文件夹中.
	
	3) 在com.itheima.test包中创建一个测试类. TestJson
		//该类用来测试: 如何将JavaBean对象转成Json字符串.
		//注意, 这里我们是通过 JUnit单元测试来实现的.	
		public class TestJson {
			/**
			 * 需求1: 把JavaBean对象转成 Json字符串, 分解版
			 */
			@Test
			public void demo1() {
				//需求1: 将JavaBean对象转成json字符串
				//1. 创建JavaBean对象.
				Category c = new Category(1,"手机数码");
				//2. 将JavaBean对象转成 json字符串.
				//2.1 创建FlexJson对象.
				JSONSerializer jsonS = new JSONSerializer(); 
				
				//2.2 调用它的功能将对象转成字符串.
				//这样写我们发现最终打印出来的字符串包含有: class属性, 如何去掉呢?
				jsonS.exclude("*.class");	//去掉*.class属性
				String str = jsonS.serialize(c);
				System.out.println(str);
			}
			
			/**
			 * 需求2: 把JavaBean对象转成 Json字符串, 合并版
			 */
			@Test
			public void demo2() {
				//需求1: 将JavaBean对象转成json字符串
				//1. 创建JavaBean对象.
				Category c = new Category(2,"电脑办公");
				
				//2. 将JavaBean对象转成 json字符串.
				String str = new JSONSerializer().exclude("*.class").serialize(c);
				
				//3. 打印结果
				System.out.println(str);
			}
			
			/**
			 * 需求3: 将List<Category>集合, 转成Json字符串.
			 */
			@Test
			public void demo3() {
				//1. 创建集合.
				List<Category> list = new ArrayList<>();
				
				//2. 往集合中添加元素(Category类型的对象)
				list.add(new Category(3,"家用电器"));
				list.add(new Category(4,"美妆个护"));
				list.add(new Category(5,"技术丛书"));
				
				//3. 把List集合转成Json字符串.
				String str = new JSONSerializer().exclude("*.class").serialize(list);
				System.out.println(str);
			}
		}


12. 案例一: 添加商品时, 显示类别信息.
	1) 准备数据.	//创建数据表, 添加数据.
	
	2) 把要用的.jar包拷贝到 lib文件夹下.
	
	3) 在项目下创建包.
		com.itheima.web
		com.itheima.service
		com.itheima.dao
		com.itheima.domain
		com.itheima..utils]

	4) 把c3p0-config.xml复制到src文件夹下, 记得修改属性值.
	
	5) 把JDBCUtils工具类拷贝到com.itheima.utils下.
	
	6) 在com.itheima.web层下创建类: FindCategoryListServlet
		public class FindCategoryListServlet extends HttpServlet {
			private static final long serialVersionUID = 1L;

			protected void doGet(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
				//1. 调用业务层的方法, 获取"商品分类"对应的json字符串
				CategoryService cs = new CategoryService();
				
				//用变量str接收: "商品分类"集合对应的Json字符串
				String str = cs.findCategoryList();
				
				//2. 将JSon字符串返回给浏览器
				//注意, 这里返回的不是xml了, 而是json字符串
				//response.setContentType("text/html;charset=utf-8");
				//不能写成上述那种情况, 要写成下面这种的
				response.setContentType("application/json;charset=utf-8");
				response.getWriter().println(str);
				
			}

			protected void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
				doGet(request, response);
			}

		}

	7) 在com.itheima.service层下的: CategoryService类中编写如下代码:
		public class CategoryService {

			public String findCategoryList() {
				CategoryDao cd = new CategoryDao();
				//接收服务器传输过来的List集合
				List<Category> list = cd.findCategoryList();
				
				//将其转成Json字符串, 然后返回
				return new JSONSerializer().exclude("*.class").serialize(list); 
			}

		}


	8) 在com.itheima.dao层下的: CategoryDao类中编写如下代码:
		public class CategoryDao {

			public List<Category> findCategoryList() {
				QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
				
				String sql = "select * from category;";
				
				try {
					return qr.query(sql, new BeanListHandler<>(Category.class));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return null;
			}

		}

	9) 在addProduct.jsp页面中完成如下的代码:
		<!-- 引入JQuery脚本文件 -->
		<script type="text/javascript" src="/day17_ceshi/js/jquery-1.11.0.min.js"></script>

		</head>
		<body>
			<form action="" method="post">
				<table>
					<tr>
						<td>商品名称</td>
						<td>
							<input type="text" name="name" />
						</td>
					</tr>
					
					<tr>
						<td>商品类别</td>
						<td>
							<select name="category" id="category">
								<option value="null">---请选择类别---</option>
							</select>
							<script type="text/javascript">
								$(function() {
									//初始化类别信息
									$.ajax({
										type: "post",
										url: "/day17_ceshi/findCategoryListServlet",
										success: function(data) {
											var str = "<option value='null'>---请选择类别---</option>";
											//data: 就是服务器传输过来的字符串, 将其封装到<option>标签, 提交到下拉列表中即可
											//遍历数组, 获取到每一个: "商品分类"对象
											for(var i=0; i<data.length; i++) {
												//data[i]: 就是数据表中记录的每一条分类信息
												var c = data[i];
												str += "<option value='"+ c.cid +"'>"+ c.cname +"</option>";
											}
											//把拼接后的<option>添加到下拉列表中即可
											$("#category").html(str);
										}
									});
								});
							</script>
						</td>
					</tr>
					
				</table>
			</form>
		</body>


13. 案例2的准备工作
	案例2: 三级联动(省市区)
	
	步骤:
		1) 准备数据. 创建数据库, 数据表, 往里边添加数据.
			//我们准备的: province_city_district表是一张"自关联"表.

		2) 建一个和数据表对应的JavaBean类(这里我们用缩写了, PCD).


		3) 新建一个area.jsp页面.
			<!-- 省 -->
			<select id="province">
				<option value="null">---请选择省---</option>
			</select>
			
			<!-- 市 -->
			<select id="city">
				<option value="null">---请选择市---</option>
			</select>
			
			<!-- 区 -->
			<select id="district">
				<option value="null">---请选择区---</option>
			</select>

		4) 在com.itheima.web包下新建类(FindPCDListByPidServlet).
			protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				//1. 读取浏览器传过来的pid值
				String pid = request.getParameter("pid");
				
				//1. 从Service层中获取, 省市区信息的Json字符串形式
				PCDService pcd = new PCDService();
				String str = pcd.findPCDListByPid(pid);
				
				//2. 将Json字符串返回给浏览器.
				response.setContentType("application/json;charset=utf-8");
				response.getWriter().println(str);		
			}
			
		5) 在Service层下新建类(PCDService).
			
			public String findPCDListByPid(String pid) {
				PCDDao pcd = new PCDDao();
				List<PCD> list = pcd.findPCDListByPid(pid);
				return new JSONSerializer().exclude("*.class").serialize(list);
			}
			
		6) 在dao层下新建类: PCDDao.
			public List<PCD> findPCDListByPid(String pid) {
				QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

				String sql = "SELECT * FROM province_city_district WHERE pid = ? ;";

				try {
					return qr.query(sql, new BeanListHandler<>(PCD.class), pid);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return null;
			}
		7) 在area.jsp页面中完成指定的功能.
			<!-- 引入JQuery脚本文件  -->
			<script type="text/javascript" src="/day17_ceshi/js/jquery-1.11.0.min.js"></script>
			<script type="text/javascript">
			/* 页面加载事件 */
			$(function() {
				//获取省份信息, 保存到province下拉列表中
				$.ajax({
					type: "post",
					url: "/day17_ceshi/findPCDListByPidServlet",
					data: "pid=-1",
					success: function(data) {
						var str = "<option value='null'>---请选择省---</option>";
						//data记录的就是servlet返回的json信息
						for(var i=0; i<data.length; i++) {
							str += "<option value='" + data[i].id + "'>"+data[i].name +"</option>";
						}
						$("#province").html(str);
					}
				});
				
				//当省份信息发生改变时, 市级信息跟着发生变更
				$("#province").change(function() {
					//小细节:  清除"区"中记录的值
					//方式一
					//$("#district").html("<option value='null'>---请选择区---</option>");
					
					//方式二:
					$("#district")[0].length = 1;
				
					//获取当前省份的pid值.
					var province_id = this.value;
					
					//获取市份信息, 保存到province下拉列表中
					$.ajax({
						type: "post",
						url: "/day17_ceshi/findPCDListByPidServlet",
						data: "pid=" + province_id,
						success: function(data) {
							var str = "<option value='null'>---请选择市---</option>";
							//data记录的就是servlet返回的json信息
							for(var i=0; i<data.length; i++) {
								str += "<option value='" + data[i].id + "'>"+data[i].name +"</option>";
							}
							$("#city").html(str);
						}
					});
				});
				
				//当市信息发生改变时, 区级信息跟着发生变更
				$("#city").change(function() {
					//获取当前市的pid值.
					var city_id = this.value;
					
					//获取市份信息, 保存到province下拉列表中
					$.ajax({
						type: "post",
						url: "/day17_ceshi/findPCDListByPidServlet",
						data: "pid=" + city_id,
						success: function(data) {
							var str = "<option value='null'>---请选择区---</option>";
							//data记录的就是servlet返回的json信息
							for(var i=0; i<data.length; i++) {
								str += "<option value='" + data[i].id + "'>"+data[i].name +"</option>";
							}
							$("#district").html(str);
						}
					});
				});
			});
			</script>
			</head>
			<body>
				<!-- 省 -->
				<select id="province">
					<option value="null">---请选择省---</option>
				</select>
				<!-- 市 -->
				<select id="city">
					<option value="null">---请选择市---</option>
				</select>
				<!-- 区 -->
				<select id="district">
					<option value="null">---请选择区---</option>
				</select>
			</body>