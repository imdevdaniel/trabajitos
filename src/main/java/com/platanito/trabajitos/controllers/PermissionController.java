package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.PermissionService;
import com.platanito.trabajitos.models.entities.Permission;


@RestController
@RequestMapping("/api/v1/permissions")
public class PermissionController {

	@Autowired
	private PermissionService permissionService;

	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Permission> getList() {
		return (List<Permission>) permissionService.findAll() ;
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<Permission> findById(@PathVariable("id") Long id) {
		return permissionService.findById(id);
	}

	@RequestMapping(value="", method=RequestMethod.POST)
	public Permission save(@RequestBody Permission entity) {
		return permissionService.save(entity);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		permissionService.deleteById(id);
	}

}
