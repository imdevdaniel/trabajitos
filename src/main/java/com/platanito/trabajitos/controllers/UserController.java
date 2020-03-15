package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.UserService;
import com.platanito.trabajitos.models.entities.User;


@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<User> getList() {
		return (List<User>) userService.findAll() ;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<User> findById(@PathVariable("id") Long id) {
		return userService.findById(id);
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public User save(@RequestBody User entity) {
		return userService.save(entity);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		userService.deleteById(id);
	}

}
