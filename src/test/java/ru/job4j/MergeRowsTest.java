package ru.job4j;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeRowsTest {
    @Test
    public void test() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = MergeRows.merge(input);
        assertArrayEquals(expected, out);
    }
}