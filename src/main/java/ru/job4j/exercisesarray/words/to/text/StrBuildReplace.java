package ru.job4j.exercisesarray.words.to.text;

public class StrBuildReplace {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");

        str.replace(1, 2, "xyz");
        System.out.println(str);
    }
}
