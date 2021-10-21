package com.example.singlepageApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

@SpringBootApplication
public class SinglepageAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SinglepageAppApplication.class, args);
	}

	
}
