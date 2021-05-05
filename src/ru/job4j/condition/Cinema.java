package ru.job4j.condition;

public class Cinema {

    public static void permission(boolean allowByParent, boolean hasMoney) {
        //Если у нас имеются alowByParent и hasMany, то мы посещаем кино, иначе- не посешаем
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema");
        } else {
            System.out.println("i can't");
        }
    }

    public static void main(String[] args) {
        //иницилизация метода с аргументами true и false
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
