package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.ComponentService;
import com.platanito.trabajitos.models.entities.Component;


@RestController
@RequestMapping("/api/v1/component")
public class PermissionController {
	
	@Autowired
	private ComponentService componentService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Component> getList() {
		return (List<Component>) componentService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<Component> findById(Long id) {
		return componentService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Component save(Component entity) {
		return componentService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		componentService.deleteById(id);
	}

}
