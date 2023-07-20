package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String goHome()
	{
		return "main";
	}
	
	@RequestMapping("/showForm")
	public String showform(Model theModel)
	{
		Student theStudent = new Student();
        // add student object to the model
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processform(@ModelAttribute("student1") Student theStudent,Model theModel)
	{
		/**if(theStudent.getFirstName()=="" || theStudent.getLastName()=="" || theStudent.getRollno()==0)
		{
			theModel.addAttribute("errors","please fill all the fields");
			return "student-form";
		}**/
		   return "student-confirmation";
	}

}
