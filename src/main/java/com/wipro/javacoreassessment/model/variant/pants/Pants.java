package com.wipro.javacoreassessment.model.variant.pants;

import com.wipro.javacoreassessment.model.Category;
import com.wipro.javacoreassessment.model.Image;
import com.wipro.javacoreassessment.model.variant.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class Pants extends VariantLegs {
    private Material material;

    public Pants(@NonNull String name, @NonNull Double price, String description, Category category,
                 @NonNull Integer quantity, Set<Image> images, Color color, PantsSize size, Gender gender,
                 Activity activity) {
        super(name, price, description, category, quantity, images, color, size, gender, activity);
    }

    public Pants(@NonNull Long id, @NonNull String name, @NonNull Double price, String description, Category category,
                 @NonNull Integer quantity, Set<Image> images, Color color, PantsSize size, Gender gender,
                 Activity activity) {
        super(id, name, price, description, category, quantity, images, color, size, gender, activity);
    }

    @Override
    public String toString() {
        return "Pants{" +
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
                ", material=" + material +
                '}';
    }
}
