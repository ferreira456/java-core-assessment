package com.wipro.javacoreassessment.service;

import com.wipro.javacoreassessment.model.entity.Entity;
import com.wipro.javacoreassessment.repository.Repository;

import java.util.Map;
import java.util.Optional;

public abstract class Service<T extends Entity> {
    private Long sequence;
    protected Repository<T> repository;

    public Service(Repository<T> repository) {
        sequence = 0L;
        this.repository = repository;
    }

    public T save(T t) {
        t.setId(sequence++);
        return repository.save(t.getId(), t);
    }

    public Optional<T> findById(Long id) {
        return repository.findById(id);
    }

    public Map<Long, T> findAll() {
        return repository.findAll();
    }

    public boolean delete(T t) {
        return repository.delete(t.getId(), t);
    }
}
