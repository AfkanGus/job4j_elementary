package ru.job4j.exercises.Array;

public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != standard) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
/*
* 12. Проверить является ли двумерный массив квадратным.
Надеюсь, что вы усвоили как определять размер двумерного массива
*  и определять количество в каждом его ряду. Напомню:

имя_массива.length - размер массива;

имя_массива[номер_ряда].length - количество элементов в его ряду.

В этом задании Вам необходимо будет проверить является ли
* входящий двумерный массив квадратным (т.е. количество элементов
*  в каждом ряду, должно совпадать с количеством рядов). Вам
*  необходимо:

1. Расскомментировать код.
2. Правильно организовать цикл for.
3. Правильно организовать проверку if.*/