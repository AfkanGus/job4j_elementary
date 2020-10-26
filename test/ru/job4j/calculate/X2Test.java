package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {
    @Test
    public void whenA1B1C1X1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 40;
        //Вызов проверяемого метода
        int rsl = X2.calc(a, b, c, x);
        //Сравнение полученного значения с ожидаемым
        Assert.assertEquals(expected, rsl);
    }

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    @Test
    public void whenA0B1C1X1Then40() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        //Ожидаемое значение. Это всегда одна переменная.
        int expected = 40;
        //Вызов проверяемого метода
        int rsl = X2.calc(0,1,1,1);
        //Сравнение полученного значения с ожидаемым
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C0X1Then40() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        //Ожидаемое значение. Это всегда одна переменная.
        int expected = 40;
        //Вызов проверяемого метода
        int rsl = X2.calc(1,1,0,1);
        //Сравнение полученного значения с ожидаемым
        Assert.assertEquals(expected, rsl);

    }

    @Test
    public void whenA1B1C1X0Then40() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        //Ожидаемое значение. Это всегда одна переменная.
        int expected = 40;
        //Вызов проверяемого метода
        int rsl = X2.calc(1,1,1,0);
        //Сравнение полученного значения с ожидаемым
        Assert.assertEquals(expected, rsl);
    }
}