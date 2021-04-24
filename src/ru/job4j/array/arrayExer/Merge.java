package ru.job4j.array.arrayExer;

public class Merge {
    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        for (int i = 0; i < c.length; i++) {
           // System.out.println(c[i]);

        }
        return c;
    }
}

