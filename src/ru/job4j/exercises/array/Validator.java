package ru.job4j.exercises.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int nums = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                nums++;

            }
        }
        return nums < data.length / 2;
    }

}
/**
 * 33. Проверка массивов на уникальность элементов.
 * Метод принимает массив целочисленных значений,
 * а также число value, которое мы будем искать в этом массиве.
 * Метод должен посчитать количество одинаковых элементов которые
 * совпадают с value, и если окажется что это число больше или равно
 * половине длины входного массива - массив считается невалидным и
 * метод должен вернуть false.
 */
