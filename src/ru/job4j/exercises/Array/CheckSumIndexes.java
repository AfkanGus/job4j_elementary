package ru.job4j.exercises.Array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                }
            }
        }


        int[] num = new int[data.length * data[0].length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] != 0) {
                    num[count] = data[i][j];
                    count++;
                }
            }
        }

        return Arrays.copyOf(num, count);
    }
}
/*



*35. Исключить элементы из двумерного массива.
Необходимо реализовать метод который вернет одномерный массив,
* который не будет содержать значений 0 (необходимо использовать
*  метод Arrays.copyOf()). При этом исходные данными будут
*  следующими:
1. Квадратный двумерный массив целочисленных значений data.
2. Целочисленный элемент sum, который означает сумму индексов
*  в массиве.
При этом необходимо чтобы выполнились следующие условия:
1. Если сумма индексов при переборе двумерного массива равна sum,
*  то элемент с такими индексами должен принять значение 0.
2. Выходной одномерный массив не должен содержать значения 0. */
