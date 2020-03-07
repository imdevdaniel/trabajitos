package com.platanito.trabajitos.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platanito.trabajitos.models.entities.Message;
import com.platanito.trabajitos.models.repository.MessageRepository;


@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	public MessageRepository repository;
	
	public List<Message> findAll() {
		return (List<Message>) repository.findAll();
	}
	
	public Message save(Message entity) {
		return repository.save(entity);
	}
	
	public Optional<Message> findById(Long id) {
		return repository.findById(id);
	}
	
	public void delete(Message entity) {
		repository.delete(entity);
	};

}
