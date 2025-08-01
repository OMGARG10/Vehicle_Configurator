package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "seg_mfg_association", uniqueConstraints = @UniqueConstraint(columnNames = {"seg_id", "mfg_id"}))
public class SegmentManufacturerAssociation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int segMfgAssocid;

    public int getSegMfgAssocid() {
		return segMfgAssocid;
	}

	public void setSegMfgAssocid(int segMfgAssocid) {
		this.segMfgAssocid = segMfgAssocid;
	}

	public Segment getSegment() {
		return segment;
	}

	public void setSegment(Segment segment) {
		this.segment = segment;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	@ManyToOne
    private Segment segment;

    @ManyToOne
    private Manufacturer manufacturer;
}

