package com.springmvcorm.user.services;

import java.util.List;

import com.springmvcorm.user.model.User;

public interface UserService {
	int save(User user);

	List<User> displayAllUser();
}
