package ru.job4j.sum.of.differences;

/**
 * Дан массив чисел, нужно найти сумму разниц пар элементов
 * Напрмер,
 * {3,2,1} => (3-2) + (2-1) = 2;
 * {15,10,5} => (15-10) + (10 -5) => 10;
 */
public class SumOfDifferences {
    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i] - nums[i + 1];
        }
        return sum;
    }
}
