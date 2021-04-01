package com.wipro.javacoreassessment.model.variant;

import com.wipro.javacoreassessment.model.entity.EntityType;
import lombok.NonNull;

public abstract class Size extends EntityType {
    public Size(String type) {
        super(type);
    }

    public Size(@NonNull Long id, String type) {
        super(id, type);
    }
}
