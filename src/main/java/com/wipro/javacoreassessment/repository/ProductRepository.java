package com.wipro.javacoreassessment.repository;

import com.wipro.javacoreassessment.model.Product;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductRepository extends Repository<Product> {
    public Map<Long, Product> findByName(String name) {
        return entities.values()
                .stream()
                .filter(product -> ((Product) product).getName().equals(name))
                .map(product -> ((Product) product))
                .collect(Collectors.toMap(Product::getId, Function.identity()));
    }
}
