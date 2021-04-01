package com.wipro.javacoreassessment.service;

import com.wipro.javacoreassessment.model.Image;
import com.wipro.javacoreassessment.model.entity.Entity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
class EntityServiceTest {
    @Mock
    private EntityService service;

    private List<Image> images;

    @BeforeEach
    void setUp() {
        if (images == null) {
            images = new ArrayList<>();
        } else {
            images.clear();
        }

        for (int i = 0; i < 3; i++) {
            images.add(new Image((long) i, "Image " + i, "png", i * 10, "url " + i));
        }
    }

    @Test
    void save() {
        Mockito.when(service.save(images.get(0))).thenReturn(images.get(0));

        Assertions.assertEquals(service.save(images.get(0)), images.get(0));
    }

    @Test
    void findById() {
        Mockito.when(service.findById(images.get(0).getId())).thenReturn(Optional.of(images.get(0)));

        Assertions.assertEquals(service.findById(images.get(0).getId()), Optional.of(images.get(0)));
    }

    @Test
    void findAll() {
        Map<Long, Entity> entities = images.stream().collect(Collectors.toMap(Image::getId, Function.identity()));

        Mockito.when(service.findAll()).thenReturn(entities);

        Assertions.assertEquals(service.findAll(), entities);
    }

    @Test
    void delete() {
        Map<Long, Entity> entities = images.stream().collect(Collectors.toMap(Image::getId, Function.identity()));
        entities.remove(0L);

        Mockito.when(service.delete(images.get(0))).thenReturn(true);
        Mockito.when(service.findAll()).thenReturn(entities);

        Assertions.assertAll(
                () -> Assertions.assertEquals(service.delete(images.get(0)), true),
                () -> Assertions.assertEquals(service.findAll().size(), images.size() - 1)
        );
    }
}
