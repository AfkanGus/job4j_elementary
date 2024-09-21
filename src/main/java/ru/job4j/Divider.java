package ru.job4j;

/**
 * 58. Кратность числа
 * Метод принимает два параметра:
 * <p>
 * 1. Целочисленное значение num;
 * <p>
 * 2. Массив целочисленных значений ints.
 * <p>
 * Необходимо проверить являются ли все элементы массива ints,
 * делителями числа num, если являются - то метод должен вернуть true.
 */
public class Divider {
    public static boolean check(int num, int[] ints) {
        for (int index : ints) {
            if (num % index != 0) {
                return false;
            }
        }
        return true;
    }
}
