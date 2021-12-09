package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        //Объявляем массив, из size ячеек, и в каждой из size ячеек, содержится
        // массив из size ячеек
        int[][] table = new int[size][size];
        //Перебираем строки массива до значения его длины
        for (int row = 0; row < table.length; row++) {
            //Перебираем ячейки в строках массива
            for (int cell = 0; cell < table[row].length; cell++) {
                //Находим элементы row , cell массива table
                //Т.к.первая ячейка индекса начинается с 0, а умножение на 0 дает ноль
                //то нужно к ячейке прибавить 1, что бы сдвинуть умножение.
                table[row][cell] = (row + 1) * (cell + 1);
                System.out.println(table[row][cell]);
            }
        }
        return table;
    }
}
