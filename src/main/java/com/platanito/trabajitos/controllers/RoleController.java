package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.RoleService;
import com.platanito.trabajitos.models.entities.Role;


@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
	
	@Autowired
	private RoleService RoleService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Role> getList() {
		return (List<Role>) RoleService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<Role> findById(Long id) {
		return RoleService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Role save(Role entity) {
		return RoleService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		RoleService.deleteById(id);
	}

}
