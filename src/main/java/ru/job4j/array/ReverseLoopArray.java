package ru.job4j.array;

/*В этом коде внутри цикла нужно добавить проверку, чтобы в
 консоль выводились элементы только с четными индексами.*/
public class ReverseLoopArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            /*Оброщаемся к последленму индексу массива и вычитаем из него i(обрашение к
            * предыдушему элементу*/
            if (numbers[numbers.length - 1 - i] % 2 == 0) {
                System.out.println("Четные элементы массива " + numbers[numbers.length - 1 - i]);
            }
        }
    }
}

