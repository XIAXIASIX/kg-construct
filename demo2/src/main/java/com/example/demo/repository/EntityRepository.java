package com.example.demo.repository;

import com.example.demo.model.Entity;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface EntityRepository extends Neo4jRepository<Entity, Long> {
    @Query("MATCH (e:Entity) WHERE e.name = $name RETURN e")
    List<Entity> findByName(@Param("name") String name);

    @Query("MATCH (e:Entity) WHERE e.name CONTAINS $keyword RETURN e")
    List<Entity> findByNameContaining(@Param("keyword") String keyword);
}