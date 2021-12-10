package ru.job4j.exercisesarray;

import static org.junit.Assert.*;

import org.junit.Test;

public class UpperCaseTest {
    @Test
    public void test() {
        char[] input = "alpha-123".toCharArray();
        char[] expect = "ALPHA-123".toCharArray();
        assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }
}