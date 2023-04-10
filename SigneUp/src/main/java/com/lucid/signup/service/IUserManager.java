package com.lucid.signup.service;

import com.lucid.signup.model.User;

public interface IUserManager {
	public boolean signUp(User user);
	public boolean deleteUser(String emailId);
	public boolean editUser(User user);
	public boolean userExist(String emailId);

}
