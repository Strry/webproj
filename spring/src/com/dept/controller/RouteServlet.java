package com.dept.controller;

import com.dept.dto.DeptDTO;
import com.dept.service.DeptService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/biz/showdept")
public class RouteServlet extends HttpServlet {
    private DeptService deptservice =new DeptService();
    private String type = "";
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        type = req.getParameter("type");
        if(null==type||"".equals(type)){
            req.getRequestDispatcher("/com/dept/show.jsp").forward(req,resp);
        }

        if("serach".equals(type)){
            req.getRequestDispatcher("/com/dept/show.jsp").forward(req,resp);
        }

    }

}
