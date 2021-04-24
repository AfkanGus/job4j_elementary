package ru.job4j.exercises.array;

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
        int[] rsl = new int[String.valueOf(number).length()];
        int i = 0;
        do {
            rsl[i++] = number % 10;
            number /= 10;
        } while (number > 0);
        return rsl;
    }
}



