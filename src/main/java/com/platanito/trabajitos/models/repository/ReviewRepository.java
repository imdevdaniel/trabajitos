package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

}
