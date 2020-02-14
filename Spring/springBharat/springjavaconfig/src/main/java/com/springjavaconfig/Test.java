package com.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		// JavaDao bean = context.getBean(JavaDao.class);
		// bean.create();

		JavaService servicebean = context.getBean(JavaService.class);
		servicebean.save();
		context.close();

	}
}
