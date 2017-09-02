import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/proxy")

public class proxy extends HttpServlet{

	protected void doPost (HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException {

		String reqdata = req.getReader().toString();

		res.setContentType("text/plain");

		PrintWriter out = res.getWriter();

		out.println(reqdata);

	}
}
