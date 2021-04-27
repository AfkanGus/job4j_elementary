package ru.job4j.exercises.array;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class FibonacciTest {
    @Test
    public void checkArrayTrue() {
        int[] data = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        boolean rsl = Fibonacci.checkArray(data);
        assertThat(rsl, is(true));
    }

    @Test
    public void checkArrayFalse() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean rsl = Fibonacci.checkArray(data);
        assertThat(rsl, is(false));
    }
}