package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(" Размер масисва ages  равен " + ages.length);
        String[] surnames = new String[100500];
        System.out.println(" Размер масисва surname  равен " + surnames.length);
        float[] prices = new float[40];
        System.out.println(" Размер масисва prise  равен " + prices.length);
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Vladimir Putin";
        names[2] = "Lev Tolstoy";
        names[3] = "Ivan Bunin";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
