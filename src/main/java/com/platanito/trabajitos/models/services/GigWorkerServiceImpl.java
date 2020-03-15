package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.GigWorker;
import com.platanito.trabajitos.models.repository.GigWorkerRepository;


@Service
public class GigWorkerServiceImpl implements GigWorkerService {

	@Autowired
	public GigWorkerRepository repository;
	
	public List<GigWorker> findAll() {
		return (List<GigWorker>) repository.findAll();
	}
	
	public GigWorker save(GigWorker entity) {
		return repository.save(entity);
	}
	
	public Optional<GigWorker> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(GigWorker entity) {
		repository.delete(entity);
	};

	public void deleteById(Long id) {
		repository.deleteById(id);
	};
	
	@Override
	public List<GigWorker> findByPhone(String phoneNumber) {
		return (List<GigWorker>) repository.findByPhone(phoneNumber);
	}
}
