package ru.job4j.array;

public class Check {
    /*Метод должен проверить, что все элементы в массиве являются true или false.*/
    public static boolean mono(boolean[] data) {
        boolean result = true;
        /*Длина массива data.length - 1, потому что нумератция начинается с 0*/
        for (int index = 0; index < data.length - 1; index++) {
            /* Если ячейка с index не равно ячейки с длиной массива то вернем false */
            if (data[index] != data[data.length - 1]) {
                return false;
            }
        }
        // Если не сработает код в цикла, вернем true
        return result;
    }
}
