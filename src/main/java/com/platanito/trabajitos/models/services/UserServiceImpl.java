package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.User;
import com.platanito.trabajitos.models.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository repository;
	
	public List<User> findAll() {
		return (List<User>) repository.findAll();
	}
	
	public User save(User entity) {
		return repository.save(entity);
	}
	
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(User entity) {
		repository.delete(entity);
	};

}
