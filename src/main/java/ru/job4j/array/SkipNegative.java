package ru.job4j.array;

public class SkipNegative {

    //Метод skip должен заменить отрицательные значения в массиве на ноль.
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                //Если мас.ячеек row,cell менше 0, т.е. отрицательны, то заменить их на 0
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;

                }
            }
        }
        return array; //Вернуть значение array в метод
    }
}
