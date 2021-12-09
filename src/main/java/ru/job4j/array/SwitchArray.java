package ru.job4j.array;

/*начение ячеек source и dest нужно поменять местами.*/
public class SwitchArray {
    //Метод будет менять местами произвольные элементы.
    public static int[] swap(int[] array, int source, int dest) {
        //array[source] - значение ячейки с индексом source
        int tmp = array[source];
        //array[dest] -значение ячейки с индеком dest
        array[source] = array[dest];
        //значение ячейки с индеком dest передаются временной переменой tmp
        array[dest] = tmp;
        return array;
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static int[] swapBorder(int[] array) {
        /*Создаю temp для  временного хранения значений ячейки с индиксом 0.*/
        int temp = array[0];
        /* Записываем в ячейку с 0, значение элемента array.length - 1
         * array.length - 1 - отнимаем 1, что бы предотвратит ошибку выхода за
         * пределы массива на последней итерации */
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        //Метод swapBorder - меняет местами нулевой элемент и последний элемент в массиве.
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
