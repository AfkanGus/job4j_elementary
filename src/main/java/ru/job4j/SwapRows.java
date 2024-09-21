package ru.job4j;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data[src].length; i++) {
            int rsl = data[src][i];
            data[src][i] = data[dst][i];
            data[dst][i] = rsl;
        }
    }
}
/*
* 23. Переставить две строки в матрице
Вам нужно переставить две строки в матрице,
*  с учетом, что длины строк одинаковые. src, dest это индексы строк*/