package com.wipro.javacoreassessment.model.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public abstract class EntityType extends Entity {
    protected String type;

    public EntityType(String type) {
        this.type = type;
    }

    public EntityType(@NonNull Long id, String type) {
        super(id);
        this.type = type;
    }
}
