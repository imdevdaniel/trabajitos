package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.DocumentService;
import com.platanito.trabajitos.models.entities.Document;


@RestController
@RequestMapping("/api/v1/document")
public class DocumentController {
	
	@Autowired
	private DocumentService documentService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Document> getList() {
		return (List<Document>) documentService.findAll() ;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Optional<Document> findById(@PathVariable("id") Long id) {
		return documentService.findById(id);
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public Document save(@RequestBody Document entity) {
		return documentService.save(entity);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		documentService.deleteById(id);
	}

}
