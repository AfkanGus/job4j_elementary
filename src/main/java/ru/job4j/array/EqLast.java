package ru.job4j.array;

/**
 * В этом задании нужно написать программу,
 * которая сравнивает последние элементы массивов.
 * Если последние элементы у массивов равны, то нужно
 * вернуть true. В противном случае - false.
 */
public class EqLast {
    public static boolean check(int[] left, int[] right) {
        /*Получаем последние элементы массива length -1, и если они равны то  вернет true*/
        return left[left.length - 1] == right[right.length - 1];

    }
}
