package com.example.singlepageApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.singlepageApp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findAll();

}
