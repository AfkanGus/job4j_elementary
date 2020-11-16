package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        //Cоздаем довухмерный массив с четырмя вложенными массивами
        //Каждый из чет-ех влож.мас. имеет по 1,2,3,4 элемента
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < numbers.length; i++) {
            //размер массива каждого элемента
            System.out.println(numbers[i].length);
        }
    }
}
