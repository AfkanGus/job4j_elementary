package ru.job4j.array;

public class ArrayLoopForEarch {
    public static void main(String[] args) {
        // Объявляем целочисленный массив из 4 эл.
        int[] numbers = new int[4];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }

        //Имя переменной ind выбрано произвольно
        for (int ind : numbers) {

            //Вывод на консоль, ind
            System.out.println(ind);
        }
    }
}
