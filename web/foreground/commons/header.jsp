<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/27 0027
  Time: 上午 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<section>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <nav class="navbar navbar-expand-lg  navigation">
                    <a class="navbar-brand" href="index.html">
                        <img src="<%= request.getContextPath()%>/static/img/logo.png" alt="">
                    </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto main-nav ">
                            <li class="nav-item active">
                                <a class="nav-link" href="<%=request.getContextPath()%>/index.jsp">主页</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="<%=request.getContextPath()%>/my.jsp">我的信息</a>
                            </li>
                        </ul>
                        <ul class="navbar-nav ml-auto mt-10">
                            <li class="nav-item">
                                <a class="nav-link login-button" href="<%=request.getContextPath()%>/fLogin.jsp">登录</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link login-button" href="<%=request.getContextPath()%>/fzhuce.jsp">注册</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link add-button" href="#">
                                    购物车</a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>
    </div>
</section>
</body>
</html>
