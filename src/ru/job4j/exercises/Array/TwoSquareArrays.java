package ru.job4j.exercises.Array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] res = new int[left.length * left.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i][j] >= right[i][j]) {
                    res[count] = left[i][j];
                } else {
                    res[count] = right[i][j];
                }
                count ++;
            }
        }
        return res;
    }
}
/*
* 29. Двумерные массивы в одномерный массив.
Метод принимает 2 двумерных квадратных массива.
* Вам необходимо реализовать метод который осуществит конвертацию
* двумерного массива в одномерный, при этом необходимо выполнить условия:
* при переборе двумерных массивов осуществить сравнение элементов, которые
*  стоят на местах с одинаковыми индексами, и вернуть максимальное из
* сравниваемых значений. Максимальное из двух значений необходимо вставить
* в результирующий массив.*/