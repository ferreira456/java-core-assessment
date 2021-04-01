package com.wipro.javacoreassessment.model;

import com.wipro.javacoreassessment.model.entity.Entity;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Collection extends Entity {
    private String name;
    private String description;
    private List<String> keywords;
    private Map<Long, Product> products;

    public Collection(String name, String description, List<String> keywords, Map<Long, Product> products) {
        this.name = name;
        this.description = description;
        this.keywords = keywords;
        this.products = products;
    }

    public Collection(@NonNull Long id, String name, String description, List<String> keywords,
                      Map<Long, Product> products) {
        super(id);
        this.name = name;
        this.description = description;
        this.keywords = keywords;
        this.products = products;
    }
}
