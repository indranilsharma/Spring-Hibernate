package com.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JavaDaoConfig.class)
public class JavaConfig {

	@Bean(initMethod="init",destroyMethod ="destroy")
	public JavaService save() {
		return new JavaService();
	}

}
