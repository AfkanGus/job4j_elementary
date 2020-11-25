package ru.job4j.condition;
/*
Первое меньше второго
Чтобы проверить, что первое число меньше второго в Java используется оператор "<".
Результат вычисления оператора "<" будет переменная типа boolean.
Пример.
boolean result = first < second;
Допишите программу приведенную ниже. Программа должна вернуть истина, если первое число меньше второго.*/
public class LessThen {
    public static boolean check(int first, int second)  {
        //boolean result = first < second;

      if(first < second) {
           return true;
        }
        return false;
    }
}
