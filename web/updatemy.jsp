<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>

    <!-- SITE TITTLE -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Calssimax</title>

    <!-- PLUGINS CSS STYLE -->
    <link href="<%= request.getContextPath()%>/plugins/jquery-ui/jquery-ui.min.css" rel="stylesheet">
    <!-- Bootstrap -->
    <link href="<%= request.getContextPath()%>/plugins/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="<%= request.getContextPath()%>/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- Owl Carousel -->
    <link href="<%= request.getContextPath()%>/plugins/slick-carousel/slick/slick.css" rel="stylesheet">
    <link href="<%= request.getContextPath()%>/plugins/slick-carousel/slick/slick-theme.css" rel="stylesheet">
    <!-- Fancy Box -->
    <link href="<%= request.getContextPath()%>/plugins/fancybox/jquery.fancybox.pack.css" rel="stylesheet">
    <link href="<%= request.getContextPath()%>/plugins/jquery-nice-select/css/nice-select.css" rel="stylesheet">
    <link href="<%= request.getContextPath()%>/plugins/seiyria-bootstrap-slider/dist/css/bootstrap-slider.min.css" rel="stylesheet">
    <!-- CUSTOM CSS -->
    <link href="<%= request.getContextPath()%>/static/css/style.css" rel="stylesheet">

    <!-- FAVICON -->
    <link href="img/favicon.png" rel="shortcut icon">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
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
                    <form action="#">
                        <div class="form-group">
                            <label for="id">编号</label>
                            <input type="text" class="form-control" id="id" readonly>
                        </div>
                        <div class="form-group">
                            <label for="name">姓名</label>
                            <input type="text" class="form-control" id="name">
                        </div>
                        <div class="form-group">
                            <label for="age">年龄</label>
                            <input type="text" class="form-control" id="age">
                        </div>
                        <div class="form-group">
                            <label for="sex">年龄</label>
                            <input type="text" class="form-control" id="sex">
                        </div>
                        <div class="form-group">
                            <label for="idNumber">身份证</label>
                            <input type="text" class="form-control" id="idNumber">
                        </div>
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="email" class="form-control" id="email">
                        </div>
                        <div class="form-group">
                            <label for="tel">联系方式</label>
                            <input type="text" class="form-control" id="tel">
                        </div>
                        <div class="form-group">
                            <label for="driveNumber">驾驶证编号</label>
                            <input type="email" class="form-control" id="driveNumber">
                        </div>
                        <div class="form-group">
                            <label for="driveType">驾驶证类型</label>
                            <input type="email" class="form-control" id="driveType">
                        </div>
                        <div class="form-group">
                            <label for="address">家庭住址</label>
                            <input type="email" class="form-control" id="address">
                        </div>
                        <!-- Submit button -->
                        <button class="btn btn-transparent">保存修改</button>
                    </form>
                </div>
                <!-- Change Password -->
                <div class="widget change-password">
                    <h3 class="widget-header user">编辑密码</h3>
                    <form action="#">
                        <!-- Current Password -->
                        <div class="form-group">
                            <label for="current-password">旧密码</label>
                            <input type="password" class="form-control" id="current-password">
                        </div>
                        <!-- New Password -->
                        <div class="form-group">
                            <label for="new-password">新密码</label>
                            <input type="password" class="form-control" id="new-password">
                        </div>
                        <!-- Confirm New Password -->
                        <div class="form-group">
                            <label for="confirm-password">确认新密码</label>
                            <input type="password" class="form-control" id="confirm-password">
                        </div>
                        <!-- Submit Button -->
                        <button class="btn btn-transparent">更改密码</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="foreground/commons/link.jsp"></jsp:include>
<jsp:include page="foreground/commons/foot.jsp"></jsp:include>
<script src="<%=request.getContextPath()%>/plugins/jquery/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/plugins/jquery-ui/jquery-ui.min.js"></script>
<script src="<%=request.getContextPath()%>/plugins/tether/js/tether.min.js"></script>
<script src="<%=request.getContextPath()%>/plugins/raty/jquery.raty-fa.js"></script>
<script src="<%=request.getContextPath()%>/plugins/bootstrap/dist/js/popper.min.js"></script>
<script src="<%=request.getContextPath()%>/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/plugins/seiyria-bootstrap-slider/dist/bootstrap-slider.min.js"></script>
<script src="<%=request.getContextPath()%>/plugins/slick-carousel/slick/slick.min.js"></script>
<script src="<%=request.getContextPath()%>/plugins/jquery-nice-select/js/jquery.nice-select.min.js"></script>
<script src="<%=request.getContextPath()%>/plugins/fancybox/jquery.fancybox.pack.js"></script>
<script src="<%=request.getContextPath()%>/plugins/smoothscroll/SmoothScroll.min.js"></script>

<script src="js/scripts.js"></script>
<script>

    $.ajax({
        type:"",
        url:"",
        data:"",


    })

</script>

</body>
</html>
