package com.wipro.javacoreassessment.controller;

import com.wipro.javacoreassessment.model.entity.Entity;
import com.wipro.javacoreassessment.service.Service;

import java.util.Map;
import java.util.Optional;

public abstract class Controller<T extends Entity> {
    protected Service<T> service;

    public Controller(Service<T> service) {
        this.service = service;
    }

    public T save(T t) {
        return service.save(t);
    }

    public Optional<T> findById(Long id) {
        return service.findById(id);
    }

    public Map<Long, T> findAll() {
        return service.findAll();
    }

    public boolean delete(T t) {
        return service.delete(t);
    }
}
