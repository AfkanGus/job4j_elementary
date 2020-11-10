package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        //При помоши оператора new создаем и присваиваем переменной
        //ссылку массива
        int[] rsl = new int[bound];
        // перебираем значения index до bound
        for (int index = 0; index < bound; index++) {
            //значнения index возводим в квадрат, тем самым//bound т.к. явлеяется ссылкой массива
            rsl[index] = index * index;
        }
        return rsl;
    }

    public static void main(String[] args) {

        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

    }
}