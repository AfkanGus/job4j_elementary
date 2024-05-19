package ru.job4j.array;

/*начение ячеек source и dest нужно поменять местами.*/
public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int tmp = array[source];
        array[source] = array[dest];
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
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
