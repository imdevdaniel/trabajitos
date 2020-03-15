package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.MessageService;
import com.platanito.trabajitos.models.entities.Message;


@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

	@Autowired
	private MessageService messageService;

	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Message> getList() {
		return (List<Message>) messageService.findAll() ;
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<Message> findById(@PathVariable("id") Long id) {
		return messageService.findById(id);
	}

	@RequestMapping(value="", method=RequestMethod.POST)
	public Message save(@RequestBody Message entity) {
		return messageService.save(entity);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		messageService.deleteById(id);
	}

}
