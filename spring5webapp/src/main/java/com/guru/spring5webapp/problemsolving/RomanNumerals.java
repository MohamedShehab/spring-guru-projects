package com.guru.spring5webapp.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    static int romanToInt(String x) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < x.length(); i++) {
            if (i < x.length() - 1 && m.get(x.charAt(i)) < m.get(x.charAt(i + 1))) {
                ans -= m.get(x.charAt(i));
            } else {
                ans += m.get(x.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(RomanNumerals.romanToInt("VVX"));
    }
}
