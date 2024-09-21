package ru.job4j.words.to.text;

public class StrBuildAppendAppend {
    public static void main(String[] args) {
        int val = 300;
        double val2 = 3.14;
        short val3 = 5;
        char val4 = 'A';

        StringBuilder str = new StringBuilder();
        str.append(val).append("\n");
        str.append(val2).append("\n");
        str.append(val3).append("\n");
        str.append(val4).append("\n");

        String rsl = str.toString();
        System.out.println(rsl);
    }
}
