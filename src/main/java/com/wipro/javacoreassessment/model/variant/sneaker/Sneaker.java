package com.wipro.javacoreassessment.model.variant.sneaker;

import com.wipro.javacoreassessment.model.Category;
import com.wipro.javacoreassessment.model.Image;
import com.wipro.javacoreassessment.model.variant.Activity;
import com.wipro.javacoreassessment.model.variant.Color;
import com.wipro.javacoreassessment.model.variant.Gender;
import com.wipro.javacoreassessment.model.variant.VariantLegs;
import lombok.NonNull;

import java.util.Set;

public class Sneaker extends VariantLegs {
    public Sneaker(@NonNull String name, @NonNull Double price, String description, Category category,
                   @NonNull Integer quantity, Set<Image> images, Color color, SneakerSize size, Gender gender,
                   Activity activity) {
        super(name, price, description, category, quantity, images, color, size, gender, activity);
    }

    public Sneaker(@NonNull Long id, @NonNull String name, @NonNull Double price, String description, Category category,
                   @NonNull Integer quantity, Set<Image> images, Color color, SneakerSize size, Gender gender,
                   Activity activity) {
        super(id, name, price, description, category, quantity, images, color, size, gender, activity);
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", quantity=" + quantity +
                ", images=" + images +
                ", id=" + id +
                ", color=" + color +
                ", size=" + size +
                ", gender=" + gender +
                ", activity=" + activity +
                '}';
    }
}
