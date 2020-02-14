package com.springmvcorm.user.services;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvcorm.user.dao.UserDao;
import com.springmvcorm.user.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Transactional
	public int save(User user) {
		return userDao.create(user);

	}

	/*
	 * public List<User> displayAllUser() { return userDao.getAllUser(); }
	 */

	// implemented collection method
	public List<User> displayAllUser() {
		List<User> users = userDao.getAllUser();
		Collections.sort(users);
		return users;
	}

}
