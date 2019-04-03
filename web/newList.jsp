<%@ page import="com.entity.OrderList" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@include file="./foreground/info.jsp" %>
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
                    <%
                        OrderList orderList = (OrderList) request.getAttribute("orderList");
                        if(orderList==null){
                            String msg="当前暂无信息";
                        }
                    %>
                    <p>以下是订单信息:</p>
                    <table class="table table-responsive product-dashboard-table">
                        <thead>
                        <tr>
                            <th>图片</th>
                            <th>详细信息</th>
                            <th class="text-center">费用</th>
                            <th class="text-center">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <%--<form action="<%=request.getContextPath()%>/OrderListServlet?action=updateOverTime" method="post">--%>
                            <tr>
                                <%
                                    String format = (String) request.getAttribute("format");
                                %>

                                <td class="product-thumb">
                                    <img width="80px" height="auto" src="<%=request.getContextPath()%>/carImg/1.jpg"
                                         alt="image description"></td>
                                <td class="product-details">
                                    <h3 class="title" name="carName"id="carName">${orderList.carName}</h3>
                                    <span class="add-id"><strong>订单编号:</strong><time name="orderId"id="orderId">${orderList.orderId}</time></span>
                                    <span><strong>下单时间: </strong><time name="orderTime"
                                                                       id="orderTime">${orderList.orderTime}</time> </span>
                                    <span><strong>结束时间: </strong><time name="overTime" id="overTime"></time> </span>
                                    <%--<span><strong>使用时间: </strong><time name="useTime" id="useTime"> </time> </span>--%>
                                    <span><strong>租赁形式: </strong><time name="lease" id="lease">${orderList.lease}</time></span>
                                    <span><strong>租赁费用: </strong><time name="allCost" id="allCost">${orderList.allCost}</time></span>
                                    <span class="location"><strong>联系方式:</strong><time name="tel" id="tel">${orderList.tel}</time></span>
                                </td>
                                <%-- <%
                                     OrderList orderList = (OrderList)request.getAttribute("orderList");
                                 %>
                                 <h3 class="title">${orderList.carName}</h3>
                                 <span class="add-id"><strong>订单编号:</strong>${orderList.orderId}</span>
                                 <span><strong>下订单时间: </strong><time>${orderList.orderTime}</time> </span>
                                 <span><strong>结束时间: </strong><time>${orderList.overTime}</time> </span>
                                 <span><strong>租赁时长: </strong><time>${orderList.lease}</time> </span>
                                 <span><strong>租赁费用: </strong>${orderList.allCost}</span>--%>
                                <td class="product-category"><span class="categories">${orderList.allCost}(元)</span>
                                </td>
                                <td class="action" data-title="Action">
                                    <div class="">
                                        <ul class="list-inline justify-content-center">
                                            <input type="submit" value="结束" name="结束" onclick="over()">
                                        </ul>
                                    </div>

                                </td>
                            </tr>

                        <%--</form>--%>
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
<script type="text/javascript">
    function over() {
        /*var date = new Date();
        time = timeStamp2String(date);
        document.getElementById("overTime").innerHTML = time;*/
        orderId = document.getElementById("orderId").innerText
        tel = document.getElementById("tel").innerText
        carName = document.getElementById("carName").innerText
        lease = document.getElementById("lease").innerText
        orderTime = document.getElementById("orderTime").innerText
        overTime = document.getElementById("overTime").innerText
        allCost = document.getElementById("allCost").innerText
        $.ajax({
            type: "post",
            url: "<%=request.getContextPath()%>/OrderListServlet",
            data: {
                "action":"updateOverTime",
                "orderId":orderId,
                "tel":tel,
                "carName":carName,
                "lease":lease,
                "orderTime":orderTime,
                "overTime":overTime,
                "allCost":allCost
            },
            success:function(){
            },
            error:function () {
            }
        })
    }

    function timeStamp2String(time) {
        var datetime = new Date();
        datetime.setTime(time);
        var year = datetime.getFullYear();
        var month = datetime.getMonth() + 1 < 10 ? "0" + (datetime.getMonth() + 1) : datetime.getMonth() + 1;
        var date = datetime.getDate() < 10 ? "0" + datetime.getDate() : datetime.getDate();
        /*var hour = datetime.getHours()< 10 ? "0" + datetime.getHours() : datetime.getHours();
        var minute = datetime.getMinutes()< 10 ? "0" + datetime.getMinutes() : datetime.getMinutes();
        var second = datetime.getSeconds()< 10 ? "0" + datetime.getSeconds() : datetime.getSeconds();*/
        return year + "-" + month + "-" + date/*+" "+hour+":"+minute+":"+second*/;
    }
</script>

</body>

</html>
