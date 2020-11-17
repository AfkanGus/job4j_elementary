package ru.job4j.array;
/*В этом задании нужно проверить то, что строка в двухмерном массиве целиком заполнена символом 'X'.*/
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        //Перебираем все индексы ячейки в массиве board
        for (int index = 0; index < board.length; index++) {
            /*Если все индексы строки и колонки([row][index]) не равны 'X'*/
            if (board[row][index] != 'X') {
                /*то вернем false*/
                result = false;
                break;
            }
        }
        return result;
    }
}
