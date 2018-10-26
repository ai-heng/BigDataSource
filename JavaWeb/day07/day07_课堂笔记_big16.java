今日内容大纲:
	JS简介:
		概述: 
			全称叫JavaScript, 是一门弱类型语言, 用来给页面增加(动态)效果的.
		作用: 
		特点:
		背景(历史): 了解
		组成:
			ECMAScript核心基础:
			BOM对象:
			DOM对象:
	ECMAScript核心基础:
		概述:
			定义了JS的核心语法和基本对象.
		核心语法:
			语法格式:
			变量的命名规则:
			值的类型的划分:			//***
			保留字和关键字:
			运算符:
			语句:
			事件:
				概述: 就是用户的行为.
			函数:
			数组对象:
			正则对象:
	BOM对象:
		概述: Browser Object Model, 浏览器对象模型.
		内置对象:
			window
			history
			location
			
		

今日具体内容:
1. JS的简介
	概述: JavaScript, 是一门弱类型的语言, 可以给页面增加动态效果.
		//弱类型的语言: 对数据的数据类型划分不精细.
		//所有的js的变量都用: var这个运算符来接收.
		var v1 = "abc"
		var v2 = 10
		var v3 = 10.3
		var v4 = false
		var v5 = null;
		var v6;
		var v7 = new Array(值1, 值2, 值3);
		
	
	特点:
		1) JavaScript 是一种轻量级的编程语言。
		2) JavaScript 是可插入 HTML 页面的编程代码。
		3) JavaScript 插入 HTML 页面后，可由所有的现代浏览器执行。
		4) JavaScript 很容易学习。
		
	历史:		//了解
	
	
	组成:			//记忆
		ECMAScript基础:	定义了JS的核心语法和基本对象.
		BOM: Browser Object Model, 浏览器对象模型.
		DOM对象: Document Object Model, 文档对象模型.

2. JS的引入方式:
	方式一: 直接嵌入到HTML页面中.						//类似于昨天讲解的CSS的内部引入.
		写在<head>标签<script>
		格式:
			<script>
				//JS的代码.
			</script>
	
	
	方式二: 写在.js文件中, 然后在页面中引入该文件.		//类似于昨天讲解的CSS的外部引入.
		引入的格式:
			<script src="要引入的js文件的路径">
			</script>		

3. ECMAScript核心基础	
	基础语法:
		1) JS是区分大小写的.
		2) JS是一门弱类型语言, 所有的变量都用var(variable:变量)运算符来接收. 例如: 
			var v1 = "abc";
			var v2 = 123;
			var v3 = 10.3;
			var v4 = false;
			var v5 = null;
			var v6;
			var v7 = new Array(1,2,3,4,5);
		3) JS语句最后边的分号可写可不写, 建议写上.
		4) JS中的注释方式和Java中的注释方式类似.
			//单行注释
			/* 多行注释 */
		5) 由{}括起来的内容是: 代码块.
			
			
	变量的命名规则:
		1) 不能以数字开头.
		2) 必须是数字, 大小写字母, _, $四部分中组成.
		3) 不能和关键字重名.
		4) 最好做到见名知意.
		
		
	JS中对值的类型进行了划分:
		//不同类型的值, 在内存中的存储地方是不一样的.
		原始类型的值:		//可以理解为是Java的基本类型.
			//原始类型的值都存在栈里边, Null除外(存储在堆中).
			String: 	表示字符串, 值用引号括起来, 单双引号均可.    //JS是没有字符的概念的, 只有字符串.
			Number: 	表示数字(所有的整数和小数)
			Boolean:	值只有: true, false.
			Null:		值只有一个: null
			Undefined:	值只有一个: undefined, 该值是从 null 派生过来的.
						//当声明的变量未初始化时，该变量的默认值是 undefined。
						
			String name;		//声明
			name = "张三";		//赋值			声明 + 赋值 = 初始化.
						
		引用类型的值:		//可以理解为是Java的引用类型
			//存储在 堆 中.
			
			//所有new出来的东西, 都存储在堆中.
			
			var v1 = false;					//v1是 原始类型的值
			var v2 = new Boolean(false);	//v2是 引用类型的值,	Boolean 对象是 Boolean 原始类型的引用类型。
			
			var v3 = 10;					//v3 原始类型的值
			var v4 = new Number(10);		//v4 引用类型的值,	    Number 对象是 Number 原始类型的引用类型
			
			
			var v5 = "abc";					//v5 原始类型的值
			var v6 = new String("abc");		//v6 引用类型的值,	    String 对象是 String 原始类型的引用类型
			
		
		我们可以通过typeof关键字, 来校验变量或者值是什么类型的值:
			格式: 
				typeof 值或者变量名
			如果返回值是string, 说明是String类型的原值值.
			如果返回值是number, 说明是Number类型的原始值.
			如果返回值是boolean, 说明是Boolean类型的原始值.
			如果返回值是undefined, 说明是Undefined类型的原始值.
			如果返回值是object, 说明是一个引用类型的值或者Null类型的原始值.
			
			
