package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.ReviewService;
import com.platanito.trabajitos.models.entities.Review;


@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;

	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Review> getList() {
		return (List<Review>) reviewService.findAll() ;
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<Review> findById(@PathVariable("id") Long id) {
		return reviewService.findById(id);
	}

	@RequestMapping(value="", method=RequestMethod.POST)
	public Review save(@RequestBody Review entity) {
		return reviewService.save(entity);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		reviewService.deleteById(id);
	}

}
