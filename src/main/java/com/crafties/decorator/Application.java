package com.crafties.decorator;

public class Application {

    public static void main(String[] args) {
        Box<String> box = new UniqueItemBox<>(new NonNullItemBox<>(new SimpleBox<>(10)));
        box.add("Banana");
        box.add(null);
        box.add("Papaya");
        box.add("Papaya");
        box.add("Apple");

        box.stream().forEach(System.out::println);
    }
}
