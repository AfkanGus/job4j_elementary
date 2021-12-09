package ru.job4j.exercises.array.ramdom.dream;

/**
 * Дан массив призов и положтельное число, которое сгенерировано случайно. Ваша задача
 * получить приз.
 * Например
 * {"автомобиль", "квартира", "билет"} и число = 1 => "автомобиль"
 * <p>
 * {"автомобиль", "квартира", "билет"} и число = 2 => "квартира"
 * <p>
 * {"автомобиль", "квартира", "билет"} и число = 4 => "автомобиль"
 * <p>
 * {"автомобиль", "квартира", "билет"} и число = 99 => "билет"
 */
public class RandomDream {
    public static String random(String[] prizes, int num) {
        int index = num % prizes.length - 1;
        return prizes[index >= 0 ? index : prizes.length - 1];
    }
}
