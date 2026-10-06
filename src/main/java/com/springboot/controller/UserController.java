package com.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {

	@GetMapping
	public String greet() {
		System.out.println("UserController.greet()");
		return "Home";
	}
	
}
