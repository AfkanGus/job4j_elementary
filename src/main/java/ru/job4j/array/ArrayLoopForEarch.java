package ru.job4j.array;

public class ArrayLoopForEarch {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int ind : numbers) {
            System.out.println(ind);
        }
    }
}
