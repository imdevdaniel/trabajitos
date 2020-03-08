package com.platanito.trabajitos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.ComponentService;
import com.platanito.trabajitos.models.entities.Component;


@RestController
@RequestMapping("/components")
public class ComponentController {
	
	@Autowired
	private ComponentService componentService;
	
	@RequestMapping(value="/components-list", method=RequestMethod.GET)
	public List<Component> getList() {
		return (List<Component>) componentService.findAll() ;
	}

}
