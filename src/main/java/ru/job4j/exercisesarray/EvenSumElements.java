package ru.job4j.exercisesarray;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum % 2 == 0;
    }
}
/*
 * Метод принимает массив целочисленных значений.
 * Метод должен определить сумму всех элементов в массиве,
 *  проверить значение суммы является ли оно четным числом.*/