4. JS中的类型转换:
	//可以把一下的三个方法理解为:   Java中的隐式类型转换.
		转成字符串: 
			变量名.toString();
		转成数字: 
			parseInt(值), parseFloat(值);
		
	强制类型转换:
		Boolean(给定的值); //把给定的值转成boolean类型, 值是非空字符串, 非零数字, 非null的情况下返回true, 其他返回false.
		String(给定的值); //把给定的值转成字符串.
						  //类似于 值.toString()这种方式.
		Number(给定的值); //把给定的值转成数字. 如果给定的值是false和true, 那么则分别转成0和1.				
			

5. JS中的关键字和保留字
	//和Java中的关键字和保留字非常类似.			
			
			
6. JavaScript中的运算符
	JavaScript中的运算符和Java运算符基本一致.
	算术运算符:
		+, -, *, /, %, ++, --
		
	赋值运算符:
		=, +=, -=, *=, /=, %=
		
	比较运算符:
		>, <, >=, <=, != , ==, ===(全等于)
		/*
			==和===解释: 
				==: 只校验值是否相等.
				===(全等于): 既校验值是都相等, 也校验值的类型是否相同.
		*/
	逻辑运算符:	
		&&, ||, !
	条件运算符:	//和Java中的三元运算符一样.
		var num = num1 > num2 ? num1 : num2;
	逗号运算符:
		//相当于同时声明多个变量.
		var num1 = 1, num2 = 2, num3 = 3;			
			

7. JavaScript中的语句
	和Java中非常类似, 需要注意的是: for循环的初始化条件的类型要写成var.			
			
			
8. JavaScript的事件的概述
	概述: 前面编写的JS代码都是直接在<script>标签中直接写的, 按照执行的顺序来讲, 只要页面加载到代码, 就会执行.这样写不够灵活, 一般JS的代码是由 用户某些行为 的触发来执行的.这些用户的行为, 就是事件.			
		//学事件, 就是要知道: 用户有哪些行为.
	
	
	常用事件:
		onclick: 		//鼠标单击事件
		ondblclick:		//鼠标双击事件
		onmouseover:	//鼠标悬浮事件
		onmousemove:	//鼠标移动事件
		onmouseout:		//鼠标移除事件
		onkeyup:		//键盘抬起事件
		onfocus:		//获取鼠标焦点事件
		onblur:			//失去鼠标焦点事件
		onchange:		//改变事件. 一般用于下拉列表, 可以用来做菜单联动.
		onsubmit:		//提交事件.	可以用来做表单数据校验.
		onload:			//页面加载事件
	
	//记忆: JS事件一般结合 JS函数一起使用.	
	
	
	
	
