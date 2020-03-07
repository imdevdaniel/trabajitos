package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.GigWorkerJobCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GigWorkerJobCategoryRepository extends CrudRepository<GigWorkerJobCategory, Long> {

}
