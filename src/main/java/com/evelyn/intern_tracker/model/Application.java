package com.evelyn.intern_tracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Application {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String roleTitle;
    @Column(nullable = false)
    private String dateApplied;
    @Column(nullable = false)
    private String status;

    // optional fields
    private String portalLink;
    private String notes;
    
    // many applications can belong to one company
    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;

    public Application(){

    }

    public Application(String roleTitle, String dateApplied, String status, String portalLink, String notes, String company){
        this.roleTitle = roleTitle;
        this.dateApplied = dateApplied;
        this.status = status;
        this.portalLink = portalLink;
        this.notes = notes;
        this.company = company;
    }

    // getters and setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getRoleTitle(){
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle){
        this.roleTitle = roleTitle;
    }

    public String getDateApplied(){
        return dateApplied; 
    }

    public void setDateApplied(String dateApplied){
        this.dateApplied = dateApplied;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getPortalLink(){
        return portalLink;
    }

    public void setPortalLink(String portalLink){
        this.portalLink = portalLink;
    }

    public String getNotes(){
        return notes;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(Company company){
        this.company = company;
    }

}