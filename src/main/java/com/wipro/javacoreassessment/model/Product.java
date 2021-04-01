package com.wipro.javacoreassessment.model;

import com.wipro.javacoreassessment.model.entity.Entity;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Product extends Entity {
    @NonNull
    protected String name;

    @NonNull
    protected Double price;
    protected String description;
    protected Category category;

    @NonNull
    protected Integer quantity;
    protected Set<Image> images;

    public Product(@NonNull String name, @NonNull Double price, String description, Category category,
                   @NonNull Integer quantity, Set<Image> images) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.quantity = quantity;
        this.images = images;
    }

    public Product(@NonNull Long id, @NonNull String name, @NonNull Double price, String description, Category category,
                   @NonNull Integer quantity, Set<Image> images) {
        super(id);
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.quantity = quantity;
        this.images = images;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", quantity=" + quantity +
                ", images=" + images +
                ", id=" + id +
                '}';
    }
}
