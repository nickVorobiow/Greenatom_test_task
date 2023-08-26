package com.company.util;

public class Swap {
    public static void swap(int firstVariable, int secondVariable) {
        firstVariable ^= secondVariable;
        secondVariable ^= firstVariable;
        firstVariable ^= secondVariable;

        System.out.println("first variable = " + firstVariable +
                "\nsecond variable = " + secondVariable);
    }
}
