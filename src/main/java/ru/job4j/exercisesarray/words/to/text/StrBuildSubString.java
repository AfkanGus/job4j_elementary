package ru.job4j.exercisesarray.words.to.text;

public class StrBuildSubString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Forest");
        String firstTwo = str.substring(2);
        System.out.println(firstTwo);
        String onlyFirst = str.substring(0, 2);
        System.out.println(onlyFirst);
    }
}
