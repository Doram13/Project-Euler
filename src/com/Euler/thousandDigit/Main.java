package com.Euler.thousandDigit;

import java.util.Arrays;


public class Main {


    private static int firstProduct = 0;
    private static int secondProduct = 0;
    private static int startingIndex = 0;
    static int[] numbers = new int[13];
    private static String thousandDigit = "73167176531330624919225119674426574742355349194934" +
            "96983520312774506326239578318016984801869478851843" +
            "85861560789112949495459501737958331952853208805511" +
            "12540698747158523863050715693290963295227443043557" +
            "66896648950445244523161731856403098711121722383113" +
            "62229893423380308135336276614282806444486645238749" +
            "30358907296290491560440772390713810515859307960866" +
            "70172427121883998797908792274921901699720888093776" +
            "65727333001053367881220235421809751254540594752243" +
            "52584907711670556013604839586446706324415722155397" +
            "53697817977846174064955149290862569321978468622482" +
            "83972241375657056057490261407972968652414535100474" +
            "82166370484403199890008895243450658541227588666881" +
            "16427171479924442928230863465674813919123162824586" +
            "17866458359124566529476545682848912883142607690042" +
            "24219022671055626321111109370544217506941658960408" +
            "07198403850962455444362981230987879927244284909188" +
            "84580156166097919133875499200524063689912560717606" +
            "05886116467109405077541002256983155200055935729725" +
            "71636269561882670428252483600823257530420752963450";

    public static void main(String[] args) {

        for(int i = 0; i < thousandDigit.length()-12; i++) {
            secondProduct = Character.getNumericValue(thousandDigit.charAt(i)) * Character.getNumericValue(thousandDigit.charAt(i+1)) *
                    Character.getNumericValue(thousandDigit.charAt(i+2)) * Character.getNumericValue(thousandDigit.charAt(i+3)) *
                    Character.getNumericValue(thousandDigit.charAt(i+4)) * Character.getNumericValue(thousandDigit.charAt(i+5)) *
                    Character.getNumericValue(thousandDigit.charAt(i+6)) * Character.getNumericValue(thousandDigit.charAt(i+7)) *
                    Character.getNumericValue(thousandDigit.charAt(i+8)) * Character.getNumericValue(thousandDigit.charAt(i+9)) *
                    Character.getNumericValue(thousandDigit.charAt(i+10)) * Character.getNumericValue(thousandDigit.charAt(i+11)) *
                    Character.getNumericValue(thousandDigit.charAt(i+12));
            if (secondProduct > firstProduct)
            {
                firstProduct=secondProduct;
                startingIndex = i;
            }
        }
        for (int i2 = 0; i2 < 11 ; i2++) {
            numbers[i2] = Character.getNumericValue(thousandDigit.charAt(startingIndex + i2));
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(firstProduct);
        }
    }



/*
        Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 */
