package ru.job4j.exercisesarray.words.to.text;

public class StrBuildReplace {
    //replace - метод принимает два индекса и заменяет символы в этом диапазоне
    public static void main(String[] args) {
        //create new StringBuilder
        StringBuilder str = new StringBuilder("abc");

        //Replace second character with "xyz";
        str.replace(1, 2, "xyz");
        System.out.println(str);
    }
}
