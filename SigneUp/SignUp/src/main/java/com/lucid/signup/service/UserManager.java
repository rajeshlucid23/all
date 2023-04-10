package com.lucid.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucid.signup.dao.UserDAO;
import com.lucid.signup.model.User;
@Service
public class UserManager implements IUserManager {
@Autowired
private UserDAO userDao;
	@Override
	public boolean signUp(User user) {
		user=userDao.save(user);
		return true;
	}

	@Override
	public boolean deleteUser(String emailId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean userExist(String emailId) {
		// TODO Auto-generated method stub
		return userDao.existsById(emailId);
	}

}
