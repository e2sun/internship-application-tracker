package com.evelyn.interntracker.repository;

import com.evelyn.interntracker.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

// data access later - define interface 
// spring data JPA generates CRUD methods
public interface CompanyRepository extends JpaRepository<Company, Long>{

}