package com.brendon.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brendon.api.domain.User;
import com.brendon.api.domain.dto.UserDTO;
import com.brendon.api.repositories.UserRepository;
import com.brendon.api.services.UserService;
import com.brendon.api.services.exceptions.ObjectNotFoundException;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User create(UserDTO obj) {
		return repository.save(mapper.map(obj, User.class));
	}

}
