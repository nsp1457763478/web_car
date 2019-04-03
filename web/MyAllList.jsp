<%@ page import="com.entity.OrderList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="./foreground/info.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/29 0029
  Time: 上午 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>

    <!-- SITE TITTLE -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Calssimax</title>
    <!-- FAVICON -->
    <link href="img/favicon.png" rel="shortcut icon">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/bootstrap/css/bootstrap.css">
    <link href="<%= request.getContextPath()%>/static/css/style.css" rel="stylesheet">


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
    <link href="<%= request.getContextPath()%>/plugins/seiyria-bootstrap-slider/dist/css/bootstrap-slider.min.css"
          rel="stylesheet">
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
<section class="dashboard section">
    <!-- Container Start -->
    <div class="container">
        <!-- Row Start -->
        <div class="row">
            <div class="col-md-10 offset-md-1 col-lg-4 offset-lg-0">
                <div class="sidebar">
                    <!-- User Widget -->
                    <jsp:include page="foreground/myxinxi.jsp"></jsp:include>

                </div>
            </div>
            <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-0">
                <div class="widget dashboard-container my-adslist">
                    <h3 class="widget-header">我的历史订单</h3>
                    <table class="table table-responsive product-dashboard-table">
                        <thead>
                        <tr>
                            <th>图片</th>
                            <th>详细信息</th>
                            <th class="text-center">费用</th>
                        </tr>
                        </thead>

                        <tbody>
                        <%--<%
                            List<OrderList> allOrder =(List<OrderList>) request.getAttribute("allOrder");
                            pageContext.setAttribute("allOrder",allOrder);
                        %>--%>
                        <c:forEach items="${allOrder}" var="allOrder">
                            <tr>
                                <td class="product-thumb">
                                    <img width="80px" height="auto" src="<%=request.getContextPath()%>/carImg/1.jpg"
                                         alt="image description"></td>
                                <td class="product-details">
                                    <h3 class="title">${allOrder.carName}</h3>
                                    <span class="add-id"><strong>订单编号:</strong>${allOrder.orderId}</span>
                                    <span><strong>下订单时间: </strong><time>${allOrder.orderTime}</time> </span>
                                    <span><strong>结束时间: </strong><time>${allOrder.overTime}</time> </span>
                                    <span><strong>使用时间: </strong><time>${allOrder.lease}</time> </span>
                                    <span><strong>租赁费用: </strong>${allOrder.allCost}(元)</span>
                                    <span class="location"><strong>电话</strong>${allOrder.tel}</span>
                                </td>
                                <td class="product-category"><span class="categories">${allOrder.allCost}(元)</span></td>
                            </tr>
                        </c:forEach>


                        <%-- <tr>
                             <td class="product-thumb">
                                 <img width="80px" height="auto" src="<%=request.getContextPath()%>/carImg/2.jpg" alt="image description"></td>
                             <td class="product-details">
                                 <h3 class="title">宝马</h3>
                                 <span class="add-id"><strong>订单编号:</strong>  2019032908521486</span>
                                 <span><strong>下订单时间: </strong><time>2019-03-26 00:00:00</time> </span>
                                 <span><strong>结束时间: </strong><time>2019-03-28 00:00:00</time> </span>
                                 <span><strong>使用时间: </strong><time>48小时</time> </span>
                                 <span><strong>租赁形式: </strong>日租</span>
                                 <span><strong>租赁费用: </strong>100</span>
                                 <span class="location"><strong>电话</strong>123456789</span>
                             </td>
                             <td class="product-category"><span class="categories">2000</span></td>
                         </tr>--%>

                        </tbody>


                    </table>

                </div>
            </div>
        </div>
        <!-- Row End -->
    </div>
    <!-- Container End -->
</section>
<jsp:include page="foreground/commons/link.jsp"></jsp:include>
<jsp:include page="foreground/commons/foot.jsp"></jsp:include>
<!-- JAVASCRIPTS -->
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

</body>

</html>