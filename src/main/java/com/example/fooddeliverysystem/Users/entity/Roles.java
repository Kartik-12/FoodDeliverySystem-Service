package com.example.fooddeliverysystem.Users.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Roles {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roleId;
	
	@Column
	private String roleType;
}
