package ru.job4j.exercisesarray.words.to.text;

public class StrBuildDelete {
    //delete - удаление, передаем два аршумента int, первый - начальный индекс С которого
    //должно начинаться удаление, втоой - конечный идекс

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("carrot");

        //Delete characters form index 2 to index 5;
        str.delete(2, 5);
        System.out.println(str);
    }
}
