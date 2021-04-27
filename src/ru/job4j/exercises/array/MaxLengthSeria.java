package ru.job4j.exercises.Array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int oneSequence = 1;
        int twoSequence = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                twoSequence++;
            } else {
                oneSequence = Math.max(twoSequence, oneSequence);
                twoSequence = 1;
            }
        }
        return Math.max(twoSequence, oneSequence);
    }
}





