package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.Customer;
import com.platanito.trabajitos.models.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	public CustomerRepository repository;
	
	public List<Customer> findAll() {
		return (List<Customer>) repository.findAll();
	}
	
	public Customer save(Customer entity) {
		return repository.save(entity);
	}
	
	public Optional<Customer> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Customer entity) {
		repository.delete(entity);
	};

}
