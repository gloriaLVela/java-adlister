import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

@WebServlet("/counter")
public class PageCounter extends HttpServlet {
    int count = 0;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>This is a " + count + "</h1>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String reset = request.getParameter("reset");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        count++;
        if (reset != null){
            if(Integer.parseInt(reset) == 1){
                count = 0;
            }
        }


        out.println("<h1>The counter is " + count  + "</h1>");
    }
}
