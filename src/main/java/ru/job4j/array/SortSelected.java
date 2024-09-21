package ru.job4j.array;

/**
 * GPT. Нейросети спешат на помощь.[#505156]
 * В этом задании вам нужно реализовать сортировку методом выборки.
 * Смысл этого метода в поиске минимального элемента из оставшихся.
 */
public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            data[index] = data[i];
            data[i] = min;
        }
        return data;
    }
}
