package com.user.user_microservice.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
 
import com.user.user_microservice.models.User;

import com.user.user_microservice.service.UserService;
 
@RestController

@RequestMapping("/users")

public class UserController {

	@Autowired

	private UserService userService;

	@GetMapping

	public List<User> getAllUsers(){

		return userService.getAllUsers();

	}

	@GetMapping("/{id}")

	public User getUserById(@PathVariable Long id) {

		return userService.getUserById(id);

	}

	@PostMapping

	public User createUser(@RequestBody User user) {

		return userService.createUser(user);

	}

	@PutMapping("/{id}")

	public User updateUser(@PathVariable Long id,@RequestBody User user) {

		return userService.updateUser(id, user);

	}

	@DeleteMapping("/{id}")

	public void deleteUser(@PathVariable Long id) {

		userService.deleteUser(id);

	}
 
 
}

 