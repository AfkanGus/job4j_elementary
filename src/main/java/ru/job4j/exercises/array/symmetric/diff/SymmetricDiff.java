package ru.job4j.exercises.array.symmetric.diff;

import java.util.Arrays;

/**
 * 49. Симметрическая разность множеств
 * Симметрическая разность - это такая операция, когда в результирующее
 * множество попадают все элементы из обоих множеств, кроме тех, которые есть и в том и в другом множествах.
 * <p>
 * Ваша задача реализовать эту операцию. Множества заданы в виде массивов.
 * <p>
 * Например,
 * <p>
 * {1}, {2} => {1, 2}
 * <p>
 * {1, 2}, {2, 3} => {1, 3}
 * <p>
 * {1}, {} => {1}
 */
public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int size = findUnique(left, right, rsl, 0);
        size = findUnique(right, left, rsl, size);
        return Arrays.copyOf(rsl, size);
    }

    private static int findUnique(int[] left, int[] right, int[] rsl, int size) {
        for (int i = 0; i < left.length; i++) {
            boolean needToAdd = true;
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    needToAdd = false;
                    break;
                }
            }
            if (needToAdd) {
                rsl[size++] = left[i];
            }
        }
        return size;
    }
}
