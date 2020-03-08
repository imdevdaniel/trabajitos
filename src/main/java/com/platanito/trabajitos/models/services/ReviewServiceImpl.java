package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.Review;
import com.platanito.trabajitos.models.repository.ReviewRepository;


@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	public ReviewRepository repository;
	
	public List<Review> findAll() {
		return (List<Review>) repository.findAll();
	}
	
	public Review save(Review entity) {
		return repository.save(entity);
	}
	
	public Optional<Review> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Review entity) {
		repository.delete(entity);
	};

	public void deleteById(Long id) {
		repository.deleteById(id);
	};
}
