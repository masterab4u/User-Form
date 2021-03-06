package com.example.singlepageApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.singlepageApp.models.User;
import com.example.singlepageApp.repositories.UserRepository;



@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAll() {
		return (List<User>) userRepository.findAll();
	}
		
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
}