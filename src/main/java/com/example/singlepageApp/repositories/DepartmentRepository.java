package com.example.singlepageApp.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.singlepageApp.models.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
	
	List<Department> findAll();

}
