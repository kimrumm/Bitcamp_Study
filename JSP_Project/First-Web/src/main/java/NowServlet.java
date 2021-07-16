import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NowServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET로 요청");
		
		resp.setContentType("text/html; charset=utf-8");
		
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("	<head><title>NowServlet</title></head>");
		writer.println("<body>");
		writer.println("<h1>"+new Date()+"</h1>");
		writer.println("</body>");
		writer.println("<html>");

		writer.close();
		
		}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST로 요청");
	}

}
