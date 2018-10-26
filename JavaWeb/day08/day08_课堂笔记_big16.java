今日内容大纲:
	DOM对象:
		概述: 
			Document Object Model, 文档对象模型.
		功能:
			Document对象:
				获取:
					document.getElementById("元素的id");
					
				创建:
			Element对象:
				增删改查:
				属性:
		案例:
			案例一: 全选和全不选
			案例二: 省市联动.
	BootStrap前端框架:
		 概述:
			开发响应式页面的.
		 分类:
			栅格系统:
			全局CSS样式:
			JS组件
			JS插件

	
		案例: 
			购物商城首页绘制(采用BootStrap前端框架实现)
	
			
		

今日具体内容:
1. DOM对象简介
	概述: Document Object Model, 文档对象模型.
		//dom对象就是把整个页面加载到内存中形成的: 树状结构(DOM树)
		
		//DOM树中, 会将文档中的(元素标签,属性, 文本)都封装成对象,
		//通过操作对象, 来实现改变或者修饰HTML页面的效果.

	树形结构的特点:
		1) 有且仅有一个根节点.
		2) 每个节点都有一个父节点及任意个子节点, 根节点除外.
		3) 没有子节点的节点叫做: 叶子节点.
	
	
	DOM树形结构模型中:
		1) 每个元素标签用: Element(元素)表示.
		2) 标签的属性用: Attribute(属性)表示.
		3) 文本内容用: Text(文本)表示.
		4) 元素, 属性, 文本合称为: 节点(Node).

	示例代码:
		<html>
			<head>
				<meta charset="UTF-8">
				<title>DOM树形结构</title>
			</head>
			<body>
				<div>文本</div>
				<div>
					<a href="#"> 超链接</a>
					<font color="red">字体标签</font>
				</div>
			</body>
		</html>


2. DOM对象之: Document对象.
	//Document对象: 文档对象, 就是将整个页面加载到内存后的对象.

	获取元素的功能:
		document.getElementById("元素的id");					//根据元素的Id获取指定的元素, 获取的是一个.
		document.getElementsByName("元素的name属性值");			//根据元素的name属性值获取指定的元素, 获取的是多个.
		document.getElementsByClassName("元素的class属性值");	//根据元素的class属性值获取指定的元素, 获取的是多个.
		document.getElementsByTagName("元素的标签名");			//根据元素的标签名获取指定的元素, 获取的是多个.
	
	创建元素的功能:
		document.createElement("HTML标签名");		//创建指定的标签.
		document.createTextNode("指定的文本值");	//创建文本节点.


3. DOM对象之: Element对象
	节点1.appendChild(节点2);		//往指定元素的后边添加元素
	insertBefore(新节点,旧节点);	//往指定元素的前边添加元素 
	
	replaceChild();					//替换指定的节点
	removeChild();					//移除指定的节点
	

4. DOM对象之: 常用属性
		childNodes:		//获取指定元素下所有的子节点
		firstChild:		//获取指定元素的 第一个子节点
		lastChild:		//获取指定元素的 最后一个子节点
		parentNode:		//获取指定元素的父节点
		nodeName:		//获取指定的节点名
		nodeType:		//获取指定的节点类型
		nodeValue:		//获取指定的节点值


5. BootStrap的简介
	概述: BootStrap是基于HTMl,CSS,JS的前端框架.
	
	为什么要学习BootStrap?
		快速开发一个网页, 开发出的网页是响应式的.
		
		
	什么是"响应式页面"? 
		//根据不同的分辨率, 自适应设备.
		
	官网:
		www.bootcss.com









