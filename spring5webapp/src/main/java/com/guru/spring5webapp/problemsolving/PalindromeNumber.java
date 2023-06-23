package com.guru.spring5webapp.problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeNumber {
    public boolean checkPalind(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        List<Integer> leftDigits = new ArrayList<>();
        List<Integer> rightDigits = new ArrayList<>();
        for (int i = 0; i <= digits.length - 1; i++) {
            leftDigits.add((int) digits[i]);
        }
        for (int j = digits.length-1; j > -1; j--) {
            rightDigits.add((int) digits[j]);
        }
        for (Integer leftDigit : leftDigits) {
            for (Integer rightDigit : rightDigits) {
                return Objects.equals(leftDigit, rightDigit);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int x = 123;
        System.out.println(palindromeNumber.checkPalind(x));

    }
}
