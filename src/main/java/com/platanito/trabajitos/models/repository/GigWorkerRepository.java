package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.GigWorker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GigWorkerRepository extends CrudRepository<GigWorker, Long> {

}
