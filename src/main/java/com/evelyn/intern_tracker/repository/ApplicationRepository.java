package com.evelyn.intern_tracker.repository;

import com.evelyn.intern_tracker.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// data access later - define interface 
// spring data JPA generates CRUD methods
public interface ApplicationRepository extends JpaRepository<Application, Long>{
    List<Application> findByCompany_Id(Long companyId);// _ in Company_Id tells Spring to go through company field and then use its id
}