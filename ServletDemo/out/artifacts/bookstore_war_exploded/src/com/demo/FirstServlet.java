package com.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet {
    ServletContext context=null;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO Auto-generated method stub
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO Auto-generated method stub
        request.setCharacterEncoding("GBK");
        response.setContentType("text/html;charset=GBK");
        String sno=request.getParameter("sno");
        String name=request.getParameter("name");
        Student s1=new Student(sno,name);
        context=getServletContext();
        context.setAttribute("student",s1);
        RequestDispatcher dispatcher=context.getRequestDispatcher("/com.demo.SecondServlet.do");
        dispatcher.forward(request,response);
    }
}
