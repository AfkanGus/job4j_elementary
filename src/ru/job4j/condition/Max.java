package ru.job4j.condition;
//Создаем классMax
public class Max {
    //Создаем метод, в коротом будет производится сравение
    public static int max(int left, int right) {
        //Объяв.переменную типа boolean
        boolean condition = left > right;
        // в перемен.result будет принимать либо значение left или right
        int result = condition ? left : right;
        //возврашаем ответ
        return result;
    }
    public static void main(String[] args) {
        //перем.rsl передаются значение объявлен. переменых метода max
        int rsl = Max.max(1,2);
        //Вывод результата
        System.out.println(rsl);

    }

}
