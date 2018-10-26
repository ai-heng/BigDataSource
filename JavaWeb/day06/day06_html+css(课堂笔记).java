昨日内容回顾:
	HTML:
		概述: Hyper Text Markup Language, 超文本标记语言.
			超文本:		比普通文本功能更加强大.
			标记语言:	由标签(尖括号括起来的关键字)组成.
			
		作用:
			用来设计(静态)页面的.
			
		特点:
			A: HTMl是不区分大小写的, 为了阅读方便, 建议小写.
			B: 老的命名规范.htm, 新的命名规范.html
			C: 由标签(尖括号括起来的关键字)组成.
				例如: <font>字体标签</font>
			D: 开始标签, 结束标签.		//开放标签和闭合标签.
			F: <br />,<hr />,<img>, 自闭合标签.
			G: 标签可以有属性, 属性值用引号括起来, 单双引号均可.
			H: <!--注释的文字-->
			I: html页面的结构: <html>, <head>, <body>
			J: 包裹嵌套, 不建议交叉嵌套.
			
		开发工具:
			普通的记事本
			高级记事本
			Dreamweaver
			HBuilder
			
		HTML页面的结构演示:
			<html>
				<head>
					<meta> </meta>
					<title> </title>
				</head>
				
				<body>
					//给用户展示的部分
				</body>
			
			</html>

		HTML中的标签:
			字体标签: <font>
				属性: size(1~7), color(英文单词, RGB三原色), face
				
			排版标签:
				<h数字>
				<p>
				<b>
				<i>
				<u>
				<br />
				<hr />
				<center>
				
			列表标签:
				无序列表: ul
					列表项: <li>
					属性: type(desc,circle,square)
				有序列表:ol
					列表项: <li>
					属性: 
						type: 数字, 大小写字母, 大小写罗马数字.
						
						start: 从指定的数字开始计数, 只针对数字.
						
			图片标签: <img>
				属性: border, width, height, alt
				
			超链接标签: <a>
				属性: href, target(_self, _blank, _parent)
				
			表格标签: <table>
				<tr>, <td>, <th>(居中, 加粗)
				
				属性: border, width, height, bgcolor, align
					  rowspan, colspan
					
			块标签:
				div, span
			框架标签: <frameset>
				<frame>
				属性: rows(横向), cols
				
			案例:
				学生管理系统.
				购物商城首页.
				
			
今日内容:
1. HTML标签之表单标签: <form>
	概述: 就是将现实生活中的表单变为"页面形式"的表单.
	
	记忆:
		A: 表单标签是<form>标签, 写在<form>标签中的标签是: 表单项.
		B: 表单项必须放在<form>标签中才能提交.
	
	表单项分类:
		输入项:	//输入项都是<input>标签, 根据输入项的类型不同, 输入项也不同.
			//格式: <input type="输入项的类型"/>
			text: 文本框
			password: 密码框
			radio: 单选框		//根据name属性区分是否是同一组数据.
			checkbox: 复选框	//根据name属性区分是否是同一组数据.
			file: 文件框(就是让你选择文件的路径的)
			
			submit: 提交按钮
			reset: 重置按钮
			image: 图片按钮
			button: 普通按钮, 没有任何自带的功能, 功能需要用户自定义.
			hidden: 隐藏域, 例如: 某些信息是指向给后台(程序员)看, 不想提示给用户, 就可以用该输入项.

		下拉列表: <select>
			<select>
				<option>北京</option>
				<option>上海</option>
				<option>广州</option>
			</select>
		
		
		文本输入域: <textarea>
			属性: rows:设置行数  cols:设置列数
		

2. 表单项的属性:
	name: 表单项的名称(用于接收数据)
	value: 表单项的值.
	readonly:只读
	默认被选中:
		单选框和复选框: checked
		下拉列表: selected
				
3. 表单标签的属性:
	action: 要提交数据到哪个页面, 默认是提交到当前页面.
		路径的划分:
			绝对路径: 网站外部的页面, 必须写http://
			相对路径: 网站内部的页面.
	
	method: 提交方式
		get:	提交方式不安全, 数据会显示在地址栏中.
			    提交的数据有大小限制.
		post:	提交方式相对安全, 数据封装在"请求体".
				提交的数据没有大小限制.
	

