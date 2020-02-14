package com.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcorm.user.model.User;
import com.springmvcorm.user.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping("/registration")
	public String showRegistrationPage() {
		return "userForm";
	}

	@RequestMapping("registarUser")
	public String registerUser(@ModelAttribute("user") User user, ModelMap map) {
		// map.addAttribute("user", user);

		int result = service.save(user);
		map.addAttribute("result", "Successfuly user created :" + result);
		return "succes";
	}

	@RequestMapping("/displayalluser")
	public String displayAllUser(ModelMap model) {
		List<User> users = service.displayAllUser();
		model.addAttribute("users", users);
		return "displayUser";
	}

}
