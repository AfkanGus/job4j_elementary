package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i;

        for (i = 0; i <= 5; i++) {

            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        //int rsl = Counter.sum(0, 5);
        // System.out.println(rsl);
        System.out.println(sum(0, 5));
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));


    }
}
