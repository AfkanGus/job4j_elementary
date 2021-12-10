package ru.job4j.calculator;
/**
 * 1.9. Статические и не статические методы [#504806 #237734]
 */
public class Calculator {

    private static final int X = 5;

    /**
     * @param a - параметр статического метода, принимающий число int
     * @return разницу
     */
    public static int minus(int a) {
        return a - X;
    }

    /**
     * @param d - параметр нестатического метода
     */
    public int divide(int d) {
        return d / X;
    }

    /**
     * @param y - параметр статического метода
     */
    public static int sum(int y) {
        return X + y;
    }

    public int multiply(int a) {
        return X * a;
    }

    public int sumAllOperations(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int minusRsl = calculator.multiply(10);
        int divideRls = calculator.divide(25);
        int sumRsl = Calculator.sum(5);
        int multiRsl = sum(5);
        int sumAllOperations = calculator.sumAllOperations(3);
        System.out.println("sum = " + sumRsl);
        System.out.println("minus = " + minusRsl);
        System.out.println("multiply = " + multiRsl);
        System.out.println("divide = " + divideRls);
        System.out.println("all operations = " + sumAllOperations);

    }
}
