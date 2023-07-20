package patient_app.view;

import java.io.IOException;
import java.io.PrintWriter;

import patient_app.entity.PatientEntity;
import patient_app.service.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchData
 */
public class FetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Id</title></head><body><form>");
		out.println("<br>Enter the id:<input type='text' name='pid'></body>");
		out.println("<input type='submit' name='submit'></html>");
		int id=Integer.parseInt(request.getParameter("pid"));
		PatientSer ser=new PatientSerImp();
		PatientEntity p=ser.identifyById(id);
		if(p==null)
			out.println("<br> no patient is there with specific id");
		else
			out.println("<br>"+p);
		out.println("<br>" +"<a href='welcome.html'>Home</a>");
		
		
	}
}
