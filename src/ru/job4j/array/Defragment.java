package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array){
        //Здесь ищем ячейки с null, если на шли то в if
        for (int index = 0; index < array.length; index++) {
            //Здесь сравнваем,если ячейка array[index] это null
            if (array[index] == null){
                //то переменной point присваиваем значения индексов
                int point = index;
                //Здес ищем не с null
                for (int i = point + 1; i < array.length; i++) {
                    //если есть ячейки с индексами не равное null, т,е. не пустые
                    if(array[i] != null){
                        //то меняем ячейки
                        array[point] = array[i];
                        array[i] = null;
                        break;
                    }
                }
            }
            System.out.println(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input ={"I",null,"wanna",null,"compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length ; index++) {
            System.out.println(compressed[index] + " ");
        }
    }
}
