package com.evelyn.intern_tracker.controller;

import com.evelyn.intern_tracker.model.Company;
import com.evelyn.intern_tracker.repository.CompanyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@CrossOrigin(origins = "http://localhost:4200")
public class CompanyController {
    private final CompanyRepository companyRepository;

    // constructor injection (gives us CompanyRepository instance)
    public CompanyController(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    // GET /api/companies
    @GetMapping
    public List<Company> getAllCompanies(){
        return companyRepository.findAll(); // SELECT * FROM company
    }

    // POST /api/companies
    @PostMapping
    public Company createCompany(@RequestBody Company company){
        return companyRepository.save(company); // insert or update 
    }
}
