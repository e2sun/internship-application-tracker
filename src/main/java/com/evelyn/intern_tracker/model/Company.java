package com.evelyn.intern_tracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity // this tells JPA: map this class to a table
public class Company {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment in Postgres
    private Long id;

    @Column(nullable = false) // required field
    private String name;

    // optional fields
    private String location;
    private String website;
    private String notes;

    // JPA needs a no-arg constructor
    public Company() {

    }

    // constructor
    public Company(String name, String location, String website, String notes){
        this.name = name;
        this.location = location;
        this.website = website;
        this.notes = notes;
    }

    // getters and setters (so JPA and JSON can access fields)

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getWebsite(){
        return website;
    }

    public void setWebsite(String website){
        this.website = website;
    }

    public String getNotes(){
        return notes;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }
}