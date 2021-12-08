package com.brendon.api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.brendon.api.domain.User;
import com.brendon.api.repositories.UserRepository;

@Configuration
@Profile("local")
public class LocalConfig {

	@Autowired
	private UserRepository repository;
	
	@Bean
	public void startDB() {
		User u1 = new User(null, "Brendon", "brendon@mail.com", "123");
		User u2 = new User(null, "Tania", "tania@mail.com", "123");
		User u3 = new User(null, "Roberto", "roberto@mail.com", "123");
		
		repository.saveAll(List.of(u1, u2, u3));
	}
}
