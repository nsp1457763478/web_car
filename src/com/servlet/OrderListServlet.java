package com.servlet;

import com.entity.OrderList;
import com.entity.User;
import com.service.OrderListService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nsp
 * Date: 2019-03-27
 * Time: 19:18
 * Description: No Description
 */
@WebServlet(name = "OrderListServlet",urlPatterns = "/OrderListServlet")
public class OrderListServlet extends HttpServlet {
    private OrderListService service = new OrderListService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        System.out.println(action);
        if("add".equals(action)){
            add(request,response);
        }else if("delete".equals(action)){
            delete(request,response);
        }else if("update".equals(action)){
            update(request,response);
        }else if("findAll".equals(action)){
            findAll(request,response);
        }else if("findOne".equals(action)){
            findOne(request,response);
        }else if("findOrder".equals(action)){
            findOrder(request,response);
        }else if("updateOverTime".equals(action)){
            updateOverTime(request,response);
        }
    }
    protected void updateOverTime(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd").format(date);
        String orderId = request.getParameter("orderId");
        request.setAttribute("format",format);
        String name = request.getParameter("name");
        String tel = request.getParameter("tel");
        String carName = request.getParameter("carName");
        String lease = request.getParameter("lease");
        String orderTime = request.getParameter("orderTime");
        String overTime =null;
        String allCost = request.getParameter("allCost");
        overTime= format;
        OrderList orderList = new OrderList(orderId, name,tel, carName, lease, orderTime, overTime, Integer.parseInt(allCost));
        int i = service.updateOverTime(orderList);
        request.setAttribute("orderList",orderList);
        request.getSession().setAttribute("orderList",orderList);
        request.getRequestDispatcher("/newList.jsp").forward(request,response);
    }
    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //String orderId = request.getParameter("orderId");
        String orderId = request.getParameter("id");
        String name = request.getParameter("name");
        String tel = request.getParameter("tel");
        String carName = request.getParameter("carName");
        String lease = request.getParameter("lease");
        String orderTime = request.getParameter("orderTime");
        //String overTime = request.getParameter("overTime");
       // String allCost = request.getParameter("allCost");
        OrderList orderList = new OrderList(orderId,name, tel, carName, lease, orderTime);
        /*OrderList orderList = new OrderList(orderId, name,tel, carName, lease, orderTime, overTime, Integer.parseInt(allCost));
        System.out.println("orderList========="+orderList);*/
        int i = service.addOrder(orderList);
        response.getWriter().print(i);
        request.getRequestDispatcher("/my.jsp").forward(request,response);
    }
    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String orderId = request.getParameter("orderId");
        int i = service.deleteOrder(orderId);
        response.getWriter().print(i);
    }
    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String orderId = request.getParameter("orderId");
        String name = request.getParameter("name");
        String tel = request.getParameter("tel");
        String carName = request.getParameter("carName");
        String lease = request.getParameter("lease");
        String orderTime = request.getParameter("orderTime");
        String overTime = request.getParameter("overTime");
        String allCost = request.getParameter("allCost");
        OrderList orderList = new OrderList(orderId, name,tel, carName, lease, orderTime, overTime, Integer.parseInt(allCost));
        int i = service.updateOrder(orderList);
        response.getWriter().print(i);
    }
    protected void findOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tel = request.getParameter("tel");
        OrderList orderList = service.findOne(tel);
        request.setAttribute("orderList",orderList);
        request.getRequestDispatcher("/myList.jsp").forward(request,response);

       /* List<OrderList> allOrder = service.findAllOrder();
        System.out.println("allOrder========="+allOrder);
        request.setAttribute("allOrder",allOrder);
        request.getRequestDispatcher("/my.jsp").forward(request,response);*/
    }
    protected void findOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd").format(date);
        OrderList orderList = service.findOrder();
        request.setAttribute("orderList",orderList);
        request.setAttribute("format",format);
        request.getRequestDispatcher("/newList.jsp").forward(request,response);
    }
    protected void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<OrderList> allOrder = service.findAllOrder();
        request.setAttribute("allOrder",allOrder);
        request.getRequestDispatcher("/MyAllList.jsp").forward(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
