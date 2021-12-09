package ru.job4j.array;

/**
 * Метод endsWith проверяет то, что слово заканчивается на определенную
 * последовательность. Если последлений индекс массива  word c вычитом
 * из него i обрашение кпредыдушему элементу, не равное  post,вернем false
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                return false;
            }
        }
        return result;
    }
}
