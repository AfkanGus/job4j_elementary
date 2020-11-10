package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        // rsl хранит
        int rst = -1;
        //Перебираем элементы массива до rst
        for (int index = 0; index >= rst; index++) {

            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;

    }

}
