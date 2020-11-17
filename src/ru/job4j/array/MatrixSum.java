package ru.job4j.array;

//Сложить все элементы двухмерного массива.
public class MatrixSum {
    public static int sum(int[][] array) {
        //Вернуть rsl если значние в for будет false
        int rsl = 0;
        //В циклах находим элементы двухмерного массива.
        //Цикл проверяет значения строки row массива array до значения
        // длины массива array,увеличиваясь на 1 при
        // каждом прогоне с 0 до array.length.
        for (int row = 0; row < array.length; row++) {
            //Индексы cell не должны превышать значения длины массива, который находится по индексам row в массиве array
            for (int cell = 0; cell < array[row].length; cell++) {
                //Складываем все элементы двухмерного массва
                rsl = array[row][cell] + rsl; // rsl +=
            }
        }
        return rsl;
    }
}
