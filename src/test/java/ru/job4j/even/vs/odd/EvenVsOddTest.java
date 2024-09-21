package ru.job4j.even.vs.odd;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenVsOddTest {
    @Test
    public void whenWinOdd() {
        assertEquals(2, ru.job4j.exercisesarray.even.vs.odd.EvenVsOdd.whoWin(new int[]{5, 10, 4, 3}));
    }

    @Test
    public void whenWiEven() {
        assertEquals(1, ru.job4j.exercisesarray.even.vs.odd.EvenVsOdd.whoWin(new int[]{10, 5, 4, 3}));
    }

    @Test
    public void whenNobody() {
        assertEquals(0, ru.job4j.exercisesarray.even.vs.odd.EvenVsOdd.whoWin(new int[]{6, 5, 4, 5}));
    }

}