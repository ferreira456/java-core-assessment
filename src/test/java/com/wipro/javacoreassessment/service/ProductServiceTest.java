package com.wipro.javacoreassessment.service;

import com.wipro.javacoreassessment.model.Product;
import com.wipro.javacoreassessment.model.variant.tshirt.TShirt;
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
import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
    @Mock
    private ProductService service;

    private List<TShirt> tShirts;

    @BeforeEach
    void setUp() {
        if (tShirts == null) {
            tShirts = new ArrayList<>();
        } else {
            tShirts.clear();
        }

        for (int i = 0; i < 3; i++) {
            tShirts.add(new TShirt((long) i, "TShirt " + i, i + 1.0, "Description " + i,
                    null, i, null, null, null, null, null));
        }
    }

    @Test
    void save() {
        Mockito.when(service.save(tShirts.get(0))).thenReturn(tShirts.get(0));
        Mockito.when(service.save(tShirts.get(1))).thenReturn(tShirts.get(1));
        Mockito.when(service.save(tShirts.get(2))).thenReturn(tShirts.get(2));

        Assertions.assertAll(
                () -> Assertions.assertSame(service.save(tShirts.get(0)), tShirts.get(0)),
                () -> Assertions.assertSame(service.save(tShirts.get(1)), tShirts.get(1)),
                () -> Assertions.assertSame(service.save(tShirts.get(2)), tShirts.get(2))
        );
    }

    @Test
    void findById() {
        Mockito.when(service.findById(tShirts.get(0).getId())).thenReturn(Optional.of(tShirts.get(0)));
        Mockito.when(service.findById(20L)).thenReturn(Optional.empty());

        Assertions.assertAll(
                () -> Assertions.assertEquals(service.findById(tShirts.get(0).getId()), Optional.of(tShirts.get(0))),
                () -> Assertions.assertEquals(service.findById(20L), Optional.empty())
        );
    }

    @Test
    void findAll() {
        Map<Long, Product> products = tShirts.stream().collect(Collectors.toMap(TShirt::getId, Function.identity()));

        Mockito.when(service.findAll()).thenReturn(products);

        Assertions.assertEquals(service.findAll(), products);
    }

    @Test
    void delete() {
        Map<Long, Product> products = tShirts.stream().collect(Collectors.toMap(TShirt::getId, Function.identity()));
        products.remove(0L);

        Mockito.when(service.delete(tShirts.get(0))).thenReturn(true);
        Mockito.when(service.findAll()).thenReturn(products);
        Mockito.when(service.findById(0L)).thenReturn(Optional.empty());

        Assertions.assertAll(
                () -> Assertions.assertEquals(service.delete(tShirts.get(0)), true),
                () -> Assertions.assertEquals(service.findAll().size(), tShirts.size() - 1),
                () -> Assertions.assertEquals(service.findById(0L), Optional.empty())
        );
    }

    @Test
    void findByName() {
        Map<Long, Product> products = Stream.of(tShirts.get(0))
                .collect(Collectors.toMap(TShirt::getId, Function.identity()));

        Mockito.when(service.findByName(tShirts.get(0).getName())).thenReturn(products);

        Assertions.assertEquals(service.findByName(tShirts.get(0).getName()), products);
    }
}