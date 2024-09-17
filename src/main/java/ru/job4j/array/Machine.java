package ru.job4j.array;

import java.util.Arrays;

/*В этом задании нужно реализовать
 механизм возврата монет в лендинговых аппаратах.*/
public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int i = 0; i < coins.length; i++) {
            /*если остаток от сздачи больше или равно нулю*/
            while (change - coins[i] >= 0) {
                change -= coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
