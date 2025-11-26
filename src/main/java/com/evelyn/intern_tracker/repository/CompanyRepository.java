package com.evelyn.intern_tracker.repository;

import com.evelyn.intern_tracker.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

// data access later - define interface 
// spring data JPA generates CRUD methods
public interface CompanyRepository extends JpaRepository<Company, Long>{

}