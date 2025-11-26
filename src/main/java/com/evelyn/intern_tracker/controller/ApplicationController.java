package com.evelyn.intern_tracker.controller;

import com.evelyn.intern_tracker.model.Application;
import com.evelyn.intern_tracker.repository.ApplicationRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin(origins = "http://localhost:4200")
public class ApplicationController {
    private final ApplicationRepository applicationRepository;

    public ApplicationController(ApplicationRepository applicationRepository){
        this.applicationRepository = applicationRepository;
    }

    // GET /api/applications
    @GetMapping
    public List<Application> getAllApplications(){
        return applicationRepository.findAll(); 
    }

    // POST /api/applications
    @PostMapping
    public Application createApplication(@RequestBody Application application){
        return applicationRepository.save(application); 
    }

     // PUT /api/applications/{id}
     // Update existing application (status, notes, etc.)
    @PutMapping("/{id}")
    public Application updateApplication(@PathVariable Long id, @RequestBody Application updated){
        Application existing = applicationRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Application not found"));

        // update fields
        existing.setRoleTitle(updated.getRoleTitle());
        existing.setDateApplied(updated.getDateApplied());
        existing.setStatus(updated.getStatus());
        existing.setPortalLink(updated.getPortalLink());
        existing.setNotes(updated.getNotes());
        existing.setCompany(updated.getCompany());

        return applicationRepository.save(existing);
    }

    // DELETE /api/applications/{id}
    // Delete existing application (status, notes, etc.)
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // no return value, delete was successful
    public void deleteApplication(@PathVariable Long id){
        if (!applicationRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application not found");
        }
        applicationRepository.deleteById(id);
    }

}