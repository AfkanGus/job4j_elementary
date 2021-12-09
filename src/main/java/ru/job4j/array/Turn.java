package ru.job4j.array;

public class Turn {
    /*Метод должен перевернуть массив задом наперёд. */
    public static int[] back(int[] array) {
        /*index < array.length / 2 - означает, что элемент массива проверяется на четность и не четность*/
        for (int index = 0; index < array.length / 2; index++) {
            /*Получить первый элемент, поменять с последним(array.length - index - 1)
             через временную переменную.*/
            int t = array[index];
            /*то же самое с элементами index array.length - index - 1 */
            array[index] = array[array.length - index - 1];
            /* присваиваем временной переменной t значения index*/
            array[array.length - index - 1] = t;
        }
        return array;
    }
}
