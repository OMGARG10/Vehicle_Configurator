package com.example.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Manufacturer;
import com.example.entities.Model;
import com.example.entities.Segment;
import com.example.repositories.ModelRepository;

@Service
public class ModelService {
    @Autowired
    private ModelRepository modelRepository;

    public List<Model> getAllModels() {
        return modelRepository.findAll();
    }

    public Model createModel(Model model) {
        return modelRepository.save(model);
    }

    public List<Model> getModelsByManufacturer(Manufacturer manufacturer) {
        return modelRepository.findByManufacturer(manufacturer);
    }

    public List<Model> getModelsBySegment(Segment segment) {
        return modelRepository.findBySegment(segment);
    }

    public Model getModelByName(String modelName) {
        return modelRepository.findByModelName(modelName);
    }

    public List<Model> getModelsByManufacturerAndSegment(Manufacturer manufacturer, Segment segment) {
        return modelRepository.findByManufacturerAndSegment(manufacturer, segment);
    }

    public List<Model> getModelsByPriceRange(BigDecimal min, BigDecimal max) {
        return modelRepository.findByPriceBetween(min, max);
    }

    public List<Model> getModelsWithMinQty(int qty) {
        return modelRepository.findByMinQtyGreaterThanEqual(qty);
    }

    public List<Model> searchModelsByName(String keyword) {
        return modelRepository.findByModelNameContainingIgnoreCase(keyword);
    }
}

