package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    public PointTest() {
    }

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 2.0D;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to22then2() {
        Point a = new Point(2, 1);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        double expected = 1.0D;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to01then1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        double out = a.distance(b);
        double expected = 1.0D;
        Assert.assertEquals(expected, out, 0.01);
    }
}
