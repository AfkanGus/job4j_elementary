package ru.job4j.loop;

public class CheckPrimeNumber {
    // метод должен вернуть true, если number является простым числом
    public static boolean check(int number) {
        //Переменной prime  присуждается number > 1 т.к. 1 не является простым числом
        boolean prime = number > 1;
        //Цикл проверяет числа от 1 до 2
        for (int i = 2; i < number; i++) {
            // если number делится на i без остатка
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}


