<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>test01.html</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<script src="${pageContext.request.contextPath }/js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/03_demo/cities.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
	$(function(){
		//1. 加载省的信息
        //1.1 定义遍历, 记录所有的省的信息.
        var provinceStr = " <option value='none'>--请选择省--</option>";           //细节, 要有初始化值.
        //1.2 遍历数组, 获取所有的省的信息
        for(var i=0; i<china.length; i++) {
            //china[i]: 记录的就是每一个省的信息.
            //jl...吉林省
            //console.info(china[i].p_id + "..." + china[i].p_name)
            //1.3 将获取到的每一个省的信息, 累加给变量: provinceStr
            provinceStr += "<option value='"+ china[i].p_id +"'>"+ china[i].p_name +"</option>";
        }
        //1.4 将provinceStr(记录所有的省的信息), 填充到指定的下拉列表中.
        //console.info(provinceStr)
        $("#province").html(provinceStr)


        //2. 当省信息变化的时候, 加载市的信息.
        $("#province").change(function () {
            //2.1 获取到用户选择的省份
            //console.info($(this).val())     //jQuery写法
            //console.info(this.value)          //js写法
            var pid = this.value;

            //2.2 遍历china数组, 获取到每个省的信息
            for(var i=0; i<china.length; i++) {
                //china[i]: 记录的就是每一个省的信息.
                //2.3 校验遍历到的省的id 和 用户选择的省的id是否一致
                if (china[i].p_id == pid) {
                    //2.4 能走到这里, 说明:  china[i]就是我们要操作的省.
                    //2.5 定义变量, 记录该省所有的市的信息.
                    var cityStr = "<option value='none'>--请选择市--</option>";
                    //2.6 遍历china[i].cities, 获取到每一个市的信息
                    for(var j=0; j<china[i].cities.length; j++) {
                        //china[i].cities[j]: 就是该省的每一个市的信息.
                        //2.7 将其信息按照格式拼接给: cityStr.
                        cityStr += "<option value='"+ china[i].cities[j].c_id +"'>"+ china[i].cities[j].c_name+"</option>";
                    }
                    //2.8 将cityStr(记录该省所有的式的信息), 填充到指定的下拉列表中.
                    //console.info(cityStr)
                    $("#city").html(cityStr);
                }
            }

        });

	});
    </script>
  </head>
  <body>
     <select id="province" name="province">
       <option value="none">--请选择省--</option>
     </select>
     
	 <select id="city" name="city">
	 	<option value="none">--请选择市--</option>
	 </select>
  
  </body>
  
</html>
