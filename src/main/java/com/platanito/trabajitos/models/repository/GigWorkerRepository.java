package com.platanito.trabajitos.models.repository;

import com.platanito.trabajitos.models.entities.GigWorker;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface GigWorkerRepository extends CrudRepository<GigWorker, Long> {
	
	@Modifying
	@Query("SELECT workrs FROM GigWorker workrs, GigWorkerPhone gigwp WHERE gigwp.value LIKE %:phoneNumber% AND workrs.id = gigwp.id")
	List<GigWorker> findByPhone(@Param("phoneNumber") String phoneNumber);

}
