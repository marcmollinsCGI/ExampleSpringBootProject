package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping
	public List getUsers() {
		
		return userService.getAllUsers();

	}

	@GetMapping(path = "/{userID}") // Path parameter
	public User getUser(@PathVariable int userID) {

		return userService.getUserByID(userID);

	}

	@GetMapping(path = "/username") // Path parameter
	public User getUserByName(@RequestParam(value = "name") String name) {

		return userService.getUserByName(name);

	}

	@GetMapping(path = "/search") // Path parameter
	public User getUserByName(@RequestParam(value = "user") User user) {

		return userService.Search(user);

	}

	
	
}
