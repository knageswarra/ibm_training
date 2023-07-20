package patient_app.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patient_app.model.Patient;

/**
 * Servlet implementation class Add_patient
 */
public class Add_patient extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
		//doGet(request, response);
		process(request, response);
	}
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
	  String name=request.getParameter("name");
	  int age=Integer.parseInt(request.getParameter("age"));
	  String gender=request.getParameter("gender");
	  String address=request.getParameter("address");
	  String disease=request.getParameter("disease");
	  String email=request.getParameter("email");
	  List<String> errors=new ArrayList<String>();
	  if(name.length()<=4)
		  errors.add("name should contain atleast 5 characters");
	  if(age<=0)
		  errors.add("age should be positive");
	  if(email.indexOf("@gmail.com")==-1)
		  errors.add("given email is not valid");
	  if(!errors.isEmpty())
		{
			request.setAttribute("ERROR", errors);
			RequestDispatcher view=request.getRequestDispatcher("error.view");
			view.forward(request, response);
		}
	  else
	  {
		  request.setAttribute("Patient",new Patient(name,age,gender,address,disease,email));
		  RequestDispatcher view=request.getRequestDispatcher("success.view");
		  view.forward(request, response);
		  
	  }
	 
	  
	}
	

}
