package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.AgreementService;
import com.platanito.trabajitos.models.entities.Agreement;


@RestController
@RequestMapping("/api/v1/agreement")
public class AgreementController {
	
	@Autowired
	private AgreementService agreementService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Agreement> getList() {
		return (List<Agreement>) agreementService.findAll() ;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Optional<Agreement> findById(@PathVariable("id") Long id) {
		return agreementService.findById(id);
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public Agreement save(@RequestBody Agreement entity) {
		return agreementService.save(entity);
	}
	
	@RequestMapping(value="id", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		agreementService.deleteById(id);
	}

}
