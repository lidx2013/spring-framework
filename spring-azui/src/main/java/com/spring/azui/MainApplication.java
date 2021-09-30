package com.spring.azui;

import com.spring.azui.config.Config;
import com.spring.azui.core.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
		UserService userService = (UserService) context.getBean("userService");
		userService.test();

	}
}
