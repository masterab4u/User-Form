package com.example.singlepageApp.services;

import java.util.List;

//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.singlepageApp.models.User;
import com.example.singlepageApp.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
		 }

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}