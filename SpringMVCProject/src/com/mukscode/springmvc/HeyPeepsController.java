package com.mukscode.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeyPeepsController {
	
	//need a controller method to initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "heypeeps-form";
	}
	
	//need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "heypeeps";
	}
	
	//need a controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML Form
		String theName = request.getParameter("studentName");
		
		//convert the data to all CAPS
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo! " + theName ;
		
		//add message to the model
		model.addAttribute("message",result);
		
		return "heypeeps";

	}
}
