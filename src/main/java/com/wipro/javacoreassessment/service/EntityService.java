package com.wipro.javacoreassessment.service;

import com.wipro.javacoreassessment.model.entity.Entity;
import com.wipro.javacoreassessment.repository.EntityRepository;

public class EntityService extends Service<Entity> {
    public EntityService() {
        super(new EntityRepository());
    }
}
