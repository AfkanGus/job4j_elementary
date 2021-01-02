package ru.job4j.exercises.Array;

public class SwapCols {
    public static void swap(int[][] data,int src, int dst)   {
        for (int i = 0; i < data[dst].length; i++) {
            int rsl = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = rsl;
        }

    }
}
/*24. Переставить два столбца в матрице
Ваша задача переставить два столбца в квадратной матрице. src, dest
это индексы столбцов*/