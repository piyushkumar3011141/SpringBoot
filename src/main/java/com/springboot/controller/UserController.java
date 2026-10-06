package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;

@RestController
public class UserController {

	
	@GetMapping
	public User dummy() {
		System.out.println("UserController.dummy()");
		
		return new User(1 , "Rahul" , "Male", "Delhi");
	}
}
