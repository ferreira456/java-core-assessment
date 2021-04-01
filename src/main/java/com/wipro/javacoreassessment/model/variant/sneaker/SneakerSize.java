package com.wipro.javacoreassessment.model.variant.sneaker;

import com.wipro.javacoreassessment.model.variant.Size;
import lombok.NonNull;

public class SneakerSize extends Size {
    public SneakerSize(String type) {
        super(type);
    }

    public SneakerSize(@NonNull Long id, String type) {
        super(id, type);
    }

    @Override
    public String toString() {
        return "SneakerSize{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
