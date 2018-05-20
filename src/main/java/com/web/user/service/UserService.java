package com.web.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.user.dto.UserDetails;
import com.web.user.model.User;
import com.web.user.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public String saveUser(UserDetails userDto) {
		User user=new User();
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setPassword(userDto.getPassword());
		user.setContNumber(userDto.getContNumber());
		userRepository.save(user);
		return "user saved successfully";
	}
	
	

}
