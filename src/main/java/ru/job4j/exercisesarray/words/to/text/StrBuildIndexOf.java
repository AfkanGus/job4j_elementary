package ru.job4j.exercisesarray.words.to.text;

public class StrBuildIndexOf {
    /**
     * IndexOf - для поска подстраки в данных.Если срока найдена первый
     * индекс, в котором она всречается, возвращается как int.
     */
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        int rsl = str.indexOf("bc");
        System.out.println(rsl);
        int rsl2 = str.indexOf("de");
        System.out.println(rsl2);
    }
    /**
     * Мы используем метод indexOf для поиска подстроки в данных.
     * Если подстрока найдена, первый индекс, в котором она встречается,
     * возвращается как int.
     * Не найдено: если подходящая подстрока не найдена, возвращается
     * отрицательное значение. Мы должны часто проверять -1 при использовании indexOf.
     */
}
