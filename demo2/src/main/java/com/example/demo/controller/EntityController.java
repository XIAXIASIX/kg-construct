package com.example.demo.controller;

import com.example.demo.model.Entity;
import com.example.demo.service.EntityService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entities")
public class EntityController {

    @Resource
    private EntityService entityService;

    @PostMapping
    public Entity addEntity(@RequestBody Entity entity) {
        entityService.addEntity(entity);
        return entity;
    }

    @PutMapping("/{id}")
    public Entity updateEntity(@PathVariable Long id, @RequestBody Entity entity) {
        entityService.updateEntity(id, entity);
        return entity;
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable Long id) {
        entityService.deleteEntity(id);
    }

    @GetMapping("/{id}")
    public Entity getEntity(@PathVariable Long id) {
        return entityService.getEntity(id);
    }

    @GetMapping("/search")
    public List<Entity> searchEntity(@RequestParam String keyword) {
        return entityService.searchEntity(keyword);
    }
}