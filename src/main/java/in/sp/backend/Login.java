package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SearchPage")  //url of action tag known as annotation  
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
//		String user_name=req.getParameter("user");
//		String password=req.getParameter("pass");
//		PrintWriter out=resp.getWriter();
//		if(user_name.equals("Manoj") && password.equals("user1234")) {
//		out.println("Welcome in our Website !");
//		}
//		else {
//		out.print("error: Please Re enter .....");
//		}
		
		String mysearch=req.getParameter("search_data");
		resp.sendRedirect("https://www.google.com/search?q="+mysearch);
	}
	
  
}
 