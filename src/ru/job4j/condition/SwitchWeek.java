package ru.job4j.condition;

public class SwitchWeek {

    public static String nameOfDay(int day) {

        String name;

        switch (day) {
            case 1:
                name = "Понедельник";

                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг ";
                break;
            case 5:
                name = "Пятницы";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресние";
                break;
            default:
                name = "Error";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        String pon = SwitchWeek.nameOfDay(1);
        System.out.println(pon);
        String vt = SwitchWeek.nameOfDay(2);
        System.out.println(vt);
        String sr = SwitchWeek.nameOfDay(3);
        System.out.println(sr);
        String cht = SwitchWeek.nameOfDay(4);
        System.out.println(cht);
        String pt = SwitchWeek.nameOfDay(5);
        System.out.println(pt);
        String sb = SwitchWeek.nameOfDay(6);
        System.out.println(sb);
        String vs = SwitchWeek.nameOfDay(7);
        System.out.println(vs);
        String def = SwitchWeek.nameOfDay(8);
        System.out.println(def);

    }
}

