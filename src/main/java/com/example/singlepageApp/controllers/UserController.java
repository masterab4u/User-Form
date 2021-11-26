package com.example.singlepageApp.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public ResponseEntity<List<User>> saveUser(@RequestBody User user) {
		userService.saveUser(user);
		List<User> users = userService.getAll();
		return new ResponseEntity<List<User>>(users, HttpStatus.CREATED);
	}
	
	
}