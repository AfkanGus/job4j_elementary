package ru.job4j.exercisesarray.words.to.text;

/**
 * StringBuilder - класс для добалвления строк, повторно использует буфер.
 */
public class StrBuildAppend {
    public static void main(String[] args) {
        //Create a new StringBuilder
        StringBuilder str = new StringBuilder();
        //Loop and append values.
        for (int i = 0; i < 5; i++) {
            str.append("adv ");
        }
        String rsl = str.toString();
        System.out.println(rsl);

    }
}
