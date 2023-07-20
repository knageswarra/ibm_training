package patient_app.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patient_app.entity.PatientEntity;
import patient_app.model.Patient;
import patient_app.service.PatientSer;
import patient_app.service.PatientSerImp;

public class SuccessView extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		process(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		process(request,response);
	}
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	    Patient p=(Patient)request.getAttribute("Patient");
	    PatientEntity pe=new PatientEntity(p.getName(),p.getAge(),p.getGender(),p.getAddress(),p.getDisease(),p.getEmailid());
	    PatientSer ser=new PatientSerImp();
	    ser.create(pe);
	    out.println("<h2> Patient registration is complete</h2> <br>"
	    		+ "Patient name:"+p.getName()+"<br>patient age:"+p.getAge()+"<br>patient disease:"
	    		+p.getDisease()+"<br>patient gender:"+p.getGender()+"<br>patient address:"+p.getAddress()
	    		+"<br>patient email id:"+p.getEmailid()+"<br>");
	    out.println("<a href='welcome.html'>Home</a>");
	}
}
