<%--
  Created by IntelliJ IDEA.
  User: Liu
  Date: 2018/7/25
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>省市区三级联动</title>
    <!--引入JQuery文件-->
    <script type="text/javascript" src="/day17/js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript">
        //页面加载事件
        $(function () {
            //1. 加载省的信息.
            $.ajax({
                type: "get",
                url: "${pageContext.request.contextPath}/pcdListServlet",
                data: "pid=-1",
                success: function (data) {
                    //console.info(data)
                    //1. 定义字符串.
                    var str = " <option value='null'>--请选择省--</option>";
                    //2. 遍历,拼接.
                    for(var i=0; i<data.length; i++) {
                        //data[i]: 记录的就是每个省的信息, 例如: {id: 13, name: "河北", pid: -1}
                        str += " <option value='"+ data[i].id +"'>"+ data[i].name +"</option>";
                    }
                    //3. 设置值到具体的: 元素中.
                    $("#province").html(str);
                }
            });

            //2. 当省变化的时候, 加载市的信息.
            $("#province").change(function () {
                //细节: 清除:市, 县区的信息
                $("#city").html("<option value='null'>--请选择市--</option>");
                $("#district").html("<option value='null'>--请选择县区--</option>");

                $.ajax({
                    type: "get",
                    url: "${pageContext.request.contextPath}/pcdListServlet",
                    data: "pid=" + this.value ,
                    success: function (data) {
                        //console.info(data)
                        //1. 定义字符串.
                        var str = " <option value='null'>--请选择市--</option>";
                        //2. 遍历,拼接.
                        for(var i=0; i<data.length; i++) {
                            //data[i]: 记录的就是每个市的信息,
                            str += " <option value='"+ data[i].id +"'>"+ data[i].name +"</option>";
                        }
                        //3. 设置值到具体的: 元素中.
                        $("#city").html(str);
                    }
                });
            });


            //3. 当市变化的时候, 加载县区的信息.
            $("#city").change(function () {
                //细节: 清除:县区的信息
                $("#district").html("<option value='null'>--请选择县区--</option>");

                $.ajax({
                    type: "get",
                    url: "${pageContext.request.contextPath}/pcdListServlet",
                    data: "pid=" + this.value ,
                    success: function (data) {
                        //console.info(data)
                        //1. 定义字符串.
                        var str = " <option value='null'>--请选择县区--</option>";
                        //2. 遍历,拼接.
                        for(var i=0; i<data.length; i++) {
                            //data[i]: 记录的就是每个县区的信息,
                            str += " <option value='"+ data[i].id +"'>"+ data[i].name +"</option>";
                        }
                        //3. 设置值到具体的: 元素中.
                        $("#district").html(str);
                    }
                });
            });
        })


    </script>
</head>
<body>
    <select id="province">
        <option value="null">--请选择省--</option>
    </select>
    <select id="city">
        <option value="null">--请选择市--</option>
    </select>
    <select id="district">
        <option value="null">--请选择县区--</option>
    </select>

</body>
</html>
