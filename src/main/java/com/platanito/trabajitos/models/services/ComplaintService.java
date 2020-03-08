package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.Complaint;
import java.util.List;
import java.util.Optional;


public interface ComplaintService {

	public List<Complaint> findAll();
	
	public Complaint save(Complaint entity);
	
	public Optional<Complaint> findById(Long id);
	
	public void delete(Complaint entity);
	
	public void deleteById(Long id);
	
}
