package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.GigWorkerPhone;
import java.util.List;
import java.util.Optional;


public interface GigWorkerPhoneService {

	public List<GigWorkerPhone> findAll();
	
	public GigWorkerPhone save(GigWorkerPhone entity);
	
	public Optional<GigWorkerPhone> findById(Long id);
	
	public void delete(GigWorkerPhone entity);
	
}
