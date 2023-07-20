package spring_mvc_demo;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Employee;

@Controller
public class MyController {

	@RequestMapping
	public String goHome() {
		return "home1";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "showForm";
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(HttpServletRequest request, Model theModel)
	{
		String name=request.getParameter("t1");
		double age=Double.parseDouble(request.getParameter("t2"));
		List<String> errors=new ArrayList<>();
		if(name.length()<=3)
			errors.add("name should contains atleast 4 characters");
		if(age<0)
			errors.add("age cannot be neagative");
		else if(age<18)
			errors.add("age should be atleast 18");
		if(!errors.isEmpty())
		{
			theModel.addAttribute("ERRORS",errors);
			return "showForm";
		}
		theModel.addAttribute("EMP",new Employee(name,age));
		return "success";
	}

}
