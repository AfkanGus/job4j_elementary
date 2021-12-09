package ru.job4j.exercises.array.split;

import java.util.Arrays;

/**
 * Работа метода split()
 */
public class MainOne {
    public static void main(String[] args) {
        /**
         * Ведуший разделитель.
         * вариации работы метода split с символом разделителя в конце и/или начале исходной строки:
         */
        print("I love java".split(" "));
        print(" I love java".split(""));
        print("I love java ".split(""));
        print(" i love java ".split(" "));
        System.out.println("---------------------");

        /**
         * Нам нужно разбить строку на слова. Мы видим, что в данной строке
         * слова разделены друг от друга пробелами. Пробел — идеальный кандидат
         * на роль разделителя в данном случае.
         */
        String str = "I love Java";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("---------------");

        /**
         * limit>0 - параметр, какое количество раз шаблон regex будет применяться к исходной строке.
         */
        print("I love Java".split(" ", 1));
        print("I love java".split(" ", 2));
        System.out.println("--------------------------");
        /**
         * limit < 0,
         *Шаблон для поиска разделителя применяется к строке столько раз,
         * сколько это возможно. Длина итогового массива может быть любой.
         */
        print("i love java ".split(" ", -1));
        print("i love java ".split(" ", -2));
        print("i love java ".split(" ", -12));
        System.out.println("-------------------------");

        String userInfo = "135|bender|bender@gmail.com";
        System.out.println(getUserEmail(userInfo));
        System.out.println("--------------");
        String orderInfo = "1,огурцы,20.05;2,помидоры,123.45;3,зайцы,0.50";
        System.out.println(getTotalOrderAmount(orderInfo));
    }

    static double getTotalOrderAmount(String orderInfo) {
        double totalAmount = 0d;
        final String[] items = orderInfo.split(";");
        for (String item : items) {
            final String[] itemInfo = item.split(",");
            totalAmount += Double.parseDouble(itemInfo[2]);
        }
        return totalAmount;

    }

    /**
     * нужно экранировать этот символ с помощью двух обратных слешей.
     * return data[data.length - 1];
     */
    static String getUserEmail(String userInfo) {
        String[] data = userInfo.split("\\|");
        return data[data.length - 1];
    }

    static void print(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
