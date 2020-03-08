package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.GigWorkerPhoneService;
import com.platanito.trabajitos.models.entities.GigWorkerPhone;


@RestController
@RequestMapping("/api/v1/gig-worker-phone")
public class GigWorkerPhoneController {
	
	@Autowired
	private GigWorkerPhoneService GigWorkerPhoneService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<GigWorkerPhone> getList() {
		return (List<GigWorkerPhone>) GigWorkerPhoneService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<GigWorkerPhone> findById(Long id) {
		return GigWorkerPhoneService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public GigWorkerPhone save(GigWorkerPhone entity) {
		return GigWorkerPhoneService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		GigWorkerPhoneService.deleteById(id);
	}

}
