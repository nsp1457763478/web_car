package com.servlet;

import com.alibaba.fastjson.JSONObject;
import com.entity.Client;
import com.entity.ResultCode;
import com.entity.User;
import com.service.ClientService;
import com.service.UserService;
import com.util.Md5Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @autor : WL;
 * @date : 2019/3/26 0026
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private UserService service=new UserService();
    private ClientService clientService=new ClientService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String action = request.getParameter("action");
        if(action.equals("Login")){
            Login(request,response);
        }else if(action.equals("addUser")){
            addUser(request,response);
        }else if(action.equals("updatePassword")){
            updatePassword(request,response);
        }else if(action.equals("updateState")){
            updateState(request,response);
        }else if(action.equals("add")){
            add(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void Login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String md5 = Md5Util.MD5(password);
        User user = service.queryOne(username);
        ResultCode rc = null;
        if(user!=null){
            if(user.getPassword().equals(md5)){
                rc = new ResultCode("1001","登录成功");
                loginInfo(request,response);
            }else{
                rc = new ResultCode("1002","密码不正确");
            }
        }else{
            rc = new ResultCode("1000","用户名不存在");
        }
        response.getWriter().print(JSONObject.toJSONString(rc));

    }
    protected void updatePassword(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String Jpassword = request.getParameter("Jpassword");
        String newpassword = request.getParameter("newpassword");
        String md5j = Md5Util.MD5(Jpassword);
        String md5x = Md5Util.MD5(newpassword);
        User user1 = service.queryById(Integer.parseInt(userId));
        ResultCode rc = null;
        if(md5j.equals(user1.getPassword())){
            if(md5j.equals(md5x)){
                rc= new ResultCode("1002","输入旧密码与新密码相同");
            }else{
                User user = new User(Integer.parseInt(userId), md5x);
                int i = service.updatePassword(user);
                if(i!=0){
                    rc= new ResultCode("1003","修改成功");
                }
            }
        }else{
            rc= new ResultCode("1001","是本人吗？");
        }
        response.getWriter().print(JSONObject.toJSONString(rc));

    }
    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String md5 = Md5Util.MD5(password);
        User user = new User(username, md5);
        int i = service.add(user);
        response.getWriter().print(""+i);
    }
    protected void updateState(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String userState = request.getParameter("userState");
        User user = new User(Integer.parseInt(userId), userState);
        int i = service.updateState(user);
        response.getWriter().print(""+i);
    }
    protected void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String md5 = Md5Util.MD5(password);
        User user = new User(username, md5);
        int i = service.addUser(user);
        ResultCode rc = null;
        if(i!=0) {
            rc = new ResultCode("1001", "注册成功");
        }else{
            rc = new ResultCode("1002","用户名已存在，请重新注册");
        }

        response.getWriter().print(JSONObject.toJSONString(rc));
    }
    private void loginInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建一次会话， 如果有会话就直接使用
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        Client client = clientService.queryOne(username);
        session.setAttribute("username",username);
        session.setAttribute("client",client);
    }
}
