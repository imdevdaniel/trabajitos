package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.UserService;
import com.platanito.trabajitos.models.entities.User;


@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	private UserService UserService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<User> getList() {
		return (List<User>) UserService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<User> findById(Long id) {
		return UserService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public User save(User entity) {
		return UserService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		UserService.deleteById(id);
	}

}
