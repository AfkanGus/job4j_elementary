package ru.job4j.array.arrayExer;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import ru.job4j.array.Square;

public class OneTest {
    @Test
    public void whenBound3Then14() {
        int bound = 3;
        int[] rsl = Square.calculate(bound);
        int[] expect = new int[]{0, 1, 4};
        assertThat(rsl, is(expect));
    }
}