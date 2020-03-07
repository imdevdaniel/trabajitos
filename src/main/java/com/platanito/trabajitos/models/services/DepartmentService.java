package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.Department;
import java.util.List;
import java.util.Optional;


public interface DepartmentService {

	public List<Department> findAll();
	
	public Department save(Department entity);
	
	public Optional<Department> findById(Long id);
	
	public void delete(Department entity);
	
}
