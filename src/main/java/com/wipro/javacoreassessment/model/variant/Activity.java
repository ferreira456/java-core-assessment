package com.wipro.javacoreassessment.model.variant;

import com.wipro.javacoreassessment.model.entity.EntityType;
import lombok.NonNull;

public class Activity extends EntityType {
    public Activity(String type) {
        super(type);
    }

    public Activity(@NonNull Long id, String type) {
        super(id, type);
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
