package ru.job4j.condition;


public class Point {
    //Метод для расчета дистанции
    public static double distance(int x1, int y1, int x2, int y2) {

        double first = Math.pow((x2 - x1), 2);
        double second = Math.pow((y2 - y1), 2);
        double rsl = first + second;
        System.out.println(Math.sqrt(rsl));
        return rsl;

    }
    public static void main(String[] args) {
        //Вызов метода distance для расчета растояния между точками
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result(0,0) to (2,0) " + result);

    }
}
//Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));