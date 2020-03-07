package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.Complaint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComplaintRepository extends CrudRepository<Complaint, Long> {

}
