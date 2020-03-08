package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.GigWorkerJobCategory;
import java.util.List;
import java.util.Optional;


public interface GigWorkerJobCategoryService {

	public List<GigWorkerJobCategory> findAll();
	
	public GigWorkerJobCategory save(GigWorkerJobCategory entity);
	
	public Optional<GigWorkerJobCategory> findById(Long id);
	
	public void delete(GigWorkerJobCategory entity);

	public void deleteById(Long id);
	
}
