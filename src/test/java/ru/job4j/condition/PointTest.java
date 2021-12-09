package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when50to40then2() {
        Point a = new Point(5, 0);
        Point b = new Point(4, 0);
        double out = a.distance(b);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to30then2() {
        Point a = new Point(2, 0);
        Point b = new Point(3, 0);
        double out = a.distance(b);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when600to100then3() {
        Point a = new Point(6, 0, 0);
        Point b = new Point(1, 0, 0);
        double out = a.distance3d(b);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }
}
