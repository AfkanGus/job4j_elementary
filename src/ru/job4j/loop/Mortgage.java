package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;

        while (amount > 0) {
            //к сумме кредита прибавить сумму с процентной ставкой, это будет сумма кредита за год
            amount += (amount * percent / 100);
            // из суммы кредита за год отнять годовой доход, остаток будет суммой, для оплаты в следующем году
            amount -= salary;
            //при этих расчетов, срок кредита увеличить на год
            year++;
        }
        return year;
    }
}
