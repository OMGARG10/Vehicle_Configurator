package com.example.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "alternate_componentmaster")
public class AlternateComponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int altId;

    @ManyToOne
    @JoinColumn(name = "model_id")  // explicitly map FK
    private Model model;

    public int getAltId() {
		return altId;
	}

	public void setAltId(int altId) {
		this.altId = altId;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Component getBaseComponent() {
		return baseComponent;
	}

	public void setBaseComponent(Component baseComponent) {
		this.baseComponent = baseComponent;
	}

	public Component getAlternateComponent() {
		return alternateComponent;
	}

	public void setAlternateComponent(Component alternateComponent) {
		this.alternateComponent = alternateComponent;
	}

	public BigDecimal getDeltaPrice() {
		return deltaPrice;
	}

	public void setDeltaPrice(BigDecimal deltaPrice) {
		this.deltaPrice = deltaPrice;
	}

	@ManyToOne
    @JoinColumn(name = "comp_id")  // explicitly map base component FK
    private Component baseComponent;

    @ManyToOne
    @JoinColumn(name = "alt_comp_id") // already correct
    private Component alternateComponent;

    private BigDecimal deltaPrice;

    
}
