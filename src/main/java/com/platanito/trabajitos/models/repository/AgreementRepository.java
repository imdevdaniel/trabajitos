package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.Agreement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AgreementRepository extends CrudRepository<Agreement, Long> {
	
}
