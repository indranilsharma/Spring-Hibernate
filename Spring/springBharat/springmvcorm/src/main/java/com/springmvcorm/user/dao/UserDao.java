package com.springmvcorm.user.dao;

import java.util.List;

import com.springmvcorm.user.model.User;

public interface UserDao {
	public int create(User user);

	public List<User> getAllUser();

}
