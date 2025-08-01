package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle_detail")
public class VehicleDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "config_id")
    private int configId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "model_id", nullable = false)
    private Model model;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "comp_id", nullable = false)
    private Component component;

    @Column(name = "comp_type", nullable = false)
    private char compType;

    @Column(name = "is_configurable", nullable = false)
    private char isConfigurable;

    // Getters and setters

    public int getConfigId() {
        return configId;
    }

    public void setConfigId(int configId) {
        this.configId = configId;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public char getCompType() {
        return compType;
    }

    public void setCompType(char compType) {
        this.compType = compType;
    }

    public char getIsConfigurable() {
        return isConfigurable;
    }

    public void setIsConfigurable(char isConfigurable) {
        this.isConfigurable = isConfigurable;
    }
}
