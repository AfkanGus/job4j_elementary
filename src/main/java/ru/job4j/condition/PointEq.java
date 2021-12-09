package ru.job4j.condition;

public class PointEq {
    //Метод eq проверяет, что две точки в системе координат одинаковы.
    public static boolean eq(int x1, int y1, int x2, int y2) {
        // Возвращаем boolean перемнную
        return (x1 == x2) && (y1 == y2);

        /*
        boolean eqX = x1 == x2;
        boolean eqY = y1 == y2;
        if (eqX && eqY) {
            return true;
        } else {
            return false;
        }
         */
    }

    public static void main(String[] args) {
        System.out.println(eq(1, 1, 2, 2));
        System.out.println(eq(10, 10, 10, 10));
        /*
        boolean rsl = PointEq.eq(1,1,2,2);
        System.out.println(rsl);
        boolean rsl1 = PointEq.eq(10,10,10,10);
        System.out.println(rsl1);
        */

    }
}
