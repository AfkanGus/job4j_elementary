package ru.job4j.array;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class Sequence {
    //Заполнить массив цифрами от 1 до 9.
    public static void main(String[] args) {
        //Объявлен двойной массив типа int 3 на 3, где в кажной
        // из 3 ячеек будет массив из 3 ячеек
        int[][] array = new int[3][3];
        //Заполняем первую ячейку из трех.
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        //Вторая ячейка из трех.
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        //Третья ячейка из трех.
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

    }
}
