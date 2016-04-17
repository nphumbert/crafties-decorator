package com.crafties.decorator;

import java.util.stream.Stream;

public class UniqueItemBox<T> implements Box<T> {

    private final Box<T> target;

    public UniqueItemBox(Box<T> target) {
        this.target = target;
    }

    @Override
    public void add(T item) {
        if (contains(item)) {
            return;
        }

        target.add(item);
    }

    @Override
    public boolean isFull() {
        return target.isFull();
    }

    @Override
    public Stream<T> stream() {
        return target.stream();
    }
}
