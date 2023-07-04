package com.guru.spring5webapp.designpatterns.creational.factory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeSet;

public class Collections {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(5);
        hashSet.add(null);
        System.out.println(hashSet.size());
        System.out.println(hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(1);
        System.out.println(treeSet.size());
        System.out.println(treeSet);

        HashMap<String, Object> map = new HashMap<>();
        map.put("two", 2);
        map.put("one", 1);
        map.put("three", 3);
        System.out.println(map);

        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("two", 2);
        hashtable.put("one", 1);
        hashtable.put("three", 3);
        System.out.println(hashtable);


    }
}
