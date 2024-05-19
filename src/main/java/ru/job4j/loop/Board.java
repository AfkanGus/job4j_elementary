package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row <= height; row++) {
            for (int cell = 0; cell <= width; cell++) {
                /*сумма строки и ячейки деленная на 2 без остатка*/
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(2, 2);
        System.out.println();
        paint(4, 4);
    }
}
