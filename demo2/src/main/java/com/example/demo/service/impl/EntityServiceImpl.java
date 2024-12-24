package com.example.demo.service.impl;

import com.example.demo.model.Entity;
import com.example.demo.repository.EntityRepository;
import com.example.demo.service.EntityService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EntityServiceImpl implements EntityService {

    @Resource
    private EntityRepository entityRepository;

    @Override
    @Transactional
    public void addEntity(Entity entity) {
        entityRepository.save(entity);
    }

    @Override
    @Transactional
    public void updateEntity(Long id, Entity entity) {
        Optional<Entity> existingEntity = entityRepository.findById(id);
        existingEntity.ifPresent(e -> {
            e.setName(entity.getName());
            e.setAttributes(entity.getAttributes());
            entityRepository.save(e);
        });
    }

    @Override
    @Transactional
    public void deleteEntity(Long id) {
        entityRepository.deleteById(id);
    }

    @Override
    public Entity getEntity(Long id) {
        return entityRepository.findById(id).orElse(null);
    }

    @Override
    public List<Entity> searchEntity(String keyword) {
        return entityRepository.findByNameContaining(keyword);
    }
}