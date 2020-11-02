package ru.job4j.condition;

public class MultiMax {


    public static int max(int first, int second, int third) {


        int result = first;
        if (first > second && first > third) {
            result = second;
        }
        if (second > first && second > third) {
            result = third;
        }
        return result;

    }


    public static void main(String[] args) {
        int rsl = MultiMax.max(1, 4, 2);
        System.out.println(rsl);

    }

}
