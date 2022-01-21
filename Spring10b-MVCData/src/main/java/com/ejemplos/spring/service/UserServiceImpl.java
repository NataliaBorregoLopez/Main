package com.ejemplos.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.User;
import com.ejemplos.spring.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDAO;
	
	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	public Optional<User> findById(int id) {
		return userDAO.findById(id);
	}

	@Override
	public void save(User user) {
		userDAO.save(user);
	}

	@Override
	public void deleteById(int id) {
		userDAO.deleteById(id);
		
	}

	@Override
	public List<User> findByUsername(String username) {
		return userDAO.findByUsername(username);
	}

	
	
}
