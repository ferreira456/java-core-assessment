package com.wipro.javacoreassessment.model.variant;

import com.wipro.javacoreassessment.model.Category;
import com.wipro.javacoreassessment.model.Image;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public abstract class VariantLegs extends Variant {
    protected Activity activity;

    public VariantLegs(@NonNull String name, @NonNull Double price, String description, Category category,
                       @NonNull Integer quantity, Set<Image> images, Color color, Size size, Gender gender,
                       Activity activity) {
        super(name, price, description, category, quantity, images, color, size, gender);
        this.activity = activity;
    }

    public VariantLegs(@NonNull Long id, @NonNull String name, @NonNull Double price, String description, Category category,
                       @NonNull Integer quantity, Set<Image> images, Color color, Size size, Gender gender,
                       Activity activity) {
        super(id, name, price, description, category, quantity, images, color, size, gender);
        this.activity = activity;
    }
}
