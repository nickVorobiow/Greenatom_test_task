package com.company;

import static com.company.util.Swap.swap;

public class Task2 {

    public static void main(String[] args) {
        int firstVariable = -1;
        int secondVariable = 7;

        System.out.println("first variable = " + firstVariable +
                "\nsecond variable = " + secondVariable);

        System.out.println("Обмен местами:");
        swap(firstVariable, secondVariable);
    }

}
