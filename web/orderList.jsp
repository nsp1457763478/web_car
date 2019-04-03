<%@ page import="com.util.UUIDUtil" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/30 0030
  Time: 下午 1:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="./foreground/info.jsp" %>
<html>
<head>
    <!-- SITE TITTLE -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Calssimax</title>


</head>
<body class="body-wrapper">
<jsp:include page="foreground/commons/header.jsp"></jsp:include>
<section class="user-profile section">
    <div class="container">
        <div class="row">
            <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-0">
                <!-- Edit Personal Info -->
                <div class="widget personal-info">
                    <h3 class="widget-header user">订单</h3>
                    <form action="<%=request.getContextPath()%>/OrderListServlet?action=add" method="post">
                        <div class="form-group">
                            <label for="id">订单号</label>
                            <input type="text" class="form-control" value="<%=UUIDUtil.getUUID()%>" id="id" name="id">
                        </div>
                        <div class="form-group">
                            <label for="name">姓名</label>
                            <input type="text" class="form-control" name="name" id="name">
                        </div>
                        <div class="form-group">
                            <label for="tel">电话</label>
                            <input type="text" class="form-control" name="tel" id="tel">
                        </div>

                         <div class="form-group">
                            <label for="carName">车名</label>
                            <input type="text" class="form-control" name="carName" id="carName" placeholder="请输入车名">
                        </div>
                        <div class="form-group">
                            <label for="lease">租赁方式</label>
                            <input type="text" class="form-control" name="lease" id="lease" placeholder="日租或月租">
                        </div>
                       <%--<div class="form-group">
                            <label >选择车</label>
                            <select name="gradeId" id="selectcar" lay-verify="required">
                                <option value=""></option>
                                    <option selected="selected">===请选择===</option>
                                    <option name="gradeId" value="C">C</option>
                                    <option name="gradeId" value="D">D</option>
                                    <option name="gradeId" value="E">E</option>
                                    &lt;%&ndash;<option value="${carDiades.gradeId}">${carDiades.grade}</option>&ndash;%&gt;
                               &lt;%&ndash; <option name="gradeId" value="C">C</option>
                                <option name="gradeId" value="D">D</option>
                                <option name="gradeId" value="E">E</option>
                                <option selected="selected">===请选择===</option>&ndash;%&gt;
                            </select>
                        </div>
                        <div class="form-group">
                            <label >租赁方式</label>
                            <select name="lease" id="selectlease" lay-verify="required">
                                <option value=""></option>
                                   <option selected="selected">===请选择===</option>
                                   <option name="lease" value="日租">日租</option>
                                   <option name="lease" value="月租">月租</option>
                                    &lt;%&ndash;<option value="${carDiades.gradeId}">${carDiades.grade}</option>&ndash;%&gt;
                            </select>
                        </div>--%>
                        <div class="form-group">
                            <label for="orderTime">下单时间</label>
                            <input type="date" class="form-control" name="orderTime" id="orderTime">
                        </div>
                        <%--<div class="form-group">
                            <label for="lease">时间</label>
                            <input type="text" class="form-control" id="lease">
                        </div>--%>
                        <button  type="submit"<%-- lay-filter="add" lay-submit=""--%> class="btn btn-transparent">下单</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>


<jsp:include page="foreground/commons/link.jsp"></jsp:include>
<jsp:include page="foreground/commons/foot.jsp"></jsp:include>


<script>
    layui.use(['form','layer'], function(){
        $ = layui.jquery;
        var form = layui.form
            ,layer = layui.layer;

        //监听提交
        form.on('submit(add)', function(data){
            uname = document.getElementById("name").value
            tel = document.getElementById("tel").value

            selectcar = document.getElementsByName("selectcar").values()
            var selectedText = options[index].text;
            for (var i = 0;i<selectcar.length;i++) {
                if (selectcar[i].selected == true) {
                    var car = obj[i].value;
                }
            }
            text1 = car;

            selectlease = document.getElementsByName("selectlease").values()
            var selectlease = options[index].text;
            for (var i = 0;i<selectlease.length;i++) {
                if (selectlease[i].selected == true) {
                    var lease = obj[i].value;
                }
            }
            text1 = lease;

            orderTime = document.getElementById("orderTime").value

            $.ajax({
                type:"post",
                url:"<%=request.getContextPath()%>/OrderListServlet",
                data:{
                    "action":"add",
                    "name":uname,
                    "tel":tel,
                    "carName":text1,
                    "lease":text1,
                    "orderTime":orderTime
                },
                success:function (msg) {
                    if(msg=="1"){
                        //发异步，把数据提交给java
                        layer.alert("下单成功", {icon: 6},function () {
                            // 获得frame索引
                            var index = parent.layer.getFrameIndex(window.name);
                            //关闭当前frame
                            parent.layer.close(index);
                            window.parent.location.reload();
                        });
                    }else{
                        layer.msg("信息不存在，修改失败！");
                    }
                },
                error:function () {
                    layer.msg("下单异常");
                }
            })
            return false;
        });
    });
</script>


</body>
</html>
