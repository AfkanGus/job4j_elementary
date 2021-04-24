package ru.job4j.exercises.array.words.to.text;

/**
 * 42. Объединение слов
 * Дан массив слов, необходимо получить текст из этих слов, разделенных пробелом.
 * <p>
 * Например,
 * <p>
 * {"one", "two", "three"} => "one two three"
 */
public class WordsToText {
    public static String convert(String[] words) {
        String result = " ";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            str.append(words);
        }
        return str.toString().trim() + result;

    }
}


