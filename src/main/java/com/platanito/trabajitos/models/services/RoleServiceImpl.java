package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.Role;
import com.platanito.trabajitos.models.repository.RoleRepository;


@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	public RoleRepository repository;
	
	public List<Role> findAll() {
		return (List<Role>) repository.findAll();
	}
	
	public Role save(Role entity) {
		return repository.save(entity);
	}
	
	public Optional<Role> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Role entity) {
		repository.delete(entity);
	};

	public void deleteById(Long id) {
		repository.deleteById(id);
	};
}
