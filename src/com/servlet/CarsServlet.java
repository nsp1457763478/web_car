package com.servlet;

import com.entity.Cars;
import com.service.CarsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @autor : WL;
 * @date : 2019/3/28 0028
 */
@WebServlet(name = "CarsServlet")
public class CarsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CarsService carsService = new CarsService();

        List<Cars> suv = carsService.findSuv();
        request.setAttribute("suv",suv);

        List<Cars> cList = carsService.findC();
        request.setAttribute("cList",cList);
        System.out.println(cList+"++++++++++");

        List<Cars> dList = carsService.findD();
        request.setAttribute("dList",dList);

        request.getRequestDispatcher("/index.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
