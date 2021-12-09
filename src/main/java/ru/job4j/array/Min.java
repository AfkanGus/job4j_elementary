package ru.job4j.array;

/*В этом задании нужно найти минимальное число в массиве.*/
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
//Решение поиска минимума сводится к выбору предполагаемого максимума.
            //Елси перемен.min > ячейки array с индеском index, то
            //элемент массива записывается в эталон эл. массива т.е. в min
            if (min > array[index]) {
                //элемент массива записывается в эталон эл. массива т.е. в min
                min = array[index];
            }
        }
        return min;
    }
}

