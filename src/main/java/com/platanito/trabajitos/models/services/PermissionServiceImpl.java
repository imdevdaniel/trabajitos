package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.Permission;
import com.platanito.trabajitos.models.repository.PermissionRepository;


@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	public PermissionRepository repository;
	
	public List<Permission> findAll() {
		return (List<Permission>) repository.findAll();
	}
	
	public Permission save(Permission entity) {
		return repository.save(entity);
	}
	
	public Optional<Permission> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Permission entity) {
		repository.delete(entity);
	};

	public void deleteById(Long id) {
		repository.deleteById(id);
	};
}
