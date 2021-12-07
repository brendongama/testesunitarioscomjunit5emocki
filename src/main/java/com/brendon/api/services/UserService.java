package com.brendon.api.services;

import com.brendon.api.domain.User;

public interface UserService {

	User findById(Integer id);
}
