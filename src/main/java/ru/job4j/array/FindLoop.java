package ru.job4j.array;

/*В этой задаче мы познакомимся
с классическим способом поиска элемента в массиве.*/
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;

            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rsl = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rsl = i;
                break;
            }

        }
        return rsl;
    }
}
   /* Способ действительно очень простой. Итак, у нас задан
   массив элементов, и нам необходимо найти индекс
   элемента, удовлетворяющего условию.
   Решение этой задачи сводится к последовательному
   перебору каждого элемента. Если элемент подходит
    под условие, мы останавливаем цикл и возвращаем
    индекс нашего элемента.
    */