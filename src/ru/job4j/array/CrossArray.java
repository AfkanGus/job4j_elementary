package ru.job4j.array;
/*Заданы два числовых массива.
Нужно вывести на консоль числа, которые есть
одновременно в первом и втором массиве.
*/
public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        //Перебираем массив left
        for (int i = 0; i < left.length; i++) {
            //Перебираем массив right
            for (int j = 0; j < right.length; j++) {
                //Если ячейки  c i в left == right
                if (left[i] == right[j]) {
                    System.out.println(left[i]);
                }
            }
        }
    }
}
