package com.example.demo.service;

import com.example.demo.model.Relationship;

import java.util.List;

public interface RelationshipService {
    void addRelationship(Relationship relationship);
    void deleteRelationship(Long id);
    Relationship getRelationship(Long id);
    List<Relationship> findByTypeAndStartNodeId(String type, Long startNodeId);
    List<Relationship> findByTypeAndEndNodeId(String type, Long endNodeId);
}