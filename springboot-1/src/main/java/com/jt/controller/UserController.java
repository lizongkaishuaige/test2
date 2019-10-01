package com.jt.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "user")
@PropertySource("classpath:properties/user.properties")
public class UserController {
	
	private String username;
	private Integer age;
	
	@RequestMapping("/get")
	public String get() {
		System.out.println("UserController.get()");
		return username+"========================"+age;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
}
