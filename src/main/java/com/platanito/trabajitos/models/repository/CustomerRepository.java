package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
