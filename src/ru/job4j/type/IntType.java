package ru.job4j.type;
/*В Java есть 8 примитивных типов. int описывает число от числа от - 2 в степени 31 до 2 в степени 31 минус 1.

Ниже приведен код. Программа получает от пользователя число в диапазоне int и выводит его на консоль.

Поправьте программу, чтобы она компилировалась.*/

import java.util.Scanner;
public class IntType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Присваеваем переменно значение введеного числа
        //Метод nextInt() считывает и возвращает введенное число
        int value = in.nextInt();
        System.out.println(value);
    }
}
