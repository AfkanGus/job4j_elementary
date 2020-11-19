package ru.job4j.array;

import java.util.Arrays;

//В этом задании нужно реализовать
// механизм возврата монет в лендинговых аппаратах.
public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    //метод возврата монет
    public int[] change(int money, int price) {
        //Создаем массив rsl в 100 ячеек
        int[] rsl = new int[100];
        int size = 0;
        //переменая для хранения значения сдачи
         int change =   money - price;
         //перебираем монеты нашего массива
        for (int i = 0; i < coins.length; i++) {
            //если остаток от сздачи больше или равно нулю
            while (change - coins[i] >= 0) {
                //То берем наибольший и вычитаем из суммы
                change -= coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
        //обрезаем массив rsl по счетчику Size - т.е. останется
        // столько элементов, какое значение имеет счетчик size
        return Arrays.copyOf(rsl, size);
    }
}
