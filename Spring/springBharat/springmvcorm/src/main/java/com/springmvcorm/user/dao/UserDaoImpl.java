package com.springmvcorm.user.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvcorm.user.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public int create(User user) {
		Integer result = (Integer) hibernateTemplate.save("user", user);
		return result;
	}

	public List<User> getAllUser() {
		return hibernateTemplate.loadAll(User.class);
	}
}