package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.Agreement;
import java.util.List;
import java.util.Optional;


public interface AgreementService {

	public List<Agreement> findAll();
	
	public Agreement save(Agreement entity);
	
	public Optional<Agreement> findById(Long id);
	
	public void delete(Agreement entity);

	public void deleteById(Long id);
	
}
