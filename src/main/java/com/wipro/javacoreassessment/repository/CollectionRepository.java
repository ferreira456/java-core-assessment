package com.wipro.javacoreassessment.repository;

import com.wipro.javacoreassessment.model.Collection;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionRepository extends Repository<Collection> {
    public Map<Long, Collection> findByKeywords(List<String> keywords) {
        return entities.values().stream()
                .filter(collection -> !Collections.disjoint(collection.getKeywords(), keywords))
                .collect(Collectors.toMap(Collection::getId, Function.identity()));
    }
}
