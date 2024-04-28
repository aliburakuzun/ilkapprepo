package com.example.ilkapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "Spring boota hosgeldiniz";
		
	}

}
