package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.ComplaintService;
import com.platanito.trabajitos.models.entities.Complaint;


@RestController
@RequestMapping("/api/v1/complaint")
public class ComplaintController {
	
	@Autowired
	private ComplaintService complaintService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Complaint> getList() {
		return (List<Complaint>) complaintService.findAll() ;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Optional<Complaint> findById(@PathVariable("id") Long id) {
		return complaintService.findById(id);
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public Complaint save(@RequestBody Complaint entity) {
		return complaintService.save(entity);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		complaintService.deleteById(id);
	}

}
