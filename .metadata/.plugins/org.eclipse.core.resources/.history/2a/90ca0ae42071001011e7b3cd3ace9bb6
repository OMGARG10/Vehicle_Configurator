package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "component_master")
public class Component {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int compId;

    @Column(name = "comp_name")  // Optional if field name matches column name
    private String compName;

    // No-arg constructor (required by JPA)
    public Component() {}

    // Getters and Setters
    public int getCompId() {
        return compId;
    }

    public void setCompId(int compId) {
        this.compId = compId;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }
}
