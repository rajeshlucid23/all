package com.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.entity.User;

import ch.qos.logback.core.model.Model;

@Controller
public class UserController {
	
	
	@GetMapping("/")
	public String login(Model model) {
		User user=new User(); 
		
		return "login";
		
	}
}
