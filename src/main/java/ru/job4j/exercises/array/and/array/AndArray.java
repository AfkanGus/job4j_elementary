package ru.job4j.exercises.array.and.array;

import java.util.Arrays;

/**
 * 46. Пересечение множеств
 * Множество - это набор уникальных элементов.
 * Пересечение множеств - это такая операция, когда
 * в результирующее множество попадают только элементы,
 * которые есть в обоих множествах. Если нет такие элементов,
 * то результат пустое множество.
 * Ваша задача реализовать данную операцию в коде. Множества заданы массивами
 * <p>
 * Например,
 * <p>
 * {1, 2} и {3, 4} => {}, нет общих элементов
 * <p>
 * {1, 2} и {1, 3, 4} => {1}, 1 общий элемент
 * <p>
 * {1, 2} и {1, 2, 3, 4} => {1, 2}, 1 и 2 общие элементы
 */
public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] min = left.length >= right.length ? right : left;
        int[] max = left.length >= right.length ? left : right;
        int[] rsl = new int[min.length];
        int size = 0;
        for (int i = 0; i < min.length; i++) {
            for (int j = 0; j < max.length; j++) {
                if (min[i] == max[j]) {
                    rsl[size] = min[i];
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
