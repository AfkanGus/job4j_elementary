package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AMaxFirstOrLastElementTest {

    @Test
    public void getMaxValueFirstElement() {
        int[] in = {5, 4, 3, 2, 1};
        int expected = 5;
        int rsl = AMaxFirstOrLastElement.getMaxValue(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getMaxValueLastElement() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 5;
        int rsl = AMaxFirstOrLastElement.getMaxValue(in);
        assertThat(rsl, is(expected));
    }
}