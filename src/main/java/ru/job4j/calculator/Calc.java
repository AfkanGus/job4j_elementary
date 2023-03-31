package ru.job4j.calculator;

/**
 * 4.3. Вызов метода без указания класса [#504945 #405811].
 */
public class Calc {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        plus(1, 2);
        minus(3,8);
    }
}
