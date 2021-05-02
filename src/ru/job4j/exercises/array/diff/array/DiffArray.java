package ru.job4j.exercises.array.diff.array;

import java.util.Arrays;

/**
 * 48. Разность множеств
 * Разность множеств это операция при которой в результирующее
 * множество попадают элементы из первого множества, но только
 * если их нет во втором множестве.
 * Ваша задача реализовать эту операцию в коде. Множества заданы в виде массивов
 * <p>
 * Например,
 * <p>
 * {1}, {2} => {1}
 * <p>
 * {1}, {1} => {}
 * <p>
 * {1, 2}, {2} => {1}
 * <p>
 * {1}, {} => {1}
 */
public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length];
        int size = 0;
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
        return Arrays.copyOf(rsl, size);
    }
}

