package com.ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomePgControl {
	@Autowired
	private Environment env;
	
	@GetMapping("/welcomepage")
	public String welcomePage() {
		return "Welcome to Sporty Shoes";
	}

}
