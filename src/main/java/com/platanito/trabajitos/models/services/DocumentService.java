package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.Document;
import java.util.List;
import java.util.Optional;


public interface DocumentService {

	public List<Document> findAll();
	
	public Document save(Document entity);
	
	public Optional<Document> findById(Long id);
	
	public void delete(Document entity);

	public void deleteById(Long id);
	
}
