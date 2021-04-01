package com.wipro.javacoreassessment.model.variant.tshirt;

import com.wipro.javacoreassessment.model.entity.EntityType;
import lombok.NonNull;

public class TShirtSleeve extends EntityType {
    public TShirtSleeve(String type) {
        super(type);
    }

    public TShirtSleeve(@NonNull Long id, String type) {
        super(id, type);
    }

    @Override
    public String toString() {
        return "TShirtSleeve{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
