package com.company;

import java.util.Scanner;
import static com.company.util.PalindromeCheck.isPalindrome;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку для проверки:");
        String stringToCheck = in.nextLine();

        if (isPalindrome(stringToCheck)) {
            System.out.println("Строка является палиндромом");
        }
        else {
            System.out.println("Строка не является палиндромом");
        }
    }
}
