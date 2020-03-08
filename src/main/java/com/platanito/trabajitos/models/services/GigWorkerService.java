package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.GigWorker;
import java.util.List;
import java.util.Optional;


public interface GigWorkerService {

	public List<GigWorker> findAll();
	
	public GigWorker save(GigWorker entity);
	
	public Optional<GigWorker> findById(Long id);
	
	public void delete(GigWorker entity);

	public void deleteById(Long id);
	
}
