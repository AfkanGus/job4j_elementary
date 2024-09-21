package ru.job4j.words.to.text;

public class StrBuildDelete {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("carrot");

        str.delete(2, 5);
        System.out.println(str);
    }
}
