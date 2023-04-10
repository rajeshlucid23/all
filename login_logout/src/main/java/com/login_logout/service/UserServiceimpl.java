package com.login_logout.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.login_logout.model.Role;
import com.login_logout.model.User;
import com.login_logout.repository.UserRepository;
import com.login_logout.web.dto.UserRegistationDto;

@Service 
public class UserServiceimpl implements UserService {
	
	 
	private UserRepository userRepository;
	public UserServiceimpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistationDto registationDto) {
		User user = new User(registationDto.getFirstname(),
				registationDto.getLastname(), registationDto.getEmail(),
				registationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}

}
