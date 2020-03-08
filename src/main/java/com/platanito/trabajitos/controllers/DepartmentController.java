package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.DepartmentService;
import com.platanito.trabajitos.models.entities.Department;


@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService DepartmentService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Department> getList() {
		return (List<Department>) DepartmentService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<Department> findById(Long id) {
		return DepartmentService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Department save(Department entity) {
		return DepartmentService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		DepartmentService.deleteById(id);
	}

}
