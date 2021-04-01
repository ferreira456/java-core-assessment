package com.wipro.javacoreassessment.service;

import com.wipro.javacoreassessment.model.Collection;
import com.wipro.javacoreassessment.model.Product;
import com.wipro.javacoreassessment.model.variant.pants.Pants;
import com.wipro.javacoreassessment.model.variant.sneaker.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
class CollectionServiceTest {
    @Mock
    private CollectionService service;

    private Map<Long, Product> sneakers;
    private Map<Long, Product> pants;

    private Collection collection1;
    private Collection collection2;

    @BeforeEach
    void setUp() {
        if (sneakers == null) {
            sneakers = new TreeMap<>();
            pants = new TreeMap<>();

            collection1 = new Collection(0L, "Collection 1", "Description 1",
                    Stream.of("sneakers", "shoes").collect(Collectors.toList()), sneakers);
            collection2 = new Collection(1L, "Collection 2", "Description 2",
                    Stream.of("pants", "trousers").collect(Collectors.toList()), pants);
        } else {
            sneakers.clear();
            pants.clear();
        }

        for (int i = 0; i < 3; i++) {
            sneakers.put((long) i, new Sneaker((long) i, "Sneaker " + i, i * 10.0, "Description " + i,
                    null, i * 10, null, null, null, null, null));
            pants.put((long) i, new Pants((long) i, "Pants " + i, i * 10.0, "Description " + i,
                    null, i * 10, null, null, null, null, null));
        }
    }

    @Test
    void findByKeywords() {
        List<String> keywords1 = Stream.of("sneakers", "shirts").collect(Collectors.toList());
        List<String> keywords2 = Stream.of("pants", "shoes").collect(Collectors.toList());
        List<String> keywords3 = Stream.of("hats", "glasses").collect(Collectors.toList());

        Map<Long, Collection> find1 = Stream.of(collection1)
                .collect(Collectors.toMap(Collection::getId, Function.identity()));
        Map<Long, Collection> find2 = Stream.of(collection1, collection2)
                .collect(Collectors.toMap(Collection::getId, Function.identity()));

        Mockito.when(service.findByKeywords(keywords1)).thenReturn(find1);
        Mockito.when(service.findByKeywords(keywords2)).thenReturn(find2);
        Mockito.when(service.findByKeywords(keywords3)).thenReturn(Collections.emptyMap());

        Assertions.assertAll(
                () -> Assertions.assertEquals(service.findByKeywords(keywords1), find1),
                () -> Assertions.assertEquals(service.findByKeywords(keywords2), find2),
                () -> Assertions.assertEquals(service.findByKeywords(keywords3), Collections.emptyMap())
        );
    }

    @Test
    void findProduct() {
        List<String> keywords1 = Stream.of("sneakers", "shirts").collect(Collectors.toList());
        Map<Long, Collection> find1 = Stream.of(collection1)
                .collect(Collectors.toMap(Collection::getId, Function.identity()));

        Product product1 = sneakers.get(0L);

        Mockito.when(service.findByKeywords(keywords1)).thenReturn(find1);

        Assertions.assertAll(
                () -> Assertions.assertEquals(service.findByKeywords(keywords1), find1),
                () -> Assertions.assertTrue(find1.containsKey(product1.getId()))
        );
    }
}
