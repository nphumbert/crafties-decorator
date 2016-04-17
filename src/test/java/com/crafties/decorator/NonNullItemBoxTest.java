package com.crafties.decorator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NonNullItemBoxTest {

    @Test
    public void should_not_add_item_when_null() {
        // given
        Box<String> box = new NonNullItemBox<>(new SimpleBox<>(10));

        // when
        box.add(null);

        // then
        assertThat(box.stream().count()).isEqualTo(0L);
    }
}
