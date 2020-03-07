package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.Permission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PermissionRepository extends CrudRepository<Permission, Long> {

}
