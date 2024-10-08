package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * GPT. Нейросети спешат на помощь. [#505156]
 */
public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortThreeNumber() {
        int[] input = new int[]{2, 1, 3};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortFiveNumber() {
        int[] input = new int[]{6, 5, 8, 7, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{4, 5, 6, 7, 8};
        assertThat(result, is(expect));
    }
}