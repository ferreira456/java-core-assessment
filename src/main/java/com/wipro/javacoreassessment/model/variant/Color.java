package com.wipro.javacoreassessment.model.variant;

import com.wipro.javacoreassessment.model.entity.EntityType;
import lombok.NonNull;

public class Color extends EntityType {
    public Color(String type) {
        super(type);
    }

    public Color(@NonNull Long id, String type) {
        super(id, type);
    }

    @Override
    public String toString() {
        return "Color{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
