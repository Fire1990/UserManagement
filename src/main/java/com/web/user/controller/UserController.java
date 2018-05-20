package com.web.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.user.dto.UserDetails;
import com.web.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/reg")
	public String saveUser(@RequestBody UserDetails userDto) {
		return service.saveUser(userDto);
	}
	
	
	

}
