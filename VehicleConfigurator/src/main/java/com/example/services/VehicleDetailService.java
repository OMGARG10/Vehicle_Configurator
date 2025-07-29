package com.example.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.VehicleDetail;
import com.example.repositories.VehicleDetailRepository;

@Service
public class VehicleDetailService {
    @Autowired
    private VehicleDetailRepository vehicleDetailRepository;

    public List<VehicleDetail> getAllVehicleDetails() {
        return vehicleDetailRepository.findAll();
    }

    public VehicleDetail createVehicleDetail(VehicleDetail detail) {
        return vehicleDetailRepository.save(detail);
    }
}
