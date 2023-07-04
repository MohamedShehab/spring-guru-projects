package com.guru.spring5webapp.problemsolving;

import java.util.Arrays;

public class IndexFirstOccurrence {

    public static int checkIndexFirstOccurrence(String str, String target) {
        int index = 0;
        if (!str.contains(target)) {
            index = -1;
        } else {
            for (int i = 0; i <= str.length() - target.length(); i++) {
                if (str.substring(i, i + target.length()).compareTo(target) == 0)
                    index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String name = "mohamed";
        String character = "ed";
        System.out.println(checkIndexFirstOccurrence(name, character));
    }
}
