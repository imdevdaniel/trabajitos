package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.JobCategory;
import java.util.List;
import java.util.Optional;


public interface JobCategoryService {

	public List<JobCategory> findAll();
	
	public JobCategory save(JobCategory entity);
	
	public Optional<JobCategory> findById(Long id);
	
	public void delete(JobCategory entity);

	public void deleteById(Long id);
	
}
