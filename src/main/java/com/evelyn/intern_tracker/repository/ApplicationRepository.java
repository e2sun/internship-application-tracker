package com.evelyn.intern_tracker.repository;

import com.evelyn.intern_tracker.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

// data access later - define interface 
// spring data JPA generates CRUD methods
public interface ApplicationRepository extends JpaRepository<Application, Long>{

}