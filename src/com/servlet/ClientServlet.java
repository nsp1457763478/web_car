package com.servlet;


import com.entity.Client;
import com.entity.OrderList;
import com.service.ClientService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ClientServlet",urlPatterns = "/ClientServlet")
public class ClientServlet extends HttpServlet {
    private ClientService service = new ClientService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进来了0...");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        System.out.println(action);
        if("add".equals(action)){
            add(request,response);
        }else if("delete".equals(action)){
            add(request,response);
        }else if("update".equals(action)){
            update(request,response);
        }else if("findAll".equals(action)){
            findAll(request,response);
        }else if("findByIdNumber".equals(action)){
            findByIdNumber(request,response);
        }
    }

    //获取会员积分
    protected void getIntegral(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderList orderList = new OrderList();
        //总金额
        int all_cost = orderList.getAllCost();
        int integral = 0;
        integral = all_cost/10;
        request.setAttribute("integral",integral);
        response.getWriter().print(integral);
    }


    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String idNumber = request.getParameter("idNumber");
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");
        String driveNumber = request.getParameter("driveNumber");
        String driveType = request.getParameter("driveType");
        String address = request.getParameter("address");
       // String integral = request.getParameter("integral");
        Client client = new Client(name, sex,Integer.parseInt(age), idNumber, email,
                tel, driveNumber, driveType, address);
        if(client==null ){

        }
        System.out.println("client======"+client);
       HttpSession session = request.getSession();
        session.setAttribute("client",client);
        //request.setAttribute("client",client);

        int i = service.addClient(client);
        System.out.println("i====="+i);
        response.getWriter().print(i);
        request.getRequestDispatcher("/my.jsp").forward(request,response);

    }
    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String clientId = request.getParameter("clientId");
        int clientid = Integer.parseInt(clientId);
        int i = service.deleteClient(clientid);
        response.getWriter().print(i);
    }
    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String clientId = request.getParameter("clientId");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String idNumber = request.getParameter("idNumber");
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");
        String driveNumber = request.getParameter("driveNumber");
        String driveType = request.getParameter("driveType");
        String address = request.getParameter("address");
        Client client = new Client(Integer.parseInt(clientId),name, sex, Integer.parseInt(age), idNumber, email,
                tel, driveNumber, driveType, address);
        int i = service.updateClient(client);
        request.setAttribute("client",client);
        request.getSession().setAttribute("client",client);
        request.getRequestDispatcher("/my.jsp").forward(request,response);
        //response.getWriter().print(i);
    }
    protected void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Client> allClient = service.findAllClient();
        request.setAttribute("allClient",allClient);

    }
    protected void findUserInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Client client = service.findUserInfo();
        request.setAttribute("client",client);

    }
    protected void findByIdNumber(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idNumber = request.getParameter("idNumber");
        Client client = service.findByIdNumber(idNumber);
        System.out.println("client====="+client);
        HttpSession session = request.getSession();
        session.setAttribute("client",client);
        request.getRequestDispatcher("/clientList.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
