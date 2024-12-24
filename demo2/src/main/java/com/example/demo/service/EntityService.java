package com.example.demo.service;

import com.example.demo.model.Entity;
import java.util.List;

public interface EntityService {
    void addEntity(Entity entity);
    void updateEntity(Long id, Entity entity);
    void deleteEntity(Long id);
    Entity getEntity(Long id);
    List<Entity> searchEntity(String keyword);
}