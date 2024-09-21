package calculator;

import static math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double difAndDiv(double first, double second) {
        return dif(first, second) + div(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + div(first, second) + dif(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат умножения: " + multiply(10, 20));
        System.out.println("Результат разность: " + dif(10, 20));
        System.out.println("Результат деление: " + div(10, 20));
        System.out.println("Результат деление + разность: " + difAndDiv(10, 20));
        System.out.println("Результат сумма всех операций " + sumAll(10, 20));
    }
}
