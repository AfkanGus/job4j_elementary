package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxFrom2Arg() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxFrom3Arf() {
        int result = Max.max(2, 1, 0);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxFrom4Arg() {
        int result = Max.max(5, 4, 3, 2);
        assertThat(result, is(5));
    }
}
