package com.login_logout.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login_logout.model.User;

public interface UserRepository extends JpaRepository<User ,Long> {

}
