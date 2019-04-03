package com.servlet;

import com.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: nsp
 * Date: 2019-04-03
 * Time: 14:48
 * Description: No Description
 */
@WebServlet(name = "updatePwdServlet",urlPatterns = "/updatePwdServlet")
public class updatePwdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User)request.getSession().getAttribute("username");
        String oldpwd = request.getParameter("oldpwd");
        String newpwd = request.getParameter("newpwd");
        String confirmpwd = request.getParameter("confirmpwd");
        if(!user.getPassword().equals(oldpwd)){
            System.out.println("旧密码输入有误！请重新输入");
        }else if(user.getPassword().equals(newpwd)){
            System.out.println("新密码不能与旧密码相同");
        }else if(newpwd.equals(confirmpwd)){
            System.out.println("两次密码输入不一致");
        }else{
            System.out.println("修改成功");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
