package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        /**
         *  создается объект Cat типа Animal
         *  , чтобы наглядно показать работу
         *  именно переопределенного метода класса Cat
         */
        Animal cat = new Cat();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        Cat.staticInvoke();
    }
}
