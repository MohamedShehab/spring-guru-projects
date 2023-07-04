package com.guru.spring5webapp.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {
    public static void main(String[] args) {

        Integer[] num = {1, 8, 5, 7};
        int target = 5;
        List<Integer> list = Arrays.asList(num);
        List<Integer> newList = list.stream().filter(integer -> integer != target).toList();
        System.out.println(newList);
    }
}
