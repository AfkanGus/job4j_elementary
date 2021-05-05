package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        //Формула для вычисления ((p/2*(k+1)) * k)
        double h = p / (2 * (k + 1));
        System.out.println(h);
        double l = h * k;
        System.out.println(l);
        double s = l * h;
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result1);
    }
}
