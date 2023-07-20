package jsp_demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp_demo.Employee;

/**
 * Servlet implementation class MyController
 */
@WebServlet(urlPatterns = "/controller.do")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
    	 doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		int rollno=Integer.parseInt(request.getParameter("roll"));
		out.println("hello i am from controller....! <br>");
		request.setAttribute("EMP",new Employee(name,rollno));
		RequestDispatcher view=request.getRequestDispatcher("success.jsp");
		view.include(request, response);
	}
}
