package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.SegmentManufacturerAssociation;
import com.example.services.SegmentManufacturerAssociationService;

@RestController
@RequestMapping("/segment-mfg")
public class SegmentManufacturerAssociationController {
    @Autowired
    private SegmentManufacturerAssociationService assocService;

    @GetMapping
    public List<SegmentManufacturerAssociation> getAllAssociations() {
        return assocService.getAllAssociations();
    }

    @PostMapping
    public SegmentManufacturerAssociation addAssociation(@RequestBody SegmentManufacturerAssociation association) {
        return assocService.createAssociation(association);
    }
}
