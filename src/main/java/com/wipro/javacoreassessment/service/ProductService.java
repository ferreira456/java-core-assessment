package com.wipro.javacoreassessment.service;

import com.wipro.javacoreassessment.model.Product;
import com.wipro.javacoreassessment.repository.ProductRepository;

import java.util.Map;

public class ProductService extends Service<Product> {
    public ProductService() {
        super(new ProductRepository());
    }

    public Map<Long, Product> findByName(String name) {
        return ((ProductRepository) repository).findByName(name);
    }
}
