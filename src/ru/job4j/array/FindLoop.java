package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        // rsl хранит
        int rst = -1;
        //Перебираем элементы массива до длины массива
        for (int index = 0; index < data.length; index++) {

            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;

    }

}
