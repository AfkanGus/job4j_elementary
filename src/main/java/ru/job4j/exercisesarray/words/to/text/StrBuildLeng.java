package ru.job4j.exercisesarray.words.to.text;

public class StrBuildLeng {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("magic");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        /**
         * setLength - изменить длину, когда хотим сократить количество символов
         */
        str.setLength(3);
        System.out.println(str);

        /**
         * Вместимость
         */
        StringBuilder str2 = new StringBuilder(100);
        for (int i = 0; i < 25; i++) {
            str.append("1234");

        }
        System.out.println(str.length());

        /**
         * reverse - обратное преобразование
         */
        StringBuilder str3 = new StringBuilder();
        str3.append("abc");
        str3.reverse();
        System.out.println(str3);
    }
}
