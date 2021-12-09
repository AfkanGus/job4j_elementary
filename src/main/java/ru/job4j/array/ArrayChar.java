package ru.job4j.array;

public class ArrayChar {
    //Метод проверяет, что слово начинается c определенной последовательности.
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        // В цикле прогоняем все элементы до длины pref
        for (int index = 0; index < pref.length; index++) {
            //В условии  сравнить значения ячеек с одинаковым индексом
            if (word[index] != pref[index]) {
                // Если элемент отличается, значит, word не начинается со слова pref.
                return false;
            }
        }
        return result;
    }
}
