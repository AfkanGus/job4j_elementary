package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        // Объявляем целочисленный массив из 4 эл.
        int[] numbers = new int[4];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }

        for (int index = 0; index < numbers.length; index++) {

            //Вывод на консоль
            System.out.println(numbers[index]);
        }
    }
}
