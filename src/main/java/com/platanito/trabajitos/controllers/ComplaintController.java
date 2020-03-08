package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.ComplaintService;
import com.platanito.trabajitos.models.entities.Complaint;


@RestController
@RequestMapping("/api/v1/complaint")
public class ComplaintController {
	
	@Autowired
	private ComplaintService ComplaintService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Complaint> getList() {
		return (List<Complaint>) ComplaintService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<Complaint> findById(Long id) {
		return ComplaintService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Complaint save(Complaint entity) {
		return ComplaintService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		ComplaintService.deleteById(id);
	}

}
