package ru.job4j.words.to.text;

public class StrBuildStringBuild {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("cat");
        StringBuilder str2 = new StringBuilder("dog");
        str.append(str2);
        System.out.println(str);
    }
}
