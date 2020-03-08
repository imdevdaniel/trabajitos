package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.Department;
import com.platanito.trabajitos.models.repository.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	public DepartmentRepository repository;
	
	public List<Department> findAll() {
		return (List<Department>) repository.findAll();
	}
	
	public Department save(Department entity) {
		return repository.save(entity);
	}
	
	public Optional<Department> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Department entity) {
		repository.delete(entity);
	};

	public void deleteById(Long id) {
		repository.deleteById(id);
	};
}
