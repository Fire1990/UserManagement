package com.web.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user_tab")
public class User {
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(generator="user_gen")
	@GenericGenerator(name="user_gen",strategy="increment")
	private Long userId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="CON_NAME")
	private String contNumber;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContNumber() {
		return contNumber;
	}
	public void setContNumber(String contNumber) {
		this.contNumber = contNumber;
	}
	public User(Long userId) {
		super();
		this.userId = userId;
	}
	public User() {
		super();
	}
	
	
	

}
