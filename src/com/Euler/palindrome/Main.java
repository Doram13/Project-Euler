package com.Euler.palindrome;

/* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        Find the largest palindrome made from the product of two 3-digit numbers. */

import java.util.Arrays;

public class Main {
    static int firstDigit;
    static int secondDigit;
    static int product;
    static boolean palindrome = false;
    static String stringProduct;
    static int biggestPalindrome = 0;

    public static void main(String[] args) {
        for (int i = 100; i < 1000 ; i++) {

            for (int i2 = 100; i2 < 1000 ; i2++) {
                product = i * i2;
                palindrome = checkIfPalindrome(product);
                if (palindrome) {
                    if (product > biggestPalindrome) {
                        biggestPalindrome = product;
                        firstDigit = i;
                        secondDigit = i2;
                    }
                }
            }
        }
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " +biggestPalindrome
        + "and it's the product of: " + firstDigit + " and " + secondDigit);
    }

    public static boolean checkIfPalindrome(int integer) {
        stringProduct = String.valueOf(integer);
        return stringProduct.equals(new StringBuilder(stringProduct).reverse().toString());
        }
}
