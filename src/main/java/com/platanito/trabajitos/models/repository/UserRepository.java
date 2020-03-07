package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
