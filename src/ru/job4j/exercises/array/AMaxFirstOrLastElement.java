package ru.job4j.exercises.Array;

public class AMaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
      /*  int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[0] < array[array.length - 1]) {
                return array[array.length - 1];
            } else {
                return array[0];
            }
        }
        return count;
    }*/
        int rs = array[0] > array[array.length - 1] ? 5 : array.length;
        return rs;
    }
}
/*
* 7. Максимум из первого и последнего элемента массива
В этом задании продолжим закреплять индексацию в массиве,
*  а также то, что первый элемент имеет индекс 0, а последний
*  имя_массива.length - 1.

Вам необходимо реализовать метод, который принимает массив
* целочисленных значений, сравнивает между собой первый и
* последний элемент и возвращает максимальное из двух
* значений.*/