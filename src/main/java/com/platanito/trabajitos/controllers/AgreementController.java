package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.AgreementService;
import com.platanito.trabajitos.models.entities.Agreement;


@RestController
@RequestMapping("/api/v1/agreement")
public class AgreementController {
	
	@Autowired
	private AgreementService AgreementService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Agreement> getList() {
		return (List<Agreement>) AgreementService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<Agreement> findById(Long id) {
		return AgreementService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Agreement save(Agreement entity) {
		return AgreementService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		AgreementService.deleteById(id);
	}

}
