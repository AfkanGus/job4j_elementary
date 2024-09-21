package ru.job4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Автомат размена купюр.
 */
class ChangeMachineTest {
    @Test
    public void testGetChangeVariantsFor10() {
        ChangeMachine changeMachine = new ChangeMachine();
        int[][] expected = {
                {1, 0, 0, 0},
                {0, 2, 0, 0},
                {0, 1, 2, 1},
                {0, 0, 5, 0}
        };

        List<int[]> result = changeMachine.getChangeVariants(10);
        Assertions.assertArrayEquals(expected, result.toArray());
    }

    @Test
    public void testGetChangeVariantsFor5() {
        ChangeMachine changeMachine = new ChangeMachine();
        int[][] expected = {
                {0, 1, 0, 0},
                {0, 0, 2, 1}
        };

        List<int[]> result = changeMachine.getChangeVariants(5);
        Assertions.assertArrayEquals(expected, result.toArray());
    }

    @Test
    public void testGetChangeVariantsFor1() {
        ChangeMachine changeMachine = new ChangeMachine();
        int[][] expected = {
                {0, 0, 0, 1}
        };

        List<int[]> result = changeMachine.getChangeVariants(1);
        Assertions.assertArrayEquals(expected, result.toArray());
    }

    @Test
    public void testGetChangeVariantsForInvalidAmount() {
        ChangeMachine changeMachine = new ChangeMachine();
        int[][] expected = {};

        List<int[]> result = changeMachine.getChangeVariants(0);
        Assertions.assertArrayEquals(expected, result.toArray());
    }
}