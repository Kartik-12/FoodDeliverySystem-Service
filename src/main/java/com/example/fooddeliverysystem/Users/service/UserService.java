package com.example.fooddeliverysystem.Users.service;

import org.springframework.stereotype.Service;

import com.example.fooddeliverysystem.Users.entity.Users;
@Service
public interface UserService {

	String adduser(Users user);
}