9. JavaScript的自定义函数
	函数的定义格式:
		格式一: 普通定义格式, 直接写.
			//注意: 直接写参数即可, 不需要写数据类型.
			function 函数名(参数1, 参数2){
				
			}
			//示例: 计算两个数字的和
			function sum(a,b){
				return a + b;
			}
		格式二: 匿名函数
			//把函数绑定到事件上.
			onload = function() {
			}	
	
10. JavaScript的全局函数
	eval(): 将字符串当成脚本来执行. //后边将Ajax会用到.
		var s = "alert('aaa')";
		eval(s);
	parseInt();		转成整数
	parseFloat(); 	转成小数
	toString();  	转成字符串
	
	encodeURIComponent(); 把字符串编码为 URI 组件。
	decodeURIComponent(); 解码一个编码的 URI 组件。
	//后边讲Cookie的时候会用到, 登陆页面的时候, 缓存数据可以存在Cookie里边, 但是Cookie默认是不能存中文的, 就可以通过这两个方法对字符串进行编码和解码.
	
	
11. JavaScript的对象及数组
	RegExp: 正则对象. 
		正则的校验有两种方式: 
			String#match();
				//字符串.match("正则表达式");
			RegExp#test();
				//正则表达式.test(字符串);
	
	数组的定义:
		直接定义:
			var arr = [1,2,3,"abc",true];
		对象方式定义:
			var arr = new Array();
			arr[0] = 1;
			arr[1] = 2;
			
			var arr2 = new Array(3);
			//下边只能是0,1,2
			
			var arr3 = new Array("a","b","c");

12. JavaScript的BOM对象
	BOM的概述:	//Browser Object Model, 浏览器对象模型.
	浏览器对象的分类:
		Window: 
			Window是浏览器对象中最顶层的对象, 使用这个对象的时候可以window.xxx也可以将window省略. 
			//即: window.alert()和alert()效果一样.
			alert(); 	警告框
			confirm();	确认框
			open(); 打开一个新的浏览器窗口或查找一个已命名的窗口
			close(); 关闭浏览器窗口。
			prompt();	//提示用户录入数据
			setInterval();	设置定时, 循环执行.
				//用法: setInterval("表达式", 间隔时间-毫秒);
			setTimeOut();	设置定时, 执行一次.
				//用法: setTimeOut("表达式", 间隔时间-毫秒);
			clearInterval(); 清除定时
			clearTimeOut(); 清除定时
		History:
			浏览器的历史对象.
			go();
		Location:
			浏览器的控制页面跳转对象.
			href属性
		
		Navigator:   //了解
		Screen:		 //了解

		
13. 案例一: 文字变大效果

14. 案例二: 表单的简单校验	
	<!--表单标签-->
	<!--表单标签的数据是否提交, 取决于onsubmit事件的返回值, 如果是true就提交, 如果是false就不提交-->
	<form method="post" action="" >
		<table border="1px" width="800px">
			<!--第一行-->
			<tr>
				<td width="15%">用户名:</td>
				<td>
					<input type="text" id="username" placeholder="请录入您的用户名"/>
					<span id="s1"></span>
				</td>
			</tr>
			<!--第二行-->
			<tr>
				<td >密码:</td>
				<td>
					<input type="password" id="password" placeholder="请录入您的密码" />
					<span id="s2"></span>
				</td>
			</tr>
			<!--第三行-->
			<tr>
				<td >确认密码:</td>
				<td>
					<input type="password" id="repassword" placeholder="请再次录入您的密码" />
					<span id="s3"></span>
				</td>
			</tr>
			<!--第四行-->
			<tr>
				<td >手机号:</td>
				<td>
					<input type="text" id="phone" placeholder="请录入您的手机号" />
					<span id="s4"></span>
				</td>
			</tr>
			<!--第五行-->
			<tr>
				<td >
					<input type="submit" value="点我注册" />
				</td>
				<td >
					<input type="reset" value="点我重置" />
				</td>
			</tr>
		</table>
	</form>	
	
	
	
	
	
	
	
