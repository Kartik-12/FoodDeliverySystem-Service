package com.example.fooddeliverysystem.Users.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.example.fooddeliverysystem.Users.entity.Users;

public interface UserService {

	String adduser(Users user);
	List<Users> getallusers();
	Users getuserbyId(String mobileNo);
}
