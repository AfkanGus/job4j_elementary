package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        //Меняю местами один и пять
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        //Меняю местами два и три
        int tt = array[1];
        array[1] = array[2];
        array[2] = tt;
        //Меняю местами пять и четире
        int pch = array[3];
        array[3] = array[4];
        array[4] = pch;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
