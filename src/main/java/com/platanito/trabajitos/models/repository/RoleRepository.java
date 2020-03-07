package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
