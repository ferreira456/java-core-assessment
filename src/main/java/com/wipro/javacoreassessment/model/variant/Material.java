package com.wipro.javacoreassessment.model.variant;

import com.wipro.javacoreassessment.model.entity.EntityType;
import lombok.NonNull;

public class Material extends EntityType {
    public Material(String type) {
        super(type);
    }

    public Material(@NonNull Long id, String type) {
        super(id, type);
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
