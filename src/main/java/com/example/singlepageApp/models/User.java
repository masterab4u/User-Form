package com.example.singlepageApp.models;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//import org.hibernate.validator.constraints.NotBlank;

//import net.bytebuddy.implementation.bind.annotation.Empty;

@Entity
@Table(name = "user")
@Setter
@Getter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@Size(min = 3, max = 30)
	@Column(name = "name")
	private String name;
	@javax.validation.constraints.NotBlank
	@Column(name = "sex")
	private String sex;
	@javax.validation.constraints.NotBlank
	@Column(name = "email")
	@Email(message = "Please enter a valid e-mail address")
	private String email;
	@NotNull
	@Column(name = "phone")
	private String phone;
	@Size(max = 100)
	@Column(name = "address")
	private String address;
	@javax.validation.constraints.NotBlank
	@Column(name = "department")
	private String department;
	
	public User() {
		
	}
	
	public User(Integer Id, String name, String sex, String email, String phone, String address, String department) {
		super();
		this.Id = Id;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.department = department;
	}

	public Integer getId() {
		return Id;
	}

	public void setid(Integer Id) {
		this.Id = Id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", sex=" + sex + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", department=" + department + "]";
	}

	public String getUser() {
		// TODO Auto-generated method stub
		return null;
	}


}
