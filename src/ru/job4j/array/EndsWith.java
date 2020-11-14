package ru.job4j.array;

public class EndsWith {
    /* метод endsWith проверяет то, что слово заканчивается
    на определенную последовательность.*/
    public static boolean endsWith(char[] word,char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            /*Если последлений индекс массива  word c вычитом из него i(обрашение к
             * предыдушему элементу, не равное  post*/
            if(word[word.length -1 -i] != post[post.length -1 -i])
                /*вернем false*/
                return false;
        }
        return result;
    }
}
