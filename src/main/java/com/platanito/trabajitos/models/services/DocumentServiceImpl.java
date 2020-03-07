package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.Document;
import com.platanito.trabajitos.models.repository.DocumentRepository;


@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	public DocumentRepository repository;
	
	public List<Document> findAll() {
		return (List<Document>) repository.findAll();
	}
	
	public Document save(Document entity) {
		return repository.save(entity);
	}
	
	public Optional<Document> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Document entity) {
		repository.delete(entity);
	};

}
