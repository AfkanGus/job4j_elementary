package ru.job4j.exercises.array.words.to.text;

public class StrBuildSubString {
    public static void main(String[] args) {
        //substring - подсрока, извлекать диапазон символов в новую строку.
        //Первый агрумент - это начальный индекс желаемой подстроки,
        //Второй аргумент - это последний индекс.
        StringBuilder str = new StringBuilder();
        str.append("Forest");

        //Get substring after the first two characters
        String firstTwo = str.substring(2);
        System.out.println(firstTwo);

        //Get only the first two characters in a substring
        String onlyFirst = str.substring(0, 2);
        System.out.println(onlyFirst);
    }
}
