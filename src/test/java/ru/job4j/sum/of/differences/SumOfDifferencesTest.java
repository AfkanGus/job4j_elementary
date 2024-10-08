package ru.job4j.sum.of.differences;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfDifferencesTest {
    @Test
    public void test() {
        assertEquals(9, SumOfDifferences.sum(new int[]{10, 2, 1}));
        assertEquals(2, SumOfDifferences.sum(new int[]{3, 2, 1}));
        assertEquals(4, SumOfDifferences.sum(new int[]{5, 4, 3, 2, 1}));
        assertEquals(4, SumOfDifferences.sum(new int[]{5, 3, 1}));
    }
}