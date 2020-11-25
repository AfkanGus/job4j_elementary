package ru.job4j.condition;
/*
Чтобы проверить, что первое число больше второго
в Java используется оператор ">".
Результат вычисления оператора ">" будет
Пример.
boolean result = first > second;
Допишите программу приведенную ниже. Программа
должна вернуть истина, если первое число больше второго.*/
public class GreatThen {
    public static boolean check(int first, int second) {
        if(first > second) {
            return true;
        }
        return false;
    }

}
