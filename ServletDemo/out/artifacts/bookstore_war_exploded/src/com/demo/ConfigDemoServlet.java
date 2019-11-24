package com.demo;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import static java.lang.String.format;

public class ConfigDemoServlet extends HttpServlet{
    String servletName=null;
    ServletConfig config=null;
    String email=null;
    String telephone=null;
    ServletContext context1;

    public void init() {
        ServletContext context=this.getServletContext();
        config = getServletConfig();
        servletName = config.getServletName();
        email = context.getInitParameter("email");
        telephone = context.getInitParameter("telephone");
        context1=this.getServletContext();

    }

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{

        response.setContentType("text/html;charset=gb2312");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("Servlet名称："+servletName+"<br>");
        out.println("Email地址："+email+"<br>");
        out.println("电话：" +telephone+"<br>");
        out.println("</body></html>");
        context1.log(format("Email地址:%s<br>",email));
        context1.log(format("电话：%s<br>", telephone));
    }
}
