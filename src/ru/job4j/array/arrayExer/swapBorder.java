package ru.job4j.array.arrayExer;

public class swapBorder {
    public static int[] swBor(int[] array){
        int temp = array[0];
        array[0] = array[array.length -1];
        array[array.length -1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nams = new int[]{1,2,3,4,5,6};

        int[] rsl = swBor(nams);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i]);
        }
    }
}
