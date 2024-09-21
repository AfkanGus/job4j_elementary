package ru.job4j;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int count = (int) Math.ceil(Math.sqrt(array.length));
        int[][] res = new int[count][count];
        for (int i = 0, row = 0, cell = 0; i < array.length; i++) {
            res[row][cell] = array[i];
            cell++;
            if (cell == count) {
                cell = 0;
                row++;
            }
        }
        return res;

    }
}
/*
 * 30. Превратить одномерный массив в двумерный.
 *  Метод принимает массив целочисленных значений.
 *  Необходимо реализовать метод, который превратит
 *  одномерный массив в квадратный двумерный.
 *  Напомню, что квадратный двумерный массив - это массив,
 *  в котором число рядов и элементов в каждом ряду одинаково.
 *  При этом если элементов в исходном массиве не хватает, чтобы
 * заполнить весь двумерный массив - необходимо заполнить его 0.
 * */