package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.Customer;
import java.util.List;
import java.util.Optional;


public interface CustomerService {

	public List<Customer> findAll();
	
	public Customer save(Customer entity);
	
	public Optional<Customer> findById(Long id);
	
	public void delete(Customer entity);

	public void deleteById(Long id);
	
}
