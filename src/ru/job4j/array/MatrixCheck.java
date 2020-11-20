package ru.job4j.array;

/*В этом задании нужно проверить то, что строка в
двухмерном массиве целиком заполнена символом 'X'.*/
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

    /* Нужно сделать аналогичный метод, который проверит,
    чтобы все элементы в колонке были заполнены символом 'X'.*/
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /*Нужно будет заполнить одномерный массив элементами
    диагонали из двухмерного массива.*/
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            /* Элементы диагонали имеют одинаковое значение индексов.*/
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    /*В этом задании вам нужно будет написать код проверки
     выигрышной ситуации в игре сокобан.*/
    /*Метод, который проверяет, находится ли на поле выигрышная ситуация.*/
    public static boolean isWin(char[][] board) {
        boolean result = false;
        //Перебираем ячеки, ищем Х,он долже быть по диагонали,
        // если нашли, то в  if проверяем
        for (int index = 0; index < board.length; index++) {
            //Если все элементы в строке и столбце(вызав методы проверки заполнения
            // 'X' в строке и столбце)содержат элеметы 'Х', вернуть true
            if (board[index][index] == 'X') ;
            {
                if (MatrixCheck.monoHorizontal(board, index) || MatrixCheck.monoVertical(board, index)) {
                    result = true;
                    //Принудительно завершить цикл
                    break;
                }
            }
        }
        return result;
    }
}

