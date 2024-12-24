package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Entity {

    @Id
    private Long id;
    private String name;
    private String attributes; // 添加 attributes 属性

    // 无参构造函数
    public Entity() {
    }

    // 有参构造函数
    public Entity(Long id, String name, String attributes) {
        this.id = id;
        this.name = name;
        this.attributes = attributes;
    }

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
}