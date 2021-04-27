package ru.job4j.array.array_exer;

public class One {
    public static int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int i = 0; i < bound; i++) {
            rsl[i] = i * i;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] array = calculate(3);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}