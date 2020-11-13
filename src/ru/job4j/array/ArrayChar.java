package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        // В цикле прогоняем все элементы до длины plef
        for (int index = 0; index < pref.length; index++) {
            //В условии сравниваем index
            if (word[index] != pref[index]) {
                return false;
            }
        }
        return result;
    }

}
