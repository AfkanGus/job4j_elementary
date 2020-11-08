package ru.job4j.loop;

public class CheckPrimeNumber {
    // метод должен вернуть true, если number является простым числом
    public static boolean check(int number) {
        // Переменной prime  по умлчанию true
        boolean prime = true;
        //Цикл проверяет числа от 1 до 2
        for (int i = 2; i < number; i++) {
            // если number делится на i без остатка
            if (number % i == 0) {
                prime = false;
                break;
            }
        }return prime;

    }

}


