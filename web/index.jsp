<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/26 0026
  Time: 上午 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <link rel="stylesheet" href="<%= request.getContextPath()%>/static/layui/css/layui.css" media="all">
      <script src="<%= request.getContextPath()%>/static/layui/layui.js"></script>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>$Title$</title>
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


    <!-- FAVICON -->
    <link href="img/favicon.png" rel="shortcut icon">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/bootstrap/css/bootstrap.css">
    <link href="<%= request.getContextPath()%>/static/css/style.css" rel="stylesheet">

  </head>
  <body>
  <body class="body-wrapper">
  <jsp:include page="foreground/commons/header.jsp"></jsp:include>
  <jsp:include page="foreground/commons/banner.jsp"></jsp:include>
  <jsp:include page="foreground/commons/link.jsp"></jsp:include>
  <jsp:include page="foreground/commons/foot.jsp"></jsp:include>
    <script src="plugins/jquery/jquery.min.js"></script>
    <script src="plugins/jquery-ui/jquery-ui.min.js"></script>
    <script src="plugins/tether/js/tether.min.js"></script>
    <script src="plugins/raty/jquery.raty-fa.js"></script>
    <script src="plugins/bootstrap/dist/js/popper.min.js"></script>
    <script src="plugins/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="plugins/seiyria-bootstrap-slider/dist/bootstrap-slider.min.js"></script>
    <script src="plugins/slick-carousel/slick/slick.min.js"></script>
    <script src="plugins/jquery-nice-select/js/jquery.nice-select.min.js"></script>
    <script src="plugins/fancybox/jquery.fancybox.pack.js"></script>
    <script src="plugins/smoothscroll/SmoothScroll.min.js"></script>

    <script src="js/scripts.js"></script>
  </div>
  </body>
</html>
