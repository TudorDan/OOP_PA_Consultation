package com.paconsult;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(20, 7, 2020);
        Milk milk = new Milk("ZuZu", 1, date);
        System.out.println(milk.isExpired());
    }
}
