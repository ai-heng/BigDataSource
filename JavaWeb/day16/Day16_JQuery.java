01. 创世人简介
	Java之父: 	詹姆斯·高斯林
	JQuery之父: 约翰.瑞森(John Resig)


	
02. JQuery简介
	概述:
		JQuery是一个快速, 简介的JavaScript框架.
		//可以理解为: JavaScript + Query.
		//大白话: JQuery就是一个JavaScript框架, 简化JS代码编写.
	
	宗旨:
		Writer less, Do  more, 写的更少, 做的更多.
		
	官网下载JQuery版本.js
		最新版: jQuery 2.X		//为了解决浏览器的兼容性, 不在支持IE6/7/8
		企业主流: JQuery1.x (1.8, 1.11)
		
		
		2.x版本和1.x版本主要的区别:
			2.0不在支持IE6/7/8, 调用上无区别, 兼容1.9的API, 内核发生了变化.
			1.x分支会继续发展下去.
			
			
	课程以JQuery1.11.0学习为主(主要学习通用API)
		JQuery-1.11.0.js:		原版原码
		JQuery-1.11.0.min.js:	压缩版的js, 互联网项目,减少, 流量
	
	
	JQuery的帮助文档在:
		资料/jQuery1.11.3_20150618.chm
		
		
