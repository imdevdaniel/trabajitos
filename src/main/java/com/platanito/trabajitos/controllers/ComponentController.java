package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.ComponentService;
import com.platanito.trabajitos.models.entities.Component;


@RestController
@RequestMapping("/api/v1/component")
public class ComponentController {
	
	@Autowired
	private ComponentService componentService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Component> getList() {
		return (List<Component>) componentService.findAll() ;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<Component> findById(@PathVariable("id") Long id) {
		return componentService.findById(id);
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public Component save(@RequestBody Component entity) {
		return componentService.save(entity);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		componentService.deleteById(id);
	}

}
