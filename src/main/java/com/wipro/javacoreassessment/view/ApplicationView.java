package com.wipro.javacoreassessment.view;

import com.wipro.javacoreassessment.controller.CollectionController;
import com.wipro.javacoreassessment.controller.EntityController;
import com.wipro.javacoreassessment.controller.ProductController;

public class ApplicationView {
    private EntityController entityController = new EntityController();
    private ProductController productController = new ProductController();
    private CollectionController collectionController = new CollectionController();

    public ApplicationView() {
        EntityController entityController = new EntityController();
        ProductController productController = new ProductController();
        CollectionController collectionController = new CollectionController();
    }

    public void render() {

    }

    public void clear() {

    }
}
