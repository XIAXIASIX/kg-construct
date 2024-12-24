package com.example.demo.service.impl;

import com.example.demo.model.Relationship;
import com.example.demo.repository.RelationshipRepository;
import com.example.demo.service.RelationshipService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RelationshipServiceImpl implements RelationshipService {

    @Resource
    private RelationshipRepository relationshipRepository;

    @Override
    @Transactional
    public void addRelationship(Relationship relationship) {
        relationshipRepository.save(relationship);
    }

    @Override
    @Transactional
    public void deleteRelationship(Long id) {
        relationshipRepository.deleteById(id);
    }

    @Override
    public Relationship getRelationship(Long id) {
        return relationshipRepository.findById(id).orElse(null);
    }

    @Override
    public List<Relationship> findByTypeAndStartNodeId(String type, Long startNodeId) {
        return relationshipRepository.findByTypeAndStartNodeId(type, startNodeId);
    }

    @Override
    public List<Relationship> findByTypeAndEndNodeId(String type, Long endNodeId) {
        return relationshipRepository.findByTypeAndEndNodeId(type, endNodeId);
    }
}