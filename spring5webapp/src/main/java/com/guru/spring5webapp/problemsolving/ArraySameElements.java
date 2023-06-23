package com.guru.spring5webapp.problemsolving;

import java.util.Arrays;
import java.util.List;

public class ArraySameElements {
    public static void main(String[] args) {
        Integer[] a1 = {1, 2, 3, 2,1};
        Integer[] a2 = {1, 2, 3, 5};
        System.out.println(sameElements(a1, a2));
    }

    static boolean sameElements(Integer[] a1, Integer[] a2) {
        boolean result = false;
        List<Integer> a1List = Arrays.asList(a1);
        List<Integer> a2List = Arrays.asList(a2);
        List<Integer> differences = a2List.stream().filter(integer -> !a1List.contains(integer)).toList();
        result = differences.size() == 0;
        List<Integer> containElements = a1List.stream().filter(integer -> !a2List.contains(integer)).toList();
        return result && containElements.size() == 0;
    }
}
