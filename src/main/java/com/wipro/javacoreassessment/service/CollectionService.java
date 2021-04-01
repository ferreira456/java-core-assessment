package com.wipro.javacoreassessment.service;

import com.wipro.javacoreassessment.model.Collection;
import com.wipro.javacoreassessment.repository.CollectionRepository;

import java.util.List;
import java.util.Map;

public class CollectionService extends Service<Collection> {
    public CollectionService() {
        super(new CollectionRepository());
    }

    public Map<Long, Collection> findByKeywords(List<String> keywords) {
        return ((CollectionRepository) repository).findByKeywords(keywords);
    }
}
