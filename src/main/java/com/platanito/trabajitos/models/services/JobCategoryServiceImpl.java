package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.JobCategory;
import com.platanito.trabajitos.models.repository.JobCategoryRepository;


@Service
public class JobCategoryServiceImpl implements JobCategoryService {

	@Autowired
	public JobCategoryRepository repository;
	
	public List<JobCategory> findAll() {
		return (List<JobCategory>) repository.findAll();
	}
	
	public JobCategory save(JobCategory entity) {
		return repository.save(entity);
	}
	
	public Optional<JobCategory> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(JobCategory entity) {
		repository.delete(entity);
	};

}
