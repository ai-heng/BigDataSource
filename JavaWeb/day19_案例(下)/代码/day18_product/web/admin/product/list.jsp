<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/Style1.css"
	rel="stylesheet" type="text/css" />
<script language="javascript"
	src="${pageContext.request.contextPath}/js/public.js"></script>

	<%--引入JQuery文件--%>
	<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>

	<script type="text/javascript">
			//动态加载商品的分类信息
            //需求: 页面加载后, 动态加载: 所有的分类信息.
            $(function () {
                $.get("${pageContext.request.contextPath}/categoryListServlet",function (data) {
                    //console.info(data);
                    //1. 定义变量, 记录数据.
                    var str = "<option value=''>--请选择分类--</option>";
                    //2. 遍历, 拼接.
                    for(var i=0; i<data.length; i++) {
                        str += "<option value='"+ data[i].cid +"'>"+ data[i].cname +"</option>";
                    }
                    //3. 设置值到指定的地方.
                    $("#cid").html(str);

                    //回显, 显示商品名
					$("#pname").val("${pname}");
					//回显, 显示指定的分类信息
					$("#cid option[value='${cid}']").prop("selected",true);
                });
            });

			function addProduct(){
				window.location.href = "${pageContext.request.contextPath}/admin/product/add.jsp";
			}

			//删除商品的动作
			function deleteProduct(pid){
				//1. 提示用户, 您真的要删除吗?
				var flag = window.confirm("您真的要删除吗?");

				//2. 如果是true, 就调用 deleteProductServlet, 删除数据.
				if (flag) {
                    window.location.href = "${pageContext.request.contextPath}/deleteProductServlet?pid=" + pid;
				}
			}
		</script>
</HEAD>
<body>
	<%--条件查询开始--%>
	<form  action="${pageContext.request.contextPath}/productConditionQueryServlet"  method="post">
		<table cellSpacing="1" cellPadding="0" width="100%" align="center"
			   bgColor="#f5fafe" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3">
					<strong>条件查询</strong>
				</td>
			</tr>
			<tr>
				<td class="ta_01" align="center">
					分类 <select id="cid" name="cid"></select>
					名称 <input type="text" name="pname" id="pname">
					<input type="submit" value="查询">
				</td>
			</tr>
		</table>
	</form>
	<%--条件查询结束--%>

	<br>
	<form id="Form1" name="Form1"
		action="${pageContext.request.contextPath}/user/list.jsp"
		method="post">
		<table cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>商品列表</strong>
					</TD>
				</tr>
				<tr>
					<td class="ta_01" align="right">
						<button type="button" id="add" name="add" value="添加"
							class="button_add" onclick="addProduct()">
							&#28155;&#21152;</button>

					</td>
				</tr>
				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
								<td align="center" width="8%">序号</td>
								<td align="center" width="7%">商品图片</td>
								<td align="center" width="17%">商品名称</td>
								<td align="center" width="17%">商品价格</td>
								<td align="center" width="17%">是否热门</td>
								<td align="center" width="20%">商品类别</td>
								<td width="7%" align="center">编辑</td>
								<td width="7%" align="center">删除</td>
							</tr>

							<%--遍历从服务器获取到的数据, 解析, 展示--%>
							<c:forEach items="${productList}" var="product" varStatus="vs">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center">${vs.count}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center">
										<img width="40" height="45" src="${product.pimage}">
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center">${product.pname}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center">${product.shop_price}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center">${product.is_hot == 1? "是":"否"}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center">${product.category.cname}</td>
									<td align="center" style="HEIGHT: 22px">
										<a href="${ pageContext.request.contextPath }/editUIProductServlet?pid=${product.pid}">
											<img
													src="${pageContext.request.contextPath}/images/i_edit.gif"
													border="0" style="CURSOR: hand">
										</a>
									</td>
									<td align="center" style="HEIGHT: 22px">
										<%--取消href的功能, 但是保留样式.--%>
										<a href="javascript:void(0)" onclick="deleteProduct('${product.pid}')">
											<img src="${pageContext.request.contextPath}/images/i_del.gif"
													width="16" height="16" border="0" style="CURSOR: hand">
										</a>
									</td>
								</tr>
							</c:forEach>
						</table>
					</td>
				</tr>

			</TBODY>
		</table>
	</form>
</body>
</HTML>

