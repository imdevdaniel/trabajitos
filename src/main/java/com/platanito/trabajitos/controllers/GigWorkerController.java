package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.GigWorkerService;
import com.platanito.trabajitos.models.entities.GigWorker;


@RestController
@RequestMapping("/api/v1/gig-worker")
public class GigWorkerController {
	
	@Autowired
	private GigWorkerService GigWorkerService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<GigWorker> getList() {
		return (List<GigWorker>) GigWorkerService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<GigWorker> findById(Long id) {
		return GigWorkerService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public GigWorker save(GigWorker entity) {
		return GigWorkerService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		GigWorkerService.deleteById(id);
	}

}
