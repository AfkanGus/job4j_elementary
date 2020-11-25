package ru.job4j.array;
/* Даны два отсортированных по возрастанию массива.
Как без сортировки их объединить в третий массив?*/
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, h = 0;
        while (i < left.length && j < right.length) {
            rsl[h++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            rsl[h++] = left[i++];
        }
        while (j < right.length) {
            rsl[h++] = right[j++];
        }
        return rsl;
    }
}