package com.login_logout.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login_logout.service.UserService;
import com.login_logout.web.dto.UserRegistationDto;

@Controller
@RequestMapping("/registration")
public  class UserRegistationController {
	
	private UserService userService;

	public UserRegistationController(UserService userService) {
		super();
		this.userService = userService;
	}
	@ModelAttribute("user")
	public  UserRegistationDto userRegistationDto() {
		return new UserRegistationDto();
	}
	@GetMapping
	public String showRegistationForm() {
		return "registration";
	}
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistationDto regUserRegistationDto) {
		userService.save(regUserRegistationDto);
		return "redirect:/registation?succecc";
		
	}
	
	
}
