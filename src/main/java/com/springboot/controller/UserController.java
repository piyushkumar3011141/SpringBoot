package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@GetMapping
	public String dummy() {
		System.out.println("UserController.dummy()");
		return"This is my first project on Spring Boot";
	}
}