4. CSS的简介
	概述: Cascading Style Sheets, 层叠样式表.
	
	作用:
		用来美化页面的.
		//html相当于人的骨骼, css是给人化妆, js是让人(局部)动起来.
		
	分类:
		行内样式:	//直接写在元素(html的标签)中的样式.
		
		内部样式:	//写在<head>标签的,<style>标签中.
		
		外部样式:	//写在后缀名为.css的文件中.
		
5. CSS的引入方式之: 行内样式.
	格式:
		<div style="属性名:属性值; 属性名:属性值"></div>
		
		作用: 只针对于当前元素有效.
		
6. CSS的引入方式之: 内部样式.
	格式:	//写在<head>标签的,<style>标签中.
		选择器{
			属性名:属性值;
			属性名:属性值;
		}
	作用: 针对于当前页面内的部分元素有效.
	
		
7. CSS的引入方式之: 外部样式.
	格式:	//后缀名为.css的文件中
		选择器{
			属性名:属性值;
			属性名:属性值;
		}
	作用: 可以用来统一整个网站的风格.
	
8. CSS中的选择器:
	//记忆: 后边我们学习JQuery的时候, 选择器和现在讲的这三种是一样的, 早晚都得记忆, 要求现在记.
	//后边学JQuery的时候会轻松一点.
	元素选择器:
		格式:
			元素名{
				属性名: 属性值;
				属性名: 属性值;
			}
		作用: 针对于该类元素有效.
	
	id选择器:
		格式:
			#选择器名{
				属性名: 属性值;
				属性名: 属性值;
			}
	
		作用: 给指定id(id名和选择器名一样的元素)设置样式的.	
		//记忆: 每个标签都有id属性, id属性尽量保证唯一.
	
	类选择器:
		格式:
			.选择器名{
				属性名: 属性值;
				属性名: 属性值;
			}
		作用: 用来设置某类元素(class属性的值为 选择器名的元素)的样式的.
		
	后代选择器:		//理解
		(元素,id,类)选择器 元素名{
			//样式
		}
		作用: 设置指定的元素内的 指定的"子标签"的样式的.
		
	伪类选择器:	//理解
		a:link{}		//未选中连接
		a:active{}		//选定的链接
		a:visited{}		//已访问的链接
		a:hover{}		//鼠标移动到链接上
		
		作用: 主要用来操作超链接的.


9. CSS的样式
	背景: 
		background-color: 设置背景色 
	字体:
		font-size: 设置字体大小
	文本:
		text-decoration:将其值设置为:none,可以取消超链接字体的下划线.
		color: 设置字体的颜色
	边框:
		border: 1px solid blue;		//1像素, 蓝色实线
			//solid: 单实线, double:双实线  dotted:(点)虚线 dashed:(-)虚线
		width: 设置标签的宽度
		height: 设置标签的高度

10. CSS的浮动
	概述: 通常情况下页面的布局: 从上往下逐行分布. 有些时候我们需要页面中的布局方式是从左往右, 或者从右往左之类的自定义页面布局, 就需要用到: 窗体浮动.
		float: //设置浮动.
			属性值: left, right
		clear: //清除浮动.
			属性值: both

11. CSS的盒子模型
	概述: 也是用于布局的. 正常的一个页面可能有多个div, 每个div的里边可能有其他元素(元素和div之间的间距叫内边距), div与div之间有可能也是有间隙的(外边距).
	外边距: margin
	内边距: padding
	
	margin: 值1 值2 值3 值4;		//离上,右,下,左的间距分别是: 值1 值2 值3 值4;
	margin: 值1(上下) 值2(左右);	//离上,右,下,左的间距分别是: 值1 值2 值1 值2;
	margin: 值1;					//离上,右,下,左的间距分别是: 值1 值1 值1 值1;
	如果说不足以满足四个边距的值, 参考: 上左.




12. 黑马购物商城首页的搭建
	<div class="container">
		<!--第一行-->
		<div class="innerDiv">1</div>
		<!--第二行-->
		<div class="innerDiv">2</div>
		<!--第三行-->
		<div class="innerDiv">3</div>
		<!--第四行-->
		<div class="innerDiv">4</div>
		<!--第五行-->
		<div class="innerDiv">5</div>
		<!--第六行-->
		<div class="innerDiv">6</div>
		<!--第七行-->
		<div class="innerDiv">7</div>
		<!--第八行-->
		<div class="innerDiv">8</div>
		<!--第九行-->
		<div class="innerDiv">9</div>
		<!--第十行-->
		<div class="innerDiv">10</div>
	</div>

























