package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import java.io.Serializable;
import java.util.Objects;

@RelationshipProperties
public class Relationship implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    private String type;

    @TargetNode
    private Entity startNode;

    @TargetNode
    private Entity endNode;

    public Relationship() {
    }

    public Relationship(Long id, String type, Entity startNode, Entity endNode) {
        this.id = id;
        this.type = type;
        this.startNode = startNode;
        this.endNode = endNode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Entity getStartNode() {
        return startNode;
    }

    public void setStartNode(Entity startNode) {
        this.startNode = startNode;
    }

    public Entity getEndNode() {
        return endNode;
    }

    public void setEndNode(Entity endNode) {
        this.endNode = endNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Relationship that = (Relationship) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", startNode=" + startNode +
                ", endNode=" + endNode +
                '}';
    }
}