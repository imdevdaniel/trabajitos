package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.Role;
import java.util.List;
import java.util.Optional;


public interface RoleService {

	public List<Role> findAll();
	
	public Role save(Role entity);
	
	public Optional<Role> findById(Long id);
	
	public void delete(Role entity);

	public void deleteById(Long id);
	
}
