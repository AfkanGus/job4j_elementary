package ru.job4j.exercises.array.words.to.text;

public class StrBuildStringBuild {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("cat");
        StringBuilder str2 = new StringBuilder("dog");
        //Combine two StringBuilder
        str.append(str2);
        System.out.println(str);
    }
}
