package com.guru.spring5webapp.service;

import java.util.Arrays;

public class Task3 {

    public String solution(int number) {
        StringBuilder sb = new StringBuilder();
        int charRepetear = 0;
        int uniqueCharWord = 0;
        int base = 96;
        for (int i = 26; i >= 1; i--) {
            if (number % i == 0) {
                charRepetear = number / i;
                uniqueCharWord = i;
                System.out.println(uniqueCharWord + " - " + charRepetear);
                break;
            }
        }
        for (int i = 1; i <= uniqueCharWord; i++) {
            char[] chars = new char[charRepetear];
            Arrays.fill(chars, (char) (i + base));
            sb.append(chars);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

      Task3 task3 = new Task3();
        System.out.println(task3.solution(5));

    }
}
