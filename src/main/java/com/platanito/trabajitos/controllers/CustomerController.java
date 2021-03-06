package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.CustomerService;
import com.platanito.trabajitos.models.entities.Customer;


@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Customer> getList() {
		return (List<Customer>) customerService.findAll() ;
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<Customer> findById(@PathVariable("id") Long id) {
		return customerService.findById(id);
	}

	@RequestMapping(value="", method=RequestMethod.POST)
	public Customer save(@RequestBody Customer entity) {
		return customerService.save(entity);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		customerService.deleteById(id);
	}

}