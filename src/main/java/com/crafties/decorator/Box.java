package com.crafties.decorator;

import java.util.stream.Stream;

public interface Box<T> {

    void add(T item);

    boolean isFull();

    Stream<T> stream();

    default boolean contains(T item) {
        return stream()
                .filter(t -> t.equals(item))
                .findFirst()
                .isPresent();
    }
}
