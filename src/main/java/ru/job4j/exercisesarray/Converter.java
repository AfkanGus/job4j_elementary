package ru.job4j.exercisesarray;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int countElem = 0;
        for (int[] row : array) {
            countElem += row.length;
        }
        int size = (int) Math.ceil(Math.sqrt(countElem));
        int[][] rsl = new int[size][size];
        for (int row = 0, rowRsl = 0, cellRsl = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                rsl[rowRsl][cellRsl] = array[row][cell];
                cellRsl++;
                if (cellRsl == size) {
                    cellRsl = 0;
                    rowRsl++;
                }
            }
        }
        return rsl;
    }
}
/*
* 31. Конвертировать неквадратный двумерный массив в квадратный.
*
Метод принимает двумерный массив у которого число рядов и число
* элементов в ряду не совпадают, также количество элементов в
* каждом ряду может быть абсолютно произвольным.
Вам необходимо реализовать метод так, чтобы на выходе получился
*  двумерный квадратный массив. При этом размерность выходного массива
*  должна рассчитываться. Если для полного заполнения выходного массива
*  в исходном массиве не хватает элементов - необходимо дополнить массив 0.
Например:
Исходный массив {{1}, {2, 3, 4}} - должно получиться {{1, 2}, {3, 4}}
Исходный массив {{1}, {2, 3, 4}, {5, 6}} - должно получиться {{1, 2, 3}, {4, 5, 6}, {0, 0, 0}}*/