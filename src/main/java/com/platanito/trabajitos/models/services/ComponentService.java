package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.Component;
import java.util.List;
import java.util.Optional;


public interface ComponentService {

	public List<Component> findAll();
	
	public Component save(Component entity);
	
	public Optional<Component> findById(Long id);
	
	public void delete(Component entity);
	
	public void deleteById(Long id);
	
}
