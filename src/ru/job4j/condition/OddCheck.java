package ru.job4j.condition;
/*Проверка числа на нечетность
Для проверки, что два числа НЕ равны друг другу используется оператор !=. В данной задаче нужно проверить, что переданное число является НЕ четным.

Для проверки используйте операторы % и !=

Поздравляем! Задача решена верно!*/
public class OddCheck {
    public static boolean check(int num) {

        return num % 2 != 0;
    }

}
