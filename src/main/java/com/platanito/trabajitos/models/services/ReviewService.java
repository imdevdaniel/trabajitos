package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.Review;
import java.util.List;
import java.util.Optional;


public interface ReviewService {

	public List<Review> findAll();
	
	public Review save(Review entity);
	
	public Optional<Review> findById(Long id);
	
	public void delete(Review entity);
	
}
