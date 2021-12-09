package ru.job4j.exercises.array.even.vs.odd;

/**
 * 53. Четные vs Нечетные.
 * Вам даны очки игроков. Игроки разделись таким образом,
 * что под четными индексами находятся очки первой команды,
 * под нечетными второй. Ваша задача определить, кто выиграл.
 * Выигрывает та команда, которая набрала наибольшее число очков.
 * Если выиграла первая команда, то нужно вернуть 1, если вторая,
 * то 2, если ничья то 0.
 */
public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int firstEven = 0;
        int secondOdd = 0;
        int rsl = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 != 0) {
                firstEven += players[i];
            } else {
                secondOdd += players[i];
            }
        }
        if (firstEven > secondOdd) {
            rsl = 2;
        } else if (secondOdd > firstEven) {
            rsl = 1;
        }
        return rsl;
    }
}
