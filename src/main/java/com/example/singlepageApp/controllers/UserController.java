package com.example.singlepageApp.controllers;


import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.validation.FieldError;

//import com.example.singlepageApp.SubmitFunction.SubmitFunction;
import com.example.singlepageApp.models.Department;
import com.example.singlepageApp.models.User;
import com.example.singlepageApp.services.DepartmentService;
import com.example.singlepageApp.services.UserService;


@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/getAll")
	
	public String getAll(Model model, User user) {
		List<User> users = userService.getAll();
		List<Department> dept = departmentService.getAll();
		model.addAttribute("users", users);
		model.addAttribute("department", dept);
		return "users";
	}
	
	@PostMapping("/save")
	@ResponseBody
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		userService.saveUser(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/users/getAll", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<User> addNew(User user) {
		userService.addNew(user);
		List<User> user1 = userService.getAll();
		return user1;
        
    }
	
}