03. JQuery核心函数:
	注意:
		使用JQuery之前, 一定要先导包:
			<script type="text/javascript" src=${pageContext.request.contextPath}/js/JQuery-1.11.0.min.js></<script>

	步骤:
		1) 新建一个web项目: day16.
		2) 在项目下的webcontent下新建一个js文件夹, 把.js文件拷贝进来.
		3) 在项目下的webcontent下新建一个 01.jsp页面.
			//页面中有一个<div>
			<div id="myDiv" style="background:red; width:300px height:300px">大数据八期, 威武霸气</div>
			
		4) 需求: 点击div后, 将div的北京颜色改为蓝色
			//JS的做法
			//1. 页面加载完成后再去操作
			window.onload = function() {		
				//2. 根据id获取到元素
				var myDivObj = document.getElementById("myDiv);
				//2.2 输出对象, 可以在浏览器的控制台进行查看
				console.info(myDivObj);
				
				
				//3. 给MyDivObj注册一个单击事件
				myDivObj.onclick = function() {
					//4. 修改div标签的样式
					myDivObj.style.background = "blue";
				}
			}
			
			
		5) 在项目下的WebContent文件夹下新建一个02.jsp页面.
			<div id="myDiv" style="background:red; width:300px height:300px">大数据八期, 威武霸气</div>
			//需求: 同样是点击该div, 然后将div的背景色改为: 黄色
			//1. 页面加载完成后再去操作
			//JQuery的核心用法一:  页面加载函数.
			JQuery(function() {				
				//2. 根据id获取到元素
				//JQuery的核心用法二: 获取页面标签对象
				var $myDivObj = jQuery("#myDiv");	//#表示是id的意思, 后边写的是id名
				
				//2.2 输出对象, 可以在浏览器的控制台进行查看
				console.info($myDivObj);
				
				//3. $myDivObj.click(function() {
					$myDivObj.css("background", "yello");
					
				});
			});
			
			//JQuery的核心用法四: 把html文本转成jQuery对象.
			//需求: 给页面增加一个超链接
			jQuery("body")append(jQuery("<a href="http://www.itcast.cn">传智播客</a>"));
			
			
			
			//需求: 向<body>中追加一个"黑马"超链接.
			//这个只是给页面增加一个超链接, 没有把html转成jQuery对象
			jQuery("body").append("<a href="http://www.itheima.com">黑马程序员</a>");
			
		
	思考: 
		1) JS对象能否使用jquery对象的属性和方法?
			//答: 不能 
		
			解决方案:
				将JS对象转成JQuery对象.
				格式: 
					jQuery(JS对象)
					 //1. 页面加载完毕后执行.
					 window.onload = function() {
						 //2. 根据id获取指定的元素
						var myDiv = document.getElementById("myDiv");
						 //3. 给div层注册一个点击事件
						jQuery(myDiv).click(function(){
							//4. 设置该div的样式
							jQuery(myDiv).css("background","yellow");			
						});
					 }
		
		2) JQuery对象能调用JS对象的属性和方法吗?
			//答: 不能
			
			解决方案:
				将JQuery对象转成JS对象.
				格式:
					jquery对象[0]	
				要知道的事:		//理解即可
					jquery对象封装了js对象, 需要将jquery对象理解为是数组, 其中第一个元素是js对象.
				jQuery(function() {
					//2. 根据id获取指定的元素
					var $myDiv = jQuery("#myDiv");
					//3.  给div层注册一个点击事件
					$myDiv[0].onclick = function() {
					 //4. 设置该div的样式
						$myDiv[0].style.background="blue";
					 }
					
					//给页面增加一个 超链接
					jQuery("body").append("<a href='http://www.itcast.cn'>传智播客</a>");
				});
				
						
04. 给核心函数jQuery其别名
	回顾以前讲解的给函数其别名:	//赋值一份02.jsp, 改名叫03.jsp, 在这里演示.
		//有个函数的函数名非常长, 调用起来非常麻烦, 我们可以给函数起个别名, 例如:
		function slajflasfda() {
			alert(111);
		}
		//此时调用上述的函数是非常麻烦的, 可以通过其别名解决:
		var a = slajflasfda;
		
		//调用函数:
		a();
	上述是JS的写法, 其实在JQuery中, 每次写jQuery()很麻烦, 
	所以jQuery的设计者设计了, 可以用$替代jQuery, 
		
	案例:
		把该页面内之前用jQuery()函数的地方, 全部改为: $符号, 然后运行.
		
	
05. 基本选择器
	选择器简介:
		类似于我们之前讲CSS时候的代码.
		//打开API, 简单的看下几种常用的选择器.
		
	案例演示:
		因为时间关系, 所有直接把 资料\上课代码 拷贝到项目下, 然后逐个演示即可.
		
		$(function(){
			// 1．通过each() 在每个div元素前 加入 “传智播客”
			//获取所有的div, 遍历, 获取标签原来的内容, 最后再追加
			$("div").each(function() {
				//这里的this指的是DOM对象(JS对象), 不是JQuery对象.
				//获取标签原来的内容
				//console.info($(this).html());
				//$(this).html("传智播客");
				$(this).html("传智播客" + $(this).html());
			});
			
			// 2．通过size() / length 打印页面中 class属性为 itcast 的元素数量
			var _size = $(".itcast").size();
			var _length = $(".itcast").length;
			console.info(_size);
			console.info(_length);
			
			// 3．通过index()  打印 id属性为foo 的div标签 是页面内的第几个div标签
			var _index = $("div").index($("#foo"));
			console.info(_index);
			
		});
	

06. 层次选择器
	$(function(){
		// 1．将class属性值为itcast的元素下所有a元素字体变为红色
		$(".itcast a").css("color","red");
		// 2．将class属性值为itcast的元素下直接a元素字体变为蓝色
		$(".itcast>a").css("color","blue");
		// 3．将div元素后所有兄弟a元素，字体变为黄色，大小变为30px
		$("div~a").css({
			"color":"yellow",
			"font-size":"30px"
		});
	});
				
		
07. 基本过滤选择器
	$(function(){
		// 1．设置表格第一行，显示为红色
		$("table tr:first").css("color","red");
		// 2．设置表格除第一行以外 显示为蓝色
		//$("table tr:not(:first)").css("color","blue");	//方式一实现
		$("table tr:gt(0)").css("color","blue");		//方式二实现
		// 3．设置表格奇数行背景色 黄色
		$("table tr:gt(0):odd").css("background","yellow");
		// 4．设置表格偶数行背景色 绿色
		$("table tr:gt(0):even").css("background","green");
		// 5．设置页面中所有标题 显示为灰色
		$(":header").css("color","gray");
		// 6．设置页面中正在执行动画效果div背景黄色，不执行动画div背景绿色	//点击后才会有动画效果
		$("div").click(function() {
			$(this).slideUp("slow");
			
			$("div:animated").css("background","yellow")
		});
		$("div:not(:animated)").css("background","gray")
	});
			
		
08. 内容过滤选择器
	$(function(){
		// 1．设置含有文本内容 ”传智播客” 的 div 的字体颜色为红色
		$("div:contains('传智播客')").css("color","red");
		// 2．设置没有子元素的div元素 文本内容 ”这是一个空DIV“
		$("div:empty").html("这是一个空DIV");
		// 3．设置包含p元素 的 div 背景色为黄色
		$("div:has(p)").css("background","yellow");
		// 4．设置所有含有子元素的span字体为蓝色
		$("span:parent").css("color","blue");
	});
			
		
09. 隐藏和可见过滤选择器
	$(function(){
		// 1．为表单中所有隐藏域  添加 class属性，值为itcast 
		$("form :hidden").attr("class","itcast");
		// 2．设置table所有 可见 tr 背景色 黄色
		$("table tr:visible").css("background","yellow");
		// 3．设置table所有 隐藏tr 字体颜色为红色，显示出来 ，并输出tr中文本值
		var $tr = $("table tr:hidden").css("color","red").show();
		var _html = $tr.html();
		var _text = $tr.text();
		
		console.info("html ..." +  _html);
		
		//下述代码可以取消: 标签, 获取的是纯文本
		console.info("text ..." + _text);
	});
		
	
10. 属性过滤器选择器	//重点	
	$(function(){
		// 1.设置所有含有id属性的div，字体颜色红色
		$("div[id]").css("color","red")
		// 2.设置所有class属性值 含有itcast元素背景色为黄色
		$("[class*='itcast']").css("background","yellow");
		// 3.对所有既有id又有class属性div元素，添加一个点击事件，打印div标签中内容
		$("div[id][class]").click(function() {
			console.info($(this).html());
		});
		// 4 获取属性name="hobby"的input标签, 打印value属性值
		$("input[name='hobby']").each(function() {
			var val = $(this).val();		 
			alert(val);
		});
	});
		
		
11. 子元素过滤选择器
	$(function(){
		// 1.在每个表格 下3的倍数行，字体颜色为红色
		$("table tr:nth-child(3n)").css("color","red");
		// 2.每个表格 奇数行 背景色 黄色
		$("table tr:nth-child(odd)").css("background","yellow");
		// 3.每个表格 偶数行 背景色 灰色
		$("table tr:nth-child(even)").css("background","gray");
		// 4.每个tr 只有一个td的  背景为 蓝色
		$("tr td:only-child").css("background","blue");
	});	
		
	
12. 表单过滤选择器
	$(function(){
		//1．对所有text框和password框，添加离焦事件，校验输入内容不能为空
		$(":text, :password").blur(functio n() {
			var val = this.value;	//JS用户
			
			if(val == null  || val.trim().length == 0) {
				alert(this.name + "不得为空");
			}
		});
		
		//2．对button 添加 点击事件，提交form表单
		$(":button").click(function() {
			$("form").submit();
		});
		 
	});
		
		
		
13. 属性过滤选择器
	$(function(){
		//需求1: 观察只读和不可用标签的联系和区别
		// 联系: 只能看,不能修改
		// 区别: 
				// 只读虽然不能修改,但是可以随表单一起提交
				// 不可用不仅不能修改, 还不能表单一起提交
		//需求2: 点击button 打印radio checkbox select 中选中项的值
		$(":button").click(function() {
			//获取性别
			var genderVal = $("input[name='gender']:checked").val();
			alert("性别:" + genderVal)
			
			$("input[name='hobby']:checked").each(function() {
				var hobbyVal = $(this).val();
				alert("爱好: " + hobbyVal)
			});
			
			//方式一:
			var cityVal = $("select[name='city']").val();
			alert(cityVal);
			
			//方式二:
			var cityVal = $("select[name='city'] option:selected").val();
			alert(cityVal);
		});
		
	});	
	
	
14. 标签的属性操作
	$(function(){
		$("#btn1").click(function() {
			$("a").attr("href","http://www.baidu.com");	
		});
		
		$("#btn2").click(function() {
			$("a").attr("aaaaaa","aaaa");	
		});
		
		//开发中不用这种方式获取数据
		/* $("#btn3").click(function() {
			$("input[name='sex']").each(function() {
				var chk = $(this).attr("checked");
				console.info("att ===== " + chk)
				
			});
		}); */
		
		$("#btn4").click(function() {
			$("input[name='sex']").each(function() {
				var chk = $(this).prop("checked");
				console.info("prop ===== " + chk)
				
			});
		});
		
		
	});
	
	
15. 标签的样式操作
	$(function(){
		$("#btn1").click(function() {
			//方式一: 
			//$("div").css("background","yellow")
			
			//方式二
			//$("div").attr("style","background: pink");
		
			//方式三: 设置一次以后, 一致是这个样式
			//$("div").addClass("changeBackYellow");
		
			//方式四: 设置/取消, 会在两者间进行状态切换
			$("div").toggleClass("changeBackYellow");
			
		});
		
		$("#btn2").click(function() {
			//方式一: 
			//$("div").css("color","blue")
			
			//方式二
			//$("div").attr("style","color: blue");
		
			//方式三: 设置一次以后, 一致是这个样式
			//$("div").addClass("changeBackYellow");
		
			//方式四: 设置/取消, 会在两者间进行状态切换
			$("div").toggleClass("changeFontBlue");
			
		});
		
	});
	
	
16. html_text_val(重点内容, 必须掌握)
	 $(function(){
		// 1．<div><p>传智播客</p></div>  获取div中 html和text 对比
		var _html = $("div").html();
		var _text = $("div").text();
		console.info("_html === " + _html);
		console.info("_text ====" + _text);
		
		// 2．单击pickBtn 使用val() 获得文本框、下拉框、单选框选中的value 
		$("#pickBtn").click(function() {
			//文本框
			var usernameVal = $("input[name='username']").val();
			console.info("usernameVal === " + usernameVal);
			
			//下拉框
			var cityVal = $("select").val();
			console.info("cityVal === " + cityVal);
			
			//爱好
			$("input[name='hobby']:checked").each(function() {
				var hobbyVal = $(this).val();
				console.info("hobbyVal ==========" + hobbyVal);
			});
			
			//性别
			var sexVal = $("input[name='gender']:checked").val();
			console.info("sexVal ===  " + sexVal)
			
		});
		
		// 3．单击setBtn 测试能否通过 val() 设置单选框、下拉框的选中效果 ？ 
		$("#setBtn").click(function() {
			$("input[name='username']").val("柳岩");
			
			$("select").val("上海");
			
			$("input[name='hobby']").val(["足球","篮球"]);
			
			
			$("input[name='gender']").val(["女"]);
			
		});
		
		
	});
	
	
	
	
17. 添加节点
	$(function(){
		// 需求: 添加百度超链接显示在浏览器中
		$("body").append("<a href='http://www.itcast.cn'>传智播客</a>");
	});
	
	$(function(){
		// 插入大专学历 （本科和高中之间）--- 外部插入
		$("option[value='本科']").after("<option value='大专'>大专</option>");
		
		// 插入幼儿园 （学历列表最后） --- 内部插入
		$("#edu").append("<option value='幼儿园'>幼儿园</option>");
	});
	
18. 删除标签和清空内容
	$(function(){
		$("#inner").click(function() {
			alert("不要点我....")
			
		});
		
		// 1 使用remove删除标签, 再将删除标签 重新加入body 查看事件是否存在
		//var $inner =  $("#inner").remove();	//不会保留事件
		//$("body").append($inner);
		
		// 2 使用detach删除标签, 再将删除标签 重新加入body 查看事件是否存在
		//var $inner =  $("#inner").detach();		//会保留事件.
		//$("body").append($inner);
		
		
		// 3 清空id='inner'的标签内容
		$("#inner").empty();
		
	});
		
	
19. 替换和克隆
	替换格式:
		新节点.replaceALl(老节点);
		
		老节点.replaceWith(新节点);
	
	克隆:
		clone(参数一, 参数二) 参数一控制当前元素事件, 参数二控制子元素事件.
	
	$(function(){
		// 需求1:当点击btn1时,将外面的p标签 替换 里面的p标签
		$("#btn1").click(function() {
			$("#mydiv_p").replaceWith($("#myp"));	
		});
		
		
		// 需求2:当点击btn2时,将外面的p标签 替换且克隆 里面的p标签
		$("#btn2").click(function() {
			$("#mydiv_p").replaceWith($("#myp").clone(true));	
		});
		
		
	});
		
	

	
	
	
	
	
		
		
		
		
		
	