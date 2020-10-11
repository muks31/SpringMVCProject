package com.mukscode.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Heyyyy")
public class WickedController {
	
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "wicked";
	}

}
