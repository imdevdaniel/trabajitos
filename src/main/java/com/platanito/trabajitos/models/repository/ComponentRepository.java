package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.Component;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComponentRepository extends CrudRepository<Component, Long>{

}
