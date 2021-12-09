package ru.job4j.array;

/*В этом задании нужно найти минимум в массиве в диапазоне индексов.*/
public class MinDiapason {
//Решение поиска минимума сводится к выбору предполагаемого максимума.
    public static int findMin(int[] array, int start, int finish) {
        //
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            //Проверяем что эталон больше чем элемент
            if (min > array[i]) {
                // и записываем элемент в переменую
                min = array[i];
            }
        }
        return min;
    }
}

