package ru.job4j.loop;

public class CounterDemo {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i;
        for (i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        int i;
        for (i = 0; i <= 10; i++) {

            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
