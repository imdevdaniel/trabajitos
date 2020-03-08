package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.User;
import java.util.List;
import java.util.Optional;


public interface UserService {

	public List<User> findAll();
	
	public User save(User entity);
	
	public Optional<User> findById(Long id);
	
	public void delete(User entity);

	public void deleteById(Long id);
	
}
