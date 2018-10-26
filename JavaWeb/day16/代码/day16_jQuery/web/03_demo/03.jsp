<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style type="text/css">
			<!-- BODY {
				font-family: "宋体";
				font-size: 12px;
				margin: 0px 0px 0px 0px;
				overflow-x: no;
				overflow-y: no;
				background-color: #B8D3F4;
			}
			
			td {
				font_size: 12px;
			}
			
			.default_input {
				border: 1px solid #666666;
				height: 18px;
				font-size: 12px;
			}
			
			.default_input2 {
				border: 1px solid #666666;
				height: 18px;
				font-size: 12px;
			}
			
			.nowrite_input {
				border: 1px solid #849EB5;
				height: 18px;
				font-size: 12px;
				background-color: #EBEAE7;
				color: #9E9A9E;
			}
			
			.default_list {
				font-size: 12px;
				border: 1px solid #849EB5;
			}
			
			.default_textarea {
				font-size: 12px;
				border: 1px solid #849EB5;
			}
			
			.nowrite_textarea {
				border: 1px solid #849EB5;
				font-size: 12px;
				background-color: #EBEAE7;
				color: #9E9A9E;
			}
			
			.wordtd5 {
				font-size: 12px;
				text-align: center;
				vertical-align: top;
				padding-top: 6px;
				padding-right: 5px;
				padding-bottom: 3px;
				padding-left: 5px;
				background-color: #b8c4f4;
			}
			
			.wordtd {
				font-size: 12px;
				text-align: left;
				vertical-align: top;
				padding-top: 6px;
				padding-right: 5px;
				padding-bottom: 3px;
				padding-left: 5px;
				background-color: #b8c4f4;
			}
			
			.wordtd_1 {
				font-size: 12px;
				vertical-align: top;
				padding-top: 6px;
				padding-right: 5px;
				padding-bottom: 3px;
				padding-left: 5px;
				background-color: #516CD6;
				color: #fff;
			}
			
			.wordtd_2 {
				font-size: 12px;
				text-align: right;
				vertical-align: top;
				padding-top: 6px;
				padding-right: 5px;
				padding-bottom: 3px;
				padding-left: 5px;
				background-color: #64BDF9;
			}
			
			.wordtd_3 {
				font-size: 12px;
				text-align: right;
				vertical-align: top;
				padding-top: 6px;
				padding-right: 5px;
				padding-bottom: 3px;
				padding-left: 5px;
				background-color: #F1DD34;
			}
			
			.inputtd {
				font-size: 12px;
				vertical-align: top;
				padding-top: 3px;
				padding-right: 3px;
				padding-bottom: 3px;
				padding-left: 3px;
			}
			
			.inputtd2 {
				text-align: center;
				font-size: 12px;
				vertical-align: top;
				padding-top: 3px;
				padding-right: 3px;
				padding-bottom: 3px;
				padding-left: 3px;
			}
			
			.tablebg {
				font-size: 12px;
			}
			
			.tb {
				border-collapse: collapse;
				border: 1px outset #999999;
				background-color: #FFFFFF;
			}
			
			.td2 {
				line-height: 22px;
				text-align: center;
				background-color: #F6F6F6;
			}
			
			.td3 {
				background-color: #B8D3F4;
				text-align: center;
				line-height: 20px;
			}
			
			.td4 {
				background-color: #F6F6F6;
				line-height: 20px;
			}
			
			.td5 {
				border: #000000 solid;
				border-right-width: 0px;
				border-left-width: 0px;
				border-top-width: 0px;
				border-bottom-width: 1px;
			}
			
			.tb td {
				font-size: 12px;
				border: 2px groove #ffffff;
			}
			
			.noborder {
				border: none;
			}
			
			.button {
				border: 1px ridge #ffffff;
				line-height: 18px;
				height: 20px;
				width: 45px;
				padding-top: 0px;
				background: #CBDAF7;
				color: #000000;
				font-size: 9pt;
				font-family: "宋体";
			}
			
			.textarea {
				font-family: Arial, Helvetica, sans-serif, "??";
				font-size: 9pt;
				color: #000000;
				border-bottom-width: 1px;
				border-top-style: none;
				border-right-style: none;
				border-bottom-style: solid;
				border-left-style: none;
				border-bottom-color: #000000;
				background-color: transparent;
				text-align: left
			}
			
			-->
		</style>
		<script src="${pageContext.request.contextPath }/js/jquery-1.11.0.min.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(function() {
				// 选中右移
				
				// 全部右移
			});
		</script>
	</head>

	<body>
		<div style="border:1px dashed #E6E6E6;margin:150px 0px 0px 450px; width:350px; height:250px; background-color:#E6E6E6;">

			<table width="285" height="169" border="0" align="left" cellpadding="0" cellspacing="0" style="margin:15px 0px 0px 15px;">
				<tr>
					<td width="126">
						<!--multiple="multiple" 能同时选择多个   size="10"  确定下拉选的长度-->
						<select id="first" name="first" size="10" multiple="multiple" class="td3" >
							<option value="选项1">选项1</option>
							<option value="选项2">选项2</option>
							<option value="选项3">选项3</option>
							<option value="选项4">选项4</option>
							<option value="选项5">选项5</option>
							<option value="选项6">选项6</option>
							<option value="选项7">选项7</option>
							<option value="选项8">选项8</option>
						</select>
					</td>

					<td width="69" valign="middle">

						<input name="add" id="add" type="button" class="button" value="-->" />
						<input name="add_all" id="add_all" type="button" class="button" value="==>" />
						<input name="remove" id="remove" type="button" class="button" value="&lt;--" />
						<input name="remove_all" id="remove_all" type="button" class="button" value="&lt;==" />

					</td>
					<td width="127" align="left">
						<select id="second" name="second" size="10" multiple="multiple" class="td3" >
							<option value="选项9">选项9</option>
						</select>
					</td>
				</tr>
			</table>
		</div>
	</body>

</html>