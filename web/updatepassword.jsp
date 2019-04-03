<%@ page import="com.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="./foreground/info.jsp"%>
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
          <%--  <%
                User user = (User)request.getSession().getAttribute("username");
                String username = user.getUsername();
                String password = user.getPassword();
            %>--%>
            <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-0">
                <!-- Edit Personal Info -->
                <div class="widget change-password">
                    <h3 class="widget-header user">编辑密码</h3>
                    <form action="<%=request.getContextPath()%>/updatePwdServlet" method="post">
                        <!-- Current Password -->
                        <div class="form-group">
                            <label for="current-password">旧密码</label>
                            <input type="password" class="form-control" name="oldpwd" id="current-password">
                        </div>
                        <!-- New Password -->
                        <div class="form-group">
                            <label for="new-password">新密码</label>
                            <input type="password" class="form-control" name="newpwd" id="new-password">
                        </div>
                        <!-- Confirm New Password -->
                        <div class="form-group">
                            <label for="confirm-password">确认新密码</label>
                            <input type="password" class="form-control" name="confirmpwd" id="confirm-password">
                        </div>
                        <!-- Submit Button -->
                        <button type="submit" class="btn btn-transparent">更改密码</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="foreground/commons/link.jsp"></jsp:include>
<jsp:include page="foreground/commons/foot.jsp"></jsp:include>
<script>


    /*$("#current-password").blur(function () {
        alert("请输入旧密码")
    })*/
    $.ajax({
        type:"",
        url:"",
        data:"",


    })

</script>

</body>
</html>
