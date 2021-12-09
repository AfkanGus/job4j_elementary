package ru.job4j.condition;

//Демонстрация логического отрицания !
public class LogicNot {

    //метод isEven() - проверяет, что число четное,
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    //isPositive() -  проверяет, что число положительное.
    public boolean isPositive(int num) {
        return num > 0;
    }

    //метод notEven(), проверяет, что число нечетное
    public boolean notEven(int num) {
        return !isEven(num);
    }

    //метод notPositive(), проверяет, что число не положительное
    public boolean notPositive(int num) {
        return num < 0;
    }

    //метод notEvenAndPositive(), проверяет, что число нечетное и положительное
    public boolean notEvenAndPositive(int num) {
        return !isEven(num) & (num > 0);
    }

    //метод evenOrNotPositive(), проверяет, что число четное или не положительное
    public boolean evenOrNoPositive(int num) {
        return (num % 2 == 0) || (num < 0);
    }
}
