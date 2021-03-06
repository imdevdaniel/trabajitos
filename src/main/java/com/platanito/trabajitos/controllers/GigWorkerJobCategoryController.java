package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.GigWorkerJobCategoryService;
import com.platanito.trabajitos.models.entities.GigWorkerJobCategory;


@RestController
@RequestMapping("/api/v1/gig-worker-job-categories")
public class GigWorkerJobCategoryController {

	@Autowired
	private GigWorkerJobCategoryService gigWorkerJobCategoryService;

	@RequestMapping(value="", method=RequestMethod.GET)
	public List<GigWorkerJobCategory> getList() {
		return (List<GigWorkerJobCategory>) gigWorkerJobCategoryService.findAll() ;
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<GigWorkerJobCategory> findById(@PathVariable("id") Long id) {
		return gigWorkerJobCategoryService.findById(id);
	}

	@RequestMapping(value="", method=RequestMethod.POST)
	public GigWorkerJobCategory save(@RequestBody GigWorkerJobCategory entity) {
		return gigWorkerJobCategoryService.save(entity);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		gigWorkerJobCategoryService.deleteById(id);
	}

}
