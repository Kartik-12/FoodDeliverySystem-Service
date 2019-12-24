package com.example.fooddeliverysystem.Users.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fooddeliverysystem.EncryptDecrypt;
import com.example.fooddeliverysystem.Users.entity.Users;
import com.example.fooddeliverysystem.Users.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserController {

	
	@Autowired
	UserService userService;
	EncryptDecrypt ec=new EncryptDecrypt();
	
	@PostMapping(value="/adduser")
	public String addUser(@RequestBody Users user) throws UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException
	{
		user.setPassword(ec.encrypt(user.getPassword()));
			
		return userService.adduser(user);
	}
	
	@GetMapping(value="/getallusers")
	public List<Users> getallusers()
	{
		return userService.getallusers();
	}
	
}
