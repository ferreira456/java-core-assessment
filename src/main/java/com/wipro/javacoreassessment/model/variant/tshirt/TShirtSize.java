package com.wipro.javacoreassessment.model.variant.tshirt;

import com.wipro.javacoreassessment.model.variant.Size;
import lombok.NonNull;

public class TShirtSize extends Size {
    public TShirtSize(String type) {
        super(type);
    }

    public TShirtSize(@NonNull Long id, String type) {
        super(id, type);
    }

    @Override
    public String toString() {
        return "TShirtSize{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
