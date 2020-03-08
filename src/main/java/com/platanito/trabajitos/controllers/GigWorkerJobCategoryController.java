package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.GigWorkerJobCategoryService;
import com.platanito.trabajitos.models.entities.GigWorkerJobCategory;


@RestController
@RequestMapping("/api/v1/gig-worker-job-category")
public class GigWorkerJobCategoryController {
	
	@Autowired
	private GigWorkerJobCategoryService GigWorkerJobCategoryService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<GigWorkerJobCategory> getList() {
		return (List<GigWorkerJobCategory>) GigWorkerJobCategoryService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<GigWorkerJobCategory> findById(Long id) {
		return GigWorkerJobCategoryService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public GigWorkerJobCategory save(GigWorkerJobCategory entity) {
		return GigWorkerJobCategoryService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		GigWorkerJobCategoryService.deleteById(id);
	}

}
