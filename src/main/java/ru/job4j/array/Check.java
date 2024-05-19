package ru.job4j.array;

public class Check {
    /*Метод должен проверить, что все элементы в массиве являются true или false.*/
    public static boolean mono(boolean[] data) {
        boolean result = true;
       
        for (int index = 0; index < data.length; index++) {
            /* Если ячейка с index не равно ячейки с длиной массива то вернем false */
            if (data[index] != data[data.length - 1]) {
                return false;
            }
        }
        return result;
    }
}
