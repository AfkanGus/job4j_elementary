package ru.job4j.exercises.Array;

import sun.security.util.ArrayUtil;

/**
 * 41. Массив цифр
 * Дано число int. Нужно получить массив из его цифр в обратном порядке.
 * <p>
 * Например
 * <p>
 * 12345 => {5, 4, 3, 2, 1}
 */
public class NumberToArray {
    public static int[] resolve(int number) {
        int[] rsl = new int[]{5, 4, 3, 2, 1};
        // int[] rsl = new int[String.valueOf(number).length()];
        int[] r = new int[rsl.length];
        for (int i = 0; i < rsl.length / 2; i++) {

            int temp = rsl[i];

        }

        return rsl;
    }

}
       /* int i = 0;
        do {
            rsl[i++] = number % 10;
            number /= 10;
        } while (number > 0);
        return rsl;*/


