package com.demo;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet")
public class SecondServlet extends HttpServlet {
    private static final long serialVersionUID=1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context=getServletContext();
        Student s2=(Student)context.getAttribute("student");
        response.setCharacterEncoding("GBK");
        PrintWriter pw=response.getWriter();
        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<a href='/bookstore/html/input.html'>返回输入页面</a>");
        pw.println("<h3>学号："+s2.getSno()+"</h3><p>");
        pw.println("<h3>姓名："+s2.getName()+"</h3><p>");
        pw.println("</body>");
        pw.println("</html>");
    }
}
