package com.example.fooddeliverysystem.Users.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.example.fooddeliverysystem.Users.entity.Users;

@Repository
public interface UserDao extends JpaRepository<Users, Integer> {
	
@Query("from Users u  where mobileNo=?1")
Users getuserbyId(String mobileNo);
}	
