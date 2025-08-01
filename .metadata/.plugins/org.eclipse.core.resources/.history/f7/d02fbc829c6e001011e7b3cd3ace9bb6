package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.AlternateComponent;
import com.example.services.AlternateComponentService;

@RestController
@RequestMapping("/alternate-components")
public class AlternateComponentController {
    @Autowired
    private AlternateComponentService alternateComponentService;

    @GetMapping
    public List<AlternateComponent> getAllAlternateComponents() {
        return alternateComponentService.getAllAlternateComponents();
    }

    @PostMapping
    public AlternateComponent addAlternateComponent(@RequestBody AlternateComponent altComp) {
        return alternateComponentService.addAlternateComponent(altComp);
    }
}
