package ru.job4j.array;

public class ArrayChar {
    //Метод проверяет, что слово начинается c определенной последовательности.
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                return false;
            }
        }
        return result;
    }
}
