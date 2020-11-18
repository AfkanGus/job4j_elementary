package ru.job4j.array;

/*В этой задаче мы познакомимся
с классическим способом поиска элемента в массиве.*/
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        // rsl хранит
        int rst = -1;
        //Перебираем элементы массива до длины массива
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;

            }
        }
        return rst;
    }

    //Нужно сделать поиск по массиву,но не во
    //всем массиве, а только в указанном диапазоне.
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rsl = -1;
        //Перебираем эл.массива в диапозоне от start - finish
        for (int i = start; i <= finish; i++) {
            //Если длина последнего эл.мас. с вычетом предедушего ровна
            //el то вернуть значение эл. i
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