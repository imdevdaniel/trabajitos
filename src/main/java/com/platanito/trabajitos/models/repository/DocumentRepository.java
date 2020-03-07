package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.Document;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {

}
