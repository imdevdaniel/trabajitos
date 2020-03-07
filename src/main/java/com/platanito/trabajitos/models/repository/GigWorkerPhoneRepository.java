package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.GigWorkerPhone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GigWorkerPhoneRepository extends CrudRepository<GigWorkerPhone, Long> {

}
