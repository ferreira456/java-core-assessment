package com.wipro.javacoreassessment.repository;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public abstract class Repository<T> {
    protected Map<Long, T> entities;

    public Repository() {
        entities = new TreeMap<>();
    }

    public T save(Long id, T t) {
        return entities.put(id, t);
    }

    public Optional<T> findById(Long id) {
        return entities.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(id))
                .findFirst()
                .map(entry -> entry.getValue());
    }

    public Map<Long, T> findAll() {
        return entities;
    }

    public boolean delete(Long id, T t) {
        return entities.remove(id, t);
    }
}
