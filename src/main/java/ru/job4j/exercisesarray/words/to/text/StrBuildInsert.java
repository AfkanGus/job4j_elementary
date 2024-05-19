package ru.job4j.exercisesarray.words.to.text;

public class StrBuildInsert {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        str.insert(2, "xyz");
        System.out.println(str);
    }
    /**
     * StringBuilder имеет изменяемый буфер. Таким образом,
     * мы можем быстро добавлять или вставлять данные. Он получает
     * два аргумента: индекс и значение, которое мы хотим вставить.
     * Индекс: это первый аргумент. Чтобы вставить после второго
     * символа, используйте значение 2. А для вставки в начале используйте ноль.
     * Строка: мы передаем строку (или другое значение)
     * в качестве второго аргумента. Это данные, которые помещаются в стрингбилдер.
     */
}
