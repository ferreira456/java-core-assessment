package com.wipro.javacoreassessment.model.variant;

import com.wipro.javacoreassessment.model.Category;
import com.wipro.javacoreassessment.model.Image;
import com.wipro.javacoreassessment.model.Product;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public abstract class Variant extends Product {
    protected Color color;
    protected Size size;
    protected Gender gender;

    public Variant(@NonNull String name, @NonNull Double price, String description, Category category,
                   @NonNull Integer quantity, Set<Image> images, Color color, Size size, Gender gender) {
        super(name, price, description, category, quantity, images);
        this.color = color;
        this.size = size;
        this.gender = gender;
    }

    public Variant(@NonNull Long id, @NonNull String name, @NonNull Double price, String description, Category category,
                   @NonNull Integer quantity, Set<Image> images, Color color, Size size, Gender gender) {
        super(id, name, price, description, category, quantity, images);
        this.color = color;
        this.size = size;
        this.gender = gender;
    }
}
