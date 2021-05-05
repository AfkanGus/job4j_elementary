package ru.job4j.exercises.array;

public class NonSquareArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1}, {2, 3}, {4, 5, 6}
        };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
/*
* 11. Создание неоднородного двумерного массива.
Познакомимся как создать массив в котором количество элементов
* в каждом ряду отличается от количества рядов в массиве. Такой
* массив называется неоднородным и создается следующим образом
* (например заполним массив целочисленными значениями):
int[][] array = new int[][]{{0, 1}, {10, 20, 30}, {5},
*  {1, 2, 3, 4, 5}};
Необходимо напомнить, что для определения количества элементов
* в ряду, необходимо указать индекс ряда и вызвать поле length.
В задании необходимо расскомментировать код, заполнить массив
* значениями от 1 до 6, при этом:
1. Разбить значения на 3 массива.
2. В первом должен быть 1 элемент, втором - 2 элемента,
*  третьем - 3 элемента.
*/

