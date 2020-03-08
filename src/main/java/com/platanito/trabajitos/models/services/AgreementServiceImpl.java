package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.Agreement;
import com.platanito.trabajitos.models.repository.AgreementRepository;


@Service
public class AgreementServiceImpl implements AgreementService {

	@Autowired
	public AgreementRepository repository;
	
	public List<Agreement> findAll() {
		return (List<Agreement>) repository.findAll();
	}
	
	public Agreement save(Agreement entity) {
		return repository.save(entity);
	}
	
	public Optional<Agreement> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Agreement entity) {
		repository.delete(entity);
	};
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	};

}
