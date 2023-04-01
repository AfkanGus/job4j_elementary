package ru.job4j.inheritance;

/**
 * 6. Вызов переопределенного метода родителя - super.method.
 * Каждый наследник должен добавить к сумме родителя свою стоимость
 * и для этого мы используем вызов super.price()
 */
public class IceCream {
    private int weight;

    public IceCream(int weight) {
        this.weight = weight;
    }

    public int price() {
        return weight * 100;
    }
}
