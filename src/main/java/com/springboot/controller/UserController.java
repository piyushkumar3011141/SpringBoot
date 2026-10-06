package com.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.UserRepository;
import com.springboot.entity.User;

@RestController
public class UserController {
	
	
	@Autowired
	private UserRepository userRepository;

	

	@GetMapping
	public User greet() {
		System.out.println("UserController.greet : ");
		return new User(99, "Dummy", "No", "Planet Not Found");

	}

	@GetMapping("/{id}")
	public Optional<User> pathVariablle(@PathVariable(name = "id") int id) {
		System.out.println("UserController.pathVariablle : " + id);
		return userRepository.findById(id);
	}

	@GetMapping("/all-users")
	public List<User> getAllUsers() {
		System.out.println("UserController.getAllUsers()");
		return userRepository.findAll();
	}

	@PostMapping
	public User saveUser(@RequestBody User user) {
		System.out.println("UserController.saveUser : ");
		System.out.println(user);
		userRepository.save(user);
		return user;
	}

	
}
