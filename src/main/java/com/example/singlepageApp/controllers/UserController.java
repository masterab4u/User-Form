package com.example.singlepageApp.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.example.singlepageApp.services.UserService;
import com.example.singlepageApp.models.User;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	List<String> department; 
	
	@ModelAttribute
	 public void preLoad() {
	  department = new ArrayList<String>();
	  department.add("CSE");
	  department.add("CSE(AI+ML)");
	  department.add("CSE(IOT)");
	  department.add("IT");
	  department.add("ECE");
	  department.add("EE");
	  department.add("CIVIL");
	  department.add("MECH");
	 }

	
	@RequestMapping("/getAll")
	public String getAll(Model model, User user) {
		List<User> users = userService.getAll();
		model.addAttribute("users", users);
		model.addAttribute("department", department);
		
		//String username = "Avinash";
		//model.addAttribute("username", username);
		
		return "users";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	 public String register(@ModelAttribute("user") User user, Model model) {
	  System.out.println("get users:::"+user.getUser());
	  UserService service = null;
	service.save(user);
	  return "welcome";
	 }
	
	

}
