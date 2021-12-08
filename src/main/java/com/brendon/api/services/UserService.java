package com.brendon.api.services;

import java.util.List;

import com.brendon.api.domain.User;

public interface UserService {

	User findById(Integer id);
	List<User> findAll();
}
