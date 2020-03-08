package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.ReviewService;
import com.platanito.trabajitos.models.entities.Review;


@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {
	
	@Autowired
	private ReviewService ReviewService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Review> getList() {
		return (List<Review>) ReviewService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<Review> findById(Long id) {
		return ReviewService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Review save(Review entity) {
		return ReviewService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		ReviewService.deleteById(id);
	}

}
