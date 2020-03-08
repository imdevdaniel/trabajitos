package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.Component;
import com.platanito.trabajitos.models.repository.ComponentRepository;


@Service
public class ComponentServiceImpl implements ComponentService {

	@Autowired
	public ComponentRepository repository;
	
	public List<Component> findAll() {
		return (List<Component>) repository.findAll();
	}
	
	public Component save(Component entity) {
		return repository.save(entity);
	}
	
	public Optional<Component> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Component entity) {
		repository.delete(entity);
	};

	public void deleteById(Long id) {
		repository.deleteById(id);
	};
}
