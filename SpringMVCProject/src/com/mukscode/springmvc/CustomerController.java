package com.mukscode.springmvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//commenting this code because after using NotBlank annotation no need to explicitly trim the whitespaces
	//add an Init binder  to convert or trim input strings
	//remove leading and trailing whitespaces
	//resolve issue for our validation
	
	/*@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}*/
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {

		model.addAttribute("customer", new Customer());

		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult) {
		
		System.out.println(theCustomer.getFirstName()+" "+theCustomer.getLastName());
		
		System.out.println("Binding Result " +bindingResult);
		System.out.println("\n\n\n\n");
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}

	}

}
