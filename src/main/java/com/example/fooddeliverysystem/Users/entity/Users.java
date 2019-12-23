package com.example.fooddeliverysystem.Users.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Users {

	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	@Column
	private int mobileNo;
	@Column
	private String password;
	@Column
	private Roles roleId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Roles getRoleId() {
		return roleId;
	}
	public void setRoleId(Roles roleId) {
		this.roleId = roleId;
	}
}
