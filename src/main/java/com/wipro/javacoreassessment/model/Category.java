package com.wipro.javacoreassessment.model;

import com.wipro.javacoreassessment.model.entity.EntityType;
import lombok.NonNull;

public class Category extends EntityType {
    public Category(String type) {
        super(type);
    }

    public Category(@NonNull Long id, String type) {
        super(id, type);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
