package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.RoleService;
import com.platanito.trabajitos.models.entities.Role;


@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Role> getList() {
		return (List<Role>) roleService.findAll() ;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Optional<Role> findById(@PathVariable("id") Long id) {
		return roleService.findById(id);
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public Role save(@RequestBody Role entity) {
		return roleService.save(entity);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		roleService.deleteById(id);
	}

}
