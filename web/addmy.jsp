<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="./foreground/info.jsp" %>
<html lang="en">
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
            <div class="col-md-10 offset-md-1 col-lg-4 offset-lg-0">
                <div class="sidebar">
                    <jsp:include page="foreground/myxinxi.jsp"></jsp:include>
                </div>
            </div>
            <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-0">
                <!-- Edit Personal Info -->
                <div class="widget personal-info">


                    <h3 class="widget-header user">编辑个人信息</h3>
                    <div class="x-body">
                        <form action="<%=request.getContextPath()%>/ClientServlet?action=add" method="post">
                            <div class="form-group">
                               <%-- <label for="id">编号</label>--%>
                                <input type="hidden" class="form-control" id="id" name="id" readonly>
                            </div>
                            <div class="form-group">
                                <label for="name">姓名</label>
                                <input type="text" class="form-control" id="name" name="name">
                            </div>
                            <div class="form-group">
                                <label for="sex">性别</label>
                                <input type="radio"  name="sex" <%--class="form-control"--%> value="男" id="sex">男
                                <input type="radio" name="sex"  value="女" id="">女
                            </div>

                            <div class="form-group">
                                <label for="age">年龄</label>
                                <input type="text" class="form-control" id="age" name="age">
                            </div>

                            <div class="form-group">
                                <label for="idNumber">身份证</label>
                                <input type="text" class="form-control" id="idNumber" name="idNumber">
                            </div>
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="email" class="form-control" id="email" name="email">
                            </div>
                            <div class="form-group">
                                <label for="tel">联系方式</label>
                                <input type="text" class="form-control" id="tel" name="tel">
                            </div>
                            <div class="form-group">
                                <label for="driveNumber">驾驶证编号</label>
                                <input type="text" class="form-control" id="driveNumber" name="driveNumber">
                            </div>
                            <div class="form-group">
                                <label for="driveType">驾驶证类型</label>
                                <input type="text" class="form-control" id="driveType" name="driveType">
                            </div>
                            <div class="form-group">
                                <label for="address">家庭住址</label>
                                <input type="text" class="form-control" id="address" name="address">
                            </div>
                            <%--<div class="form-group">
                                <label for="integral">我的积分</label>
                                <input type="text" class="form-control" id="integral">
                            </div>--%>
                            <input type="submit" value="添加信息">
                            <!-- Submit button -->
                            <%--<button class="layui-btn" lay-filter="add"
                                    lay-submit="add">保存修改
                            </button>--%>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<%--<script>

    layui.use(['form', 'layer'], function () {
        $ = layui.jquery;
        var form = layui.form
            , layer = layui.layer;

        // //自定义验证规则
        // form.verify({
        //     nikename: function(value){
        //         if(value.length < 5){
        //             return '昵称至少得5个字符啊';
        //         }
        //     }
        //     ,pass: [/(.+){6,12}$/, '密码必须6到12位']
        //     ,repass: function(value){
        //         if($('#L_pass').val()!=$('#L_repass').val()){
        //             return '两次密码不一致';
        //         }
        //     }
        // });

        //监听提交


        form.on('submit(add)', function (data) {
            username = document.getElementById("name").value
            age = document.getElementById("age").value
            sex =$("input[name='sex']:checked").val();
            /*sex = document.getElementsByName("sex").values()
            for (var i = 0; i < sex.length; i++) {
                if (sex[i].checked == true) {
                    sex=sex[i].value
                }
            }*/
            idNumber = document.getElementById("idNumber").value
            email = document.getElementById("email").value
            tel = document.getElementById("tel").value
            driveNumber = document.getElementById("driveNumber").value
            driveType = document.getElementById("driveType").value
            address = document.getElementById("address").value
            integral = document.getElementById("integral").value
            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/ClientServlet",
                data: {
                    "action": "add",
                    "name": username,
                    "age": age,
                    "sex": sex,
                    "id_number": idNumber,
                    "email": email,
                    "tel": tel,
                    "drive_number": driveNumber,
                    "drive_type": driveType,
                    "address": address,
                    "integral":integral
                },
                success:function (msg) {
                    if(msg=="1"){
                        //发异步，把数据提交给java
                        alert("修改成功")
                       // layer.alert("修改成功", {icon: 6},function () {
                            //window.location.href="/ClientServlet?action=findByIdNumber"
                       /* window.location.href="clientList.jsp"*/
                            /*    // 获得frame索引
                                var index = parent.layer.getFrameIndex(window.name);
                                //关闭当前frame
                                layer.close(index);
                                //修改成功后刷新父界面
                               location.reload();*/
                        //});0
                    }else{
                        layer.msg("信息不存在，修改失败！");
                    }
                },
                error:function () {
                    layer.msg("修改异常");
                }
            })
            return false;
        });
    });
</script>--%>

<jsp:include page="foreground/commons/link.jsp"></jsp:include>
<jsp:include page="foreground/commons/foot.jsp"></jsp:include>

</body>
</html>
