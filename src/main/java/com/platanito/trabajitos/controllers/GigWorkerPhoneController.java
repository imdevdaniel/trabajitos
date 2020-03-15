package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.GigWorkerPhoneService;
import com.platanito.trabajitos.models.entities.GigWorkerPhone;


@RestController
@RequestMapping("/api/v1/gig-worker-phone")
public class GigWorkerPhoneController {
	
	@Autowired
	private GigWorkerPhoneService gigWorkerPhoneService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<GigWorkerPhone> getList() {
		return (List<GigWorkerPhone>) gigWorkerPhoneService.findAll() ;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Optional<GigWorkerPhone> findById(@PathVariable("id") Long id) {
		return gigWorkerPhoneService.findById(id);
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public GigWorkerPhone save(@RequestBody GigWorkerPhone entity) {
		return gigWorkerPhoneService.save(entity);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		gigWorkerPhoneService.deleteById(id);
	}

}
