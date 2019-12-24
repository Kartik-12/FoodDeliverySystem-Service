package com.example.fooddeliverysystem.Users.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
@JsonIgnoreProperties(ignoreUnknown=true)
public class Roles {

	@Id
	private int roleId;
	
	@Column
	private String roleType;
}
