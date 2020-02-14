package com.springjavaconfig;

import org.springframework.context.annotation.Bean;

public class JavaDaoConfig {
	@Bean
	public JavaDao returnBean() {
		return new JavaDao();

	}
}
