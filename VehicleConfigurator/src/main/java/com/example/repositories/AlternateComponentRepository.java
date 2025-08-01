package com.example.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entities.AlternateComponent;
import com.example.entities.Component;
import com.example.entities.Model;

@Repository
public interface AlternateComponentRepository extends JpaRepository<AlternateComponent, Integer> {
    List<AlternateComponent> findByModel(Model model);
    List<AlternateComponent> findByModelModelId(int modelId);
    
    List<AlternateComponent> findByBaseComponent(Component baseComponent);
    List<AlternateComponent> findByAlternateComponent(Component alternateComponent);

    List<AlternateComponent> findByBaseComponentCompId(int compId);
    List<AlternateComponent> findByAlternateComponentCompId(int compId);
}

