package com.crafties.decorator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UniqueItemBoxTest {

    @Test
    public void should_not_add_item_when_duplicate() {
        // given
        Box<String> box = new UniqueItemBox<>(new SimpleBox<>(10));

        // when
        box.add("Banana");
        box.add("Banana");

        // then
        assertThat(box.stream().count()).isEqualTo(1L);
    }
}
