package ru.job4j.type;
/*Ниже приведен код. Вам нужно раскоментировать строки и поделить
число 11 нацело на 3 и получить остаток от деления от 3*/
public class DivMod {
    public static void main(String[] args) {
        int num = 11;
        int div = 11 / 3;
        int mod = 11 % 3;
        System.out.println(div);
        System.out.println(mod);
    }
}
/* Целочисленное деление
Помните школьную математику, а именно деление столбиком? Языки программирования поддерживают операции,
используя которые мы можем получить целую часть от деления и остаток от деления.
В Java для этого случае два оператора:
1. / - который находит целую часть от деления
2. % - который находит остаток от деления
Пример
5 / 2 = 2
5 % 2 = 1
 */