package com.example.singlepageApp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.singlepageApp.models.Department;
import com.example.singlepageApp.repositories.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getAll(){
		return (List<Department>) departmentRepository.findAll();
	}

}
