package ru.job4j.array.arrayExer;

public class Check {
   public static boolean mon(boolean[] data){
       boolean rsl = true;
       for (int i = 0; i < data.length; i++) {
           if(data[i] != data[data.length -1]){
               return false;
           }
       }

       return rsl;
   }

    public static void main(String[] args) {
        boolean[] in = new boolean[]{true, true, true};
        boolean r = mon(in);
        System.out.println(r);

    }
}
