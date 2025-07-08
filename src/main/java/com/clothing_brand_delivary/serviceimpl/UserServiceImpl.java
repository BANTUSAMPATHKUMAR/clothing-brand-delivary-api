package com.clothing_brand_delivary.serviceimpl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothing_brand_delivary.entity.User;
import com.clothing_brand_delivary.repository.UserRepository;
import com.clothing_brand_delivary.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public void CreateUsers(User users) {
		userRepository.save(users);

	}

	@Override
	public User FetchUsers(UUID id) {
		User users = null;
		Optional<User> optionalUsers = userRepository.findById(id);
		if (optionalUsers.isPresent()) {
			users = optionalUsers.get();
		}
		return users;
	}

}
