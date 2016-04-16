package com.crafties.decorator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleBoxTest {

    @Test
    public void should_not_be_full_when_empty() {
        // when
        Box<String> simpleBox = new SimpleBox<>(10);

        // then
        assertThat(simpleBox.isFull()).isFalse();
    }

    @Test
    public void should_be_full_when_maximum_size_reached() {
        // given
        Box<String> simpleBox = new SimpleBox<>(1);

        // when
        simpleBox.add("Banana");

        // then
        assertThat(simpleBox.isFull()).isTrue();
    }

    @Test(expected = FullBoxException.class)
    public void should_raise_error_when_add_item_to_full_box() {
        // given
        Box<String> simpleBox = new SimpleBox<>(1);
        simpleBox.add("Pear");

        // when
        simpleBox.add("Apple");
    }

    @Test
    public void should_contain_item_when_previously_added() {
        // given
        Box<String> simpleBox = new SimpleBox<>(10);
        simpleBox.add("Banana");

        // when
        boolean contains = simpleBox.contains("Banana");

        // then
        assertThat(contains).isTrue();
    }

}