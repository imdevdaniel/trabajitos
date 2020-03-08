package com.platanito.trabajitos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.platanito.trabajitos.models.services.MessageService;
import com.platanito.trabajitos.models.entities.Message;


@RestController
@RequestMapping("/api/v1/message")
public class MessageController {
	
	@Autowired
	private MessageService MessageService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Message> getList() {
		return (List<Message>) MessageService.findAll() ;
	}
	
	@RequestMapping(value="/find-single", method=RequestMethod.GET)
	public Optional<Message> findById(Long id) {
		return MessageService.findById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Message save(Message entity) {
		return MessageService.save(entity);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteById(Long id) {
		MessageService.deleteById(id);
	}

}
