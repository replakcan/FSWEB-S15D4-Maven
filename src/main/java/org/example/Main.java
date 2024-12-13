package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(checkForPalindrome("I did, did I?")); // true
        System.out.println(checkForPalindrome("Racecar")); // true
        System.out.println(checkForPalindrome("hello")); // false
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?")); // true
        System.out.println(checkForPalindrome("Test")); // false
        System.out.println(checkForPalindrome("Welcome")); // false
    }
    public static boolean checkForPalindrome(String input) {
        if (input == null || input.isEmpty()) return false;
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            char startChar = Character.toLowerCase(input.charAt(start));
            char endChar = Character.toLowerCase(input.charAt(end));
            if (!Character.isLetterOrDigit(startChar)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(endChar)) {
                end--;
                continue;
            }
            if (startChar != endChar) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }

}