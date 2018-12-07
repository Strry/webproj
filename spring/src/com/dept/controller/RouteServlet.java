package com.dept.controller;

import com.dept.dto.DeptDTO;
import com.dept.service.DeptService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/biz/showdept")
public class RouteServlet extends HttpServlet {
    private DeptService deptservice;
    private String type = "";

    @Override
    public void init() throws ServletException {
        ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        deptservice = ac.getBean("deptservice", DeptService.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        type = req.getParameter("type");
        if(null==type||"".equals(type)){
            List<DeptDTO> list = deptservice.getAllDeptDTO();
            req.setAttribute("list",list);
            req.getRequestDispatcher("/com/dept/show.jsp").forward(req,resp);
        }

        if("serach".equals(type)){
            req.getRequestDispatcher("/com/dept/show.jsp").forward(req,resp);
        }

    }

}
