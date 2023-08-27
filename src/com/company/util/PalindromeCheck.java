package com.company.util;

public class PalindromeCheck {

    public static boolean isPalindrome(String stringToCheck) {
        boolean isPalindrome = true;
        int length = stringToCheck.length();

        for (int index = 0; index < length / 2; index++) {
            if (stringToCheck.charAt(index) != stringToCheck.charAt(length - 1 - index))
                isPalindrome = false;
        }

        return isPalindrome;
    }

}
