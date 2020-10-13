package com.mukscode.springmvc;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@Value("#{favoriteLanguageOption}")
	private Map<String,String> favoriteLanguageOption;
	
	@Value("#{operatingSystemFromFile}")
	private Map<String,String> operatingSystems;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create a new student object
		Student theStudent = new Student();
		
		//add student to model object
		theModel.addAttribute("student", theStudent);
		
		//add country options in model object
		theModel.addAttribute("theCountryOptions", countryOptions);
		
		//add favoriteLanguage option in model object
		theModel.addAttribute("theFavoriteLanguage", favoriteLanguageOption);
		
		//add operating system option in model object
		theModel.addAttribute("operatingSystems",operatingSystems);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		
		return "student-confirmation";
	}

}
