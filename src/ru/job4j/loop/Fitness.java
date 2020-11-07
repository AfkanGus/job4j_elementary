package ru.job4j.loop;

import ru.job4j.calculator.Fit;

public class Fitness {
    public static int calc(int ivan, int nik){

        //Количество месяцев по умолчанию
        int month = 0;
        while (ivan < nik) {
            //Если тяга ивана меньше, то количествоо месцев увеличивается
            month +=1;
            // Иван увеличивает тягу в 3 раза
            ivan *= 3;
            // Ник в два раза
            nik *=2;
            System.out.println(ivan);
            }

        //Выйти из цикла если ivan > nik
         while (ivan > nik) break;

        return month;
    }
    }


