package com.clothing_brand_delivary.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clothing_brand_delivary.entity.User;
import com.clothing_brand_delivary.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

	@PostMapping("/Create")
	public void CreateUsers(@RequestBody User users) {
		userServiceImpl.CreateUsers(users);
	}

	@GetMapping("/Fetch/{id}")
	public User FetchUsers(@PathVariable UUID id) {
		return userServiceImpl.FetchUsers(id);
	}
}
