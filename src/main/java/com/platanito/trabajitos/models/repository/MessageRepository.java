package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

}
