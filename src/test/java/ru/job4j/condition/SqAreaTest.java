package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {
    @Test
    public void whenP6andK2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4andK1() {
        int expected = 0;
        int p = 1;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}

