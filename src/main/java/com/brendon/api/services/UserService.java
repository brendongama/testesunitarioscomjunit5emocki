package com.brendon.api.services;

import java.util.List;

import com.brendon.api.domain.User;
import com.brendon.api.domain.dto.UserDTO;

public interface UserService {

	User findById(Integer id);
	List<User> findAll();
	User create(UserDTO obj);
	User update(UserDTO obj);
}
