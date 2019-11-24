import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        request.setCharacterEncoding("gb2312");
        //获取表单中用户名的值
        String user = request.getParameter("user");
        //获取表单中电话号码的值
        String number = request.getParameter("number");
        //获取表单中性别的值
        String sex = request.getParameter("sex");
        String s1 = "输入格式正确！";
        System.out.println(number);
        if (number.length() == 13) {
            for (int i = 0; i < number.length(); i++) {
                if (i == 3 || i == 8){
                    if(number.charAt(3)!='-'&&number.charAt(8)!='-'){
                        s1="输入格式错误！";
                        break; }
                }
else if(number.charAt(i)<'0'||number.charAt(i)>'9'){
                    s1="输入格式错误！";
                    break; }
            }
        } else
            s1 = "输入格式错误！";
        //设置输出流
        PrintWriter out = response.getWriter();
        out.println(" 用户名："+user);
        out.println("               ");
        out.println("   "+sex+"   ");
        out.println("               ");
        out.println("电话号码："+number+"  "+s1);

    }
}
