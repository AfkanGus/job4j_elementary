package ru.job4j.array;

/*В этом задании нужно найти минимум в массиве в диапазоне индексов.*/
public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        //
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}

