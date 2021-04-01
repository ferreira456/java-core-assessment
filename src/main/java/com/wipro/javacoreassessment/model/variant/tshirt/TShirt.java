package com.wipro.javacoreassessment.model.variant.tshirt;

import com.wipro.javacoreassessment.model.Category;
import com.wipro.javacoreassessment.model.Image;
import com.wipro.javacoreassessment.model.variant.Color;
import com.wipro.javacoreassessment.model.variant.Gender;
import com.wipro.javacoreassessment.model.variant.Size;
import com.wipro.javacoreassessment.model.variant.Variant;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class TShirt extends Variant {
    private TShirtSleeve sleeve;

    public TShirt(@NonNull String name, @NonNull Double price, String description, Category category,
                  @NonNull Integer quantity, Set<Image> images, Color color, Size size, Gender gender,
                  TShirtSleeve sleeve) {
        super(name, price, description, category, quantity, images, color, size, gender);
        this.sleeve = sleeve;
    }

    public TShirt(@NonNull Long id, @NonNull String name, @NonNull Double price, String description, Category category,
                  @NonNull Integer quantity, Set<Image> images, Color color, Size size, Gender gender,
                  TShirtSleeve sleeve) {
        super(id, name, price, description, category, quantity, images, color, size, gender);
        this.sleeve = sleeve;
    }

    @Override
    public String toString() {
        return "TShirt{" +
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
                ", sleeve=" + sleeve +
                '}';
    }
}
