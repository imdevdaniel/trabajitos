package com.platanito.trabajitos.models.services;

import com.platanito.trabajitos.models.entities.Message;
import java.util.List;
import java.util.Optional;


public interface MessageService {

	public List<Message> findAll();
	
	public Message save(Message entity);
	
	public Optional<Message> findById(Long id);
	
	public void delete(Message entity);

	public void deleteById(Long id);
	
}
