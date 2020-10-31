package ru.job4j.condition;

class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        //если hasMoney || beFriend - true то все выражение true
        if ( hasMoney || beFriend ) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}