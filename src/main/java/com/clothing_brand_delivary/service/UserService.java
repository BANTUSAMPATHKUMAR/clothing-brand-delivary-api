package com.clothing_brand_delivary.service;

import java.util.UUID;

import com.clothing_brand_delivary.entity.User;

public interface UserService {

	public void CreateUsers(User users);

	public User FetchUsers(UUID id);

}
