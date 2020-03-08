package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.DocumentService;
import com.platanito.trabajitos.models.entities.Document;


@RestController
@RequestMapping("/api/v1/document")
public class DocumentController {
	
	@Autowired
	private DocumentService DocumentService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Document> getList() {
		return (List<Document>) DocumentService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<Document> findById(Long id) {
		return DocumentService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Document save(Document entity) {
		return DocumentService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		DocumentService.deleteById(id);
	}

}
