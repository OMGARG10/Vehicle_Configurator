package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle_detail")
public class VehicleDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int configId;

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
	@ManyToOne
    private Model model;

    @ManyToOne
    private Component component;

    private char compType;
    private char isConfigurable;
}
