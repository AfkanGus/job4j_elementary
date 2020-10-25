package ru.job4j.condition;

public class TrgArea {

    public static double area( double a, double b, double c){
        //Вычисление полупериметра p
        double p = (a+b+c) / 2;
        //Вывод результата p
        System.out.println(p);
        //Вычиселение плош.трг. по ф.Герона
        double rsl = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        return rsl;
    }
    public static void main(String[] args) {
        //Вызов метода area
        double rsl = TrgArea.area(2,2,2);
        //Вывод значения площади
        System.out.println(rsl);

    }
}

