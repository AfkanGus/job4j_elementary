package ru.job4j.array.array_exer;

public class Tur {
    public static int[] bac(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] r = bac(nums);
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
        }
    }
}
