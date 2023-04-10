package com.login_logout.service;

import com.login_logout.model.User;
import com.login_logout.web.dto.UserRegistationDto;

public interface UserService {
	User save(UserRegistationDto registationDto);

}
