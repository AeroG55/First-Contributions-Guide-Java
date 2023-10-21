package com.company;

import java.util.ArrayList;
import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer>l2 = new LinkedList<>();
        l2.add(27);
        l2.add(0,26);
        l2.add(57);
        l2.add(17);
        l2.add(97);
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(1);
        l1.add(0,3);
        l1.add(0,2);
        l1.addAll(0,l2);
        l1.addLast(55);
        l1.addFirst(85);
        System.out.println(l1.contains(5));

        System.out.println(l1.indexOf(17));
        System.out.println(l1.indexOf(333));      // Gives -1 as output
        System.out.println(l1.indexOf(3));
        System.out.println(l1.lastIndexOf(3));
//        System.out.println(l1.remove(3));
        l1.set(1,99);
        System.out.println(l1.isEmpty());
        System.out.println(l1.iterator());
//        l1.clear();
//
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
