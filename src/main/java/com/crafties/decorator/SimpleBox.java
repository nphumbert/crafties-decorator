package com.crafties.decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleBox<T> implements Box<T> {

    private final int maxSize;
    private final List<T> items;

    public SimpleBox(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>(maxSize);
    }

    @Override
    public void add(T item) {
        if (isFull()) {
            throw new FullBoxException();
        }

        items.add(item);
    }

    @Override
    public boolean isFull() {
        return items.size() >= maxSize;
    }

    @Override
    public Stream<T> stream() {
        return items.stream();
    }

}
