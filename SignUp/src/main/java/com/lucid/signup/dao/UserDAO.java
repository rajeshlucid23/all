package com.lucid.signup.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucid.signup.model.User;
public interface UserDAO extends JpaRepository<User, String> {

}
