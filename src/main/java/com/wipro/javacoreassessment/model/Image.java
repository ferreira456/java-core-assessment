package com.wipro.javacoreassessment.model;

import com.wipro.javacoreassessment.model.entity.Entity;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Image extends Entity {
    private String name;
    private String extension;
    private Integer size;
    private String url;

    public Image(String name, String extension, Integer size, String url) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.url = url;
    }

    public Image(@NonNull Long id, String name, String extension, Integer size, String url) {
        super(id);
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                ", extension='" + extension + '\'' +
                ", size=" + size +
                ", url='" + url + '\'' +
                ", id=" + id +
                '}';
    }
}
