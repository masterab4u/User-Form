package com.example.singlepageApp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name="department")
@Getter
@Setter
public class Department {
	@Id
	@NotBlank
	private String dept;
	
	public Department() {
		
	}
	
	public Department(String dept) {
		super();
		this.dept = dept;
		
	}
	
	public String getDepartment() {
		return dept;
	}

	public void setDepartment(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Department [department=" + dept + "]";
	}
	//"Department [department=" + department + "]"
}
