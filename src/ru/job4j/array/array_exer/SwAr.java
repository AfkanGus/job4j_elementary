package ru.job4j.array.array_exer;

public class SwAr {
    public static int[] sw(int[] array, int source, int dest) {
        int t = array[source];
        array[source] = array[dest];
        array[dest] = t;
        return array;

    }

    public static int[] swBour(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swBour(nums);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i]);
        }
        System.out.print("----");
        int[] num = new int[] {1,2,3,4,5,6};
        int[] r = SwAr.sw(num,0,num.length-1);
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
        }

    }
}
