package ru.job4j.condition;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(int id) {
        //Инизиалицируем переменные поля
        this.id = id;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
