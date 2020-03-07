package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.JobCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobCategoryRepository extends CrudRepository<JobCategory, Long> {

}
