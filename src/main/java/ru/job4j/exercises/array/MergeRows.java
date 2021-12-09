package ru.job4j.exercises.array;

public class MergeRows {
    public static int[] merge(int[][] data) {

        int length = 0;
        for (int i = 0; i < data.length; i++) {
            length += data[i].length;
        }
        int[] rsl = new int[length];
        for (int i = 0, count = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                rsl[count++] = data[i][j];
            }
        }
        return rsl;
    }
}


/*25. Объединить строки квадратного массива
Дана квадратная матрица. Ваша задача объединить ее
строки в один массив
Например, для {{1, 2}, {3, 4}} получить {1, 2, 3, 4}*/