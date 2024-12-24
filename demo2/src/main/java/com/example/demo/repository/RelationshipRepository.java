package com.example.demo.repository;

import com.example.demo.model.Relationship;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface RelationshipRepository extends Neo4jRepository<Relationship, Long> {
    List<Relationship> findByTypeAndStartNodeId(String type, Long startNodeId);
    List<Relationship> findByTypeAndEndNodeId(String type, Long endNodeId);
}