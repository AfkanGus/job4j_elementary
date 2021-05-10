package ru.job4j.exercises.array.positive.or.negative;

/**
 * 55.Четное или нечетное количество отрицательных значений
 * Метод принимает массив цлочисленных значений.
 * При этом массив может содержать как положительные значения,так и отрицательные,
 * но не может содержать 0.
 * Необходимо реализовать метод таким образом,
 * чтобы он вернул булево значение следующим образом:
 * 1. true - количество отрицательных значений в массиве нечетное число;
 * <p>
 * 2. false - количество положительных значений в массиве четное число.
 */
public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int valueNegativeOdd = 0;
        int valuePositiveEven = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                valuePositiveEven++;
            } else {
                valueNegativeOdd++;
            }
        }
        if (valueNegativeOdd % 2 != 0) {
            return true;
        }
        return false;
    }
}
