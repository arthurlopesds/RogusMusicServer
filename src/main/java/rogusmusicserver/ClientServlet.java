package rogusmusicserver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/client", "/clientServlet", "/clientController"})
public class ClientServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("User has made a GET request.");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("GET method has been called.");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("User has made a POST request.");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("POST method has been called.");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("User has made a DELETE request.");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("DELETE method has been called.");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("User has made a PUT request.");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("PUT method has been called.");
	}
	
}
