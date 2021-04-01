package com.wipro.javacoreassessment.controller;

import com.wipro.javacoreassessment.model.Product;
import com.wipro.javacoreassessment.service.ProductService;

import java.util.Map;

public class ProductController extends Controller<Product> {
    public ProductController() {
        super(new ProductService());
    }

    public Map<Long, Product> findByName(String name) {
        return ((ProductService) service).findByName(name);
    }
}
