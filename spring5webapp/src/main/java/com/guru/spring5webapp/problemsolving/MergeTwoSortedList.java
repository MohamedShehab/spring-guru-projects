package com.guru.spring5webapp.problemsolving;

import java.util.*;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        System.out.println(list1);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);

        List<Integer> newList1 = new ArrayList<>(list1);
        List<Integer> newList2 = new ArrayList<>(list2);

        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(newList1);
        mergedList.addAll(newList2);
        Collections.sort(mergedList);
        System.out.println(mergedList);

    }
}
