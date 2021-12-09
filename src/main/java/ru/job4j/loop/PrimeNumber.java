package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        // По умолчанию count 0,который вернется в случаи если не сработает код в цикле for
        int count = 0;
        //Так как 1 не простое число, number = 2
        for (int number = 2; number <= finish; number++) {
            //Используем другой класс для подсчета простых чисел
            if (CheckPrimeNumber.check(number)) {
                //Если number прошла проверку в классе CheckPrimeNumber , то
                count = count + 1;

                //finish = finish + 1;

            }
        }
        return count;

    }
}
