package ru.job4j.exercises.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, z = 0;
        while (i < left.length && j < right.length) {
            rsl[z++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            rsl[z++] = left[i++];
        }
        while (j < right.length) {
            rsl[z++] = right[j++];
        }

        return rsl;
    }
}

/*3. Объединить два отсортированных массива
 Даны два отсортированных по возрастанию массива.
 Как без сортировки их объединить в третий массив?*/