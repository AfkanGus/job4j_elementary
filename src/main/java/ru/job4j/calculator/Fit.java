package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womenWeight(short height) {
        double rls = (height - 110) * 1.15;
        return rls;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Идеальный вес мужчины равен " + man + " кг.");
        double women = Fit.womenWeight(height);
        System.out.println("Идеальный вес женщины равен " + women + " кг.");
    }
}
