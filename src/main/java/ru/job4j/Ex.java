package ru.job4j;

public class Ex {
    public static void main(String[] args) {
        String str = "Java";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'v') {
                stringBuilder.append('!');
            }
            stringBuilder.append(str.charAt(i));

        }
        System.out.println(stringBuilder.toString());
    }
}
