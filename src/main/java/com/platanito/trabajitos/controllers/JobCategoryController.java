package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.JobCategoryService;
import com.platanito.trabajitos.models.entities.JobCategory;


@RestController
@RequestMapping("/api/v1/job-categories")
public class JobCategoryController {

	@Autowired
	private JobCategoryService jobCategoryService;

	@RequestMapping(value="", method=RequestMethod.GET)
	public List<JobCategory> getList() {
		return (List<JobCategory>) jobCategoryService.findAll() ;
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<JobCategory> findById(@PathVariable("id") Long id) {
		return jobCategoryService.findById(id);
	}

	@RequestMapping(value="", method=RequestMethod.POST)
	public JobCategory save(@RequestBody JobCategory entity) {
		return jobCategoryService.save(entity);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		jobCategoryService.deleteById(id);
	}

}
