<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/30 0030
  Time: 下午 4:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-md-3">
    <div class="category-sidebar">
        <div class="widget category-list">
            <h4 class="widget-header">车辆款式</h4>
            <ul class="category-list" id="demo">
                <li><a href="<%=request.getContextPath()%>/Ccar.jsp">C级车</a></li>
                <li><a href="<%=request.getContextPath()%>/Dcar.jsp">D级车</a></li>
                <li><a href="<%=request.getContextPath()%>/SUVcar.jsp">SUV</a></li>
            </ul>
        </div>

        <div class="widget category-list">
            <h4 class="widget-header">车辆名称</h4>
            <ul class="category-list">
                <li><a href="<%=request.getContextPath()%>/Dazongcar.jsp">大众</a></li>
                <li><a href="<%=request.getContextPath()%>/biekecar.jsp">别克</a></li>
                <li><a href="<%=request.getContextPath()%>/aodicar.jsp">奥迪</a></li>
                <li><a href="<%=request.getContextPath()%>/baomacar.jsp">宝马</a></li>
                <li><a href="<%=request.getContextPath()%>/woerwocar.jsp">沃尔沃</a></li>
                <li><a href="<%=request.getContextPath()%>/xiandaicar.jsp">现代</a></li>
            </ul>
        </div>
    </div>
</div>
