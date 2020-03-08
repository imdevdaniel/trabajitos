package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.JobCategoryService;
import com.platanito.trabajitos.models.entities.JobCategory;


@RestController
@RequestMapping("/api/v1/job-category")
public class JobCategoryController {
	
	@Autowired
	private JobCategoryService JobCategoryService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<JobCategory> getList() {
		return (List<JobCategory>) JobCategoryService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<JobCategory> findById(Long id) {
		return JobCategoryService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public JobCategory save(JobCategory entity) {
		return JobCategoryService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		JobCategoryService.deleteById(id);
	}

}
