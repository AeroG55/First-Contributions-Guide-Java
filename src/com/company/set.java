package com.company;

import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(88,2.8f);
        myHashSet.add(4);
        myHashSet.add(4);
        myHashSet.clear();
        myHashSet.add(55);
        myHashSet.add(12);
        myHashSet.add(2);
//        myHashSet.clear();
        System.out.println(myHashSet);
    }
}
