package ru.job4j.exercises.array;

public class OddPrint {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }

    }
}
/*
* 19. Вывести нечетные в порядке возрастания индексов
Дан целочисленный массив размера N. Вывести все
* содержащиеся в данном массиве нечетные числа в порядке
*  возрастания их индексов. Для вывода использовать
*  System.out.println()*/