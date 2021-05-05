package ru.job4j.array;

//В этом задании вам нужно реализовать сортировку методом выборки.
// Смысл этого метода в поиске минимального элемента из оставшихся.
public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            //Метод нужен для получения минимально элемента в массиве.
            int min = MinDiapason.findMin(data, i, data.length - 1);
            //Метод нужен, чтобы получить индекс элемента, полученного из метода MinDiapason.findMin.
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            //Если минимальный индкс элемента равен минимальному элементу
            data[index] = data[i];
            //то минимальный эл. равен min
            data[i] = min;
        }
        return data;
    }
}
