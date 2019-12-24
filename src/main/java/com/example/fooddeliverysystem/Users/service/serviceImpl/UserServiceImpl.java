package com.example.fooddeliverysystem.Users.service.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fooddeliverysystem.Users.dao.UserDao;
import com.example.fooddeliverysystem.Users.entity.Users;
import com.example.fooddeliverysystem.Users.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserDao userDao;

	@Override
	public String adduser(Users user) {
		userDao.save(user);
		return "User added Successfully";
	}

	@Override
	public List<Users> getallusers() {
		return userDao.findAll();
	}

}
