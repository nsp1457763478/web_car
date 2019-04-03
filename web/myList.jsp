<%@ page import="com.entity.OrderList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="./foreground/info.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>newList</title>

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
                    <h3 class="widget-header">我的订单</h3>
                  <%-- <form action="<%=request.getContextPath()%>/OrderListServlet?action=findOne" method="post" enctype="multipart/form-data">
                        <input type="text" id="tel" name="tel" value="" placeholder="请输入手机号查询" />
                        <button style="width: 45px;height: 25px" type="button" class="btn btn-success"  value="查询">查询</button>
                    </form>--%>

                        <table class="table table-responsive product-dashboard-table">
                            <thead>
                            <tr>
                                <th>图片</th>
                                <th>详细信息</th>
                                <th class="text-center">费用</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td class="product-thumb">
                                    <img width="80px" height="auto" src="<%=request.getContextPath()%>/carImg/1.jpg" alt="image description"></td>
                                <td class="product-details">
                                    <%
                                        OrderList orderList = (OrderList)request.getAttribute("orderList");
                                    %>
                                    <h3 class="title">${orderList.carName}</h3>
                                    <span class="add-id"><strong>订单编号:</strong>${orderList.orderId}</span>
                                    <span><strong>姓名: </strong>${orderList.name}</span>
                                    <span class="location"><strong>联系方式:</strong>${orderList.tel}</span>
                                    <span><strong>下订单时间: </strong><time>${orderList.orderTime}</time> </span>
                                    <span><strong>结束时间: </strong><time>${orderList.overTime}</time> </span>
                                    <span><strong>租赁时长: </strong><time>${orderList.lease}</time> </span>
                                    <span><strong>租赁费用: </strong>${orderList.allCost}</span>
                                </td>
                                <td class="product-category"><span class="categories"></span></td>
                            </tr>
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

</body>


</html>
