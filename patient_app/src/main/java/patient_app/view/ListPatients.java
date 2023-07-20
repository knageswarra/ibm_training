package patient_app.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patient_app.entity.PatientEntity;
import patient_app.service.*;

/**
 * Servlet implementation class ListPatients
 */
public class ListPatients extends HttpServlet {
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
	   PatientSer ser=new PatientSerImp();
	   List<PatientEntity> le=ser.listAll();
	   
	   out.println("The list of patients are ");
	   for(PatientEntity p:le)
	   {
		   out.println("<font color='blue'><li>"+p+"</li></font>");
	   }
	   }
	  
	   
	
	}
	

