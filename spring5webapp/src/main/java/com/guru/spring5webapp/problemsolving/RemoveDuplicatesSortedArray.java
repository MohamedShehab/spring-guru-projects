package com.guru.spring5webapp.problemsolving;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {

        Integer[] numbs = {1,1,1,25,8,5,25,25,3,8};
        List<Integer> list = Arrays.asList(numbs);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
