package com.company;

import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0]=30;
        marks[1]=38;
        marks[2]=49;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {

            System.out.println("Enter the array index: ");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to this world");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist!");
                    System.out.println("Exception in level 2");
//                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
    }
}
