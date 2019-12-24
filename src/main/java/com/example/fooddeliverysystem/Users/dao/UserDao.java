package com.example.fooddeliverysystem.Users.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fooddeliverysystem.Users.entity.Users;

@Repository
public interface UserDao extends JpaRepository<Users, Integer> {
	

}
