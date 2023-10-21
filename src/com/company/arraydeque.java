package com.company;

import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(3);
        ad1.add(37);
        ad1.add(22);
        ad1.addFirst(59);
        ad1.offerFirst(29);
        ad1.pollLast();
        ad1.pollFirst();
        ad1.peekFirst();
        ad1.peekLast();
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.contains(37));
        System.out.println(ad1.contains(3));
    }
}
