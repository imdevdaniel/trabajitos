package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.GigWorkerJobCategory;
import com.platanito.trabajitos.models.repository.GigWorkerJobCategoryRepository;


@Service
public class GigWorkerJobCategoryServiceImpl implements GigWorkerJobCategoryService {

	@Autowired
	public GigWorkerJobCategoryRepository repository;
	
	public List<GigWorkerJobCategory> findAll() {
		return (List<GigWorkerJobCategory>) repository.findAll();
	}
	
	public GigWorkerJobCategory save(GigWorkerJobCategory entity) {
		return repository.save(entity);
	}
	
	public Optional<GigWorkerJobCategory> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(GigWorkerJobCategory entity) {
		repository.delete(entity);
	};

	public void deleteById(Long id) {
		repository.deleteById(id);
	};
}
