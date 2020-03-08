package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.Complaint;
import com.platanito.trabajitos.models.repository.ComplaintRepository;


@Service
public class ComplaintServiceImpl implements ComplaintService {

	@Autowired
	public ComplaintRepository repository;
	
	public List<Complaint> findAll() {
		return (List<Complaint>) repository.findAll();
	}
	
	public Complaint save(Complaint entity) {
		return repository.save(entity);
	}
	
	public Optional<Complaint> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Complaint entity) {
		repository.delete(entity);
	};
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	};

}
