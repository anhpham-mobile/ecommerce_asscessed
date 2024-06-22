package com.example.category.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("categories")
public class Category {
    @Id
    private String id;
    @Field("name")
    private String name;
    @Field("parentID")
    private String parentID;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getParentID() {
        return this.parentID;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setParentID(final String parentID) {
        this.parentID = parentID;
    }

    public Category(final String id, final String name, final String parentID) {
        this.id = id;
        this.name = name;
        this.parentID = parentID;
    }

    public Category() {
    }
}
