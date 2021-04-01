package com.wipro.javacoreassessment.model.variant.pants;

import com.wipro.javacoreassessment.model.variant.Size;
import lombok.NonNull;

public class PantsSize extends Size {
    public PantsSize(String type) {
        super(type);
    }

    public PantsSize(@NonNull Long id, String type) {
        super(id, type);
    }

    @Override
    public String toString() {
        return "PantsSize{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
