package com.wipro.javacoreassessment.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Entity {
    protected Long id;
    
    public Entity(@NonNull Long id) {
        this.id = id;
    }
}
