package com.wipro.javacoreassessment.controller;

import com.wipro.javacoreassessment.model.Collection;
import com.wipro.javacoreassessment.service.CollectionService;

import java.util.List;
import java.util.Map;

public class CollectionController extends Controller<Collection> {
    public CollectionController() {
        super(new CollectionService());
    }

    public Map<Long, Collection> findByKeywords(List<String> keywords) {
        return ((CollectionService) service).findByKeywords(keywords);
    }
}
