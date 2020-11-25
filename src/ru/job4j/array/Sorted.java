package ru.job4j.array;
/*Задана числовой массив. Необходимо написать программу, которая проверит,
 что массив отсортирован по возрастанию.*/

public class Sorted {
    public static boolean isSorted(int[] array) {
        //Перебираем массив, -1, чтобы не выйти за пределы
     for (int i = 0; i < array.length - 1; i++) {
         //если каждая ячейка следует за ячейкой больше на 1(т.е увеличивается по порядку)
        if (array[i] > array[i + 1]) {

            return false;
        }
    }
        return true;
}
}
