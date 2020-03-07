package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.GigWorkerPhone;
import com.platanito.trabajitos.models.repository.GigWorkerPhoneRepository;


@Service
public class GigWorkerPhoneServieImpl implements GigWorkerPhoneService {

	@Autowired
	public GigWorkerPhoneRepository repository;
	
	public List<GigWorkerPhone> findAll() {
		return (List<GigWorkerPhone>) repository.findAll();
	}
	
	public GigWorkerPhone save(GigWorkerPhone entity) {
		return repository.save(entity);
	}
	
	public Optional<GigWorkerPhone> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(GigWorkerPhone entity) {
		repository.delete(entity);
	};

}
