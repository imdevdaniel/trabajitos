package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.DepartmentService;
import com.platanito.trabajitos.models.entities.Department;


@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Department> getList() {
		return (List<Department>) departmentService.findAll() ;
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<Department> findById(@PathVariable("id") Long id) {
		return departmentService.findById(id);
	}

	@RequestMapping(value="", method=RequestMethod.POST)
	public Department save(@RequestBody Department entity) {
		return departmentService.save(entity);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		departmentService.deleteById(id);
	}

}
