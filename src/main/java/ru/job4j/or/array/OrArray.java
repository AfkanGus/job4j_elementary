package ru.job4j.or.array;

import java.util.Arrays;

/**
 * 47. Объединение множеств
 * Объединение множеств это такая операция при которой в результирующее
 * множество попадают элементы, которые есть хотя бы в одном множестве.
 * Ваша задача реализовать эту операцию. Множества заданы в виде массива
 * Например,
 * {1}, {2} => {1, 2}
 * <p>
 * {1, 2}, {2} => {1, 2}
 * <p>
 * {1, 2}, {3} => {1, 2, 3}
 * <p>
 * {1}, {} => {1}
 */
public class OrArray {
    public static int add(int[] rsl, int[] array, int size) {
        for (int i = 0; i < array.length; i++) {
            boolean needAdd = true;
            for (int j = 0; j < rsl.length; j++) {
                if (rsl[j] == array[i]) {
                    needAdd = false;
                    break;
                }
            }
            if (needAdd) {
                rsl[size] = array[i];
                size++;
            }
        }
        return size;

    }

    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int size = add(rsl, left, 0);
        size = add(rsl, right, size);
        return Arrays.copyOf(rsl, size);
    }
}

