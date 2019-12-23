package com.example.fooddeliverysystem.Users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fooddeliverysystem.Users.entity.Users;
import com.example.fooddeliverysystem.Users.service.UserService;

@RestController
@RequestMapping(value="/")
public class UserController {

	
	@Autowired
	UserService userService;
	
	@PostMapping(value="/adduser")
	public String addUser(@RequestBody Users user)
	{
		return userService.adduser(user);
	}
}
