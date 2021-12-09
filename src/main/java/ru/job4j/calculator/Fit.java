package ru.job4j.calculator;

public class Fit {
    //Метод расчитывающий вес мужчины
    public static double manWeight(short height) {

        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    //Метод расчитывающий вес женщины
    public static double womenWeight(short height) {
        double rls = (height - 110) * 1.15;
        return rls;
    }

    public static void main(String[] args) {
        //Переменная height,хранящая рост
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Идеальный вес мужчины равен " + man + " кг.");
        double women = Fit.womenWeight(height);
        System.out.println("Идеальный вес женщины равен " + women + " кг.");
    }
}
