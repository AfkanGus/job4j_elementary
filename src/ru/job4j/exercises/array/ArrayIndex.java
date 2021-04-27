package ru.job4j.exercises.array;

public class ArrayIndex {
    public static int getFirstElement(int[] array) {
        int rsl = array[0];
        return rsl;
    }

    public static int getLastElement(int[] array) {
        int rsl = array[array.length-1];
        return rsl;
    }
}
/*
* 5. Индексы в массивах
Доступ к элементам в массивах осуществляется
* при помощи индексов, которые являются целочисленными значениями.
*  При этом индексация начинается с 0 и заканчивается значением
* имя_массива.length - 1.
В задании необходимо расскомментировать, расставить
* значения индексов так, чтобы первый метод возвращал первый
* элемент массива, а второй метод - последний элемент массива. */