package com.example.demo.controller;

import com.example.demo.model.Relationship;
import com.example.demo.service.RelationshipService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relationships")
public class RelationshipController {

    @Resource
    private RelationshipService relationshipService;

    @PostMapping
    public Relationship addRelationship(@RequestBody Relationship relationship) {
        relationshipService.addRelationship(relationship);
        return relationship;
    }

    @DeleteMapping("/{id}")
    public void deleteRelationship(@PathVariable Long id) {
        relationshipService.deleteRelationship(id);
    }

    @GetMapping("/{id}")
    public Relationship getRelationship(@PathVariable Long id) {
        return relationshipService.getRelationship(id);
    }

    @GetMapping("/searchByTypeAndStartNodeId")
    public List<Relationship> searchByTypeAndStartNodeId(@RequestParam String type, @RequestParam Long startNodeId) {
        return relationshipService.findByTypeAndStartNodeId(type, startNodeId);
    }

    @GetMapping("/searchByTypeAndEndNodeId")
    public List<Relationship> searchByTypeAndEndNodeId(@RequestParam String type, @RequestParam Long endNodeId) {
        return relationshipService.findByTypeAndEndNodeId(type, endNodeId);
    }
}