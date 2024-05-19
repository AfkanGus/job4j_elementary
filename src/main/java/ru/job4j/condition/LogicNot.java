package ru.job4j.condition;

//Демонстрация логического отрицания !
public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return num < 0;
    }

    public boolean notEvenAndPositive(int num) {
        return !isEven(num) & (num > 0);
    }

    public boolean evenOrNoPositive(int num) {
        return (num % 2 == 0) || (num < 0);
    }
}
