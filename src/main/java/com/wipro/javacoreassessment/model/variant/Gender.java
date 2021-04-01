package com.wipro.javacoreassessment.model.variant;

import com.wipro.javacoreassessment.model.entity.EntityType;
import lombok.NonNull;

public class Gender extends EntityType {
    public Gender(String type) {
        super(type);
    }

    public Gender(@NonNull Long id, String type) {
        super(id, type);
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
