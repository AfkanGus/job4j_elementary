package ru.job4j.array.arrayExer;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class SortTest {
    @Test
    public void whenSorted() {
        assertThat(Sort.isSorted(new int[]{1, 2, 3}), is(true));
    }

    @Test
    public void whenNotSorted() {
        assertThat(Sort.isSorted(new int[] {1,3,2}),is(false));
    }
}