package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.Permission;
import java.util.List;
import java.util.Optional;


public interface PermissionService {

	public List<Permission> findAll();
	
	public Permission save(Permission entity);
	
	public Optional<Permission> findById(Long id);
	
	public void delete(Permission entity);
	
}
