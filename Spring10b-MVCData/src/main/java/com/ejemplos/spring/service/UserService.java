package com.ejemplos.spring.service;

import java.util.List;
import java.util.Optional;

import com.ejemplos.spring.model.User;

public interface UserService {

	public List<User> findAll();
	
	public Optional<User> findById(int id);
	
	public void save(User user);
	
	public void deleteById(int id);
	
	public List<User> findByUsername(String username);
}
