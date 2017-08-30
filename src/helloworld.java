import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/helloworld") 

public class helloworld extends HttpServlet {

protected void doGet (HttpServletRequest req, HttpServletResponse res)
throws IOException, ServletException {

res.setContentType("text/html");

PrintWriter out = res.getWriter();

out.println("<h1>Hello world</h1>");


}


}

