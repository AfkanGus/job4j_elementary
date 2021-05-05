package ru.job4j.loop;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class CounterDemoTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = CounterDemo.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToFifeThenThirty() {
        int rsl = CounterDemo.sumByEven(1, 5);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
}