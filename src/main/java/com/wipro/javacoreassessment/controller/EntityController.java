package com.wipro.javacoreassessment.controller;

import com.wipro.javacoreassessment.model.entity.Entity;
import com.wipro.javacoreassessment.service.EntityService;

public class EntityController extends Controller<Entity> {
    public EntityController() {
        super(new EntityService());
    }
}
