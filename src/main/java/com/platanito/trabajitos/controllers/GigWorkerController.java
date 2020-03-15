package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.GigWorkerService;
import com.platanito.trabajitos.models.entities.GigWorker;


@RestController
@RequestMapping("/api/v1/gig-worker")
public class GigWorkerController {
	
	@Autowired
	private GigWorkerService gigWorkerService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<GigWorker> getList() {
		return (List<GigWorker>) gigWorkerService.findAll() ;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Optional<GigWorker> findById(@PathVariable("id") Long id) {
		return gigWorkerService.findById(id);
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public GigWorker save(@RequestBody GigWorker entity) {
		return gigWorkerService.save(entity);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		gigWorkerService.deleteById(id);
	}

}
