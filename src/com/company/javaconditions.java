package com.company;
//import java.util.Scanner;
//public class javaconditions{
//    public static void main(String[] args) {
//        boolean a = true;
//        boolean b = false;
//        if (a && b){
//            System.out.println("TRUE");
//        }
//        else{
//            System.out.println("FALSE");
//        }
//
//        boolean y = true;
//        boolean z = false;
//        if (y || z){
//            System.out.println("TRUE");
//        }
//        else{
//            System.out.println("FALSE");
//        }
//
//        boolean p = false;
//        System.out.println(!p);
//
//    }


       // SWITCH CASE


//        int age;
//        System.out.println("Enter your age=");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//
//        switch (age) {
//            case 18 -> System.out.println("adult");
//            case 21 -> System.out.println("adult adult");
//            case 30 -> System.out.println("super adult");
//            default -> System.out.println("nothing");
//        }
//
//
//                 // If-else ladder
//
//
//        if (age>22)
//        {
//            System.out.println("adult");
//        }
//        else if (age>18)
//        {
//            System.out.println("child");
//        }
//        else{
//            System.out.println("baby");
//        }
//
import java.util.Scanner;
        public class javaconditions{
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                int x = s.nextInt();
                int y = s.nextInt();
                int z = s.nextInt();
                int result = 0;
                if (x>y){
                    if (x>z){
                        System.out.println(x);
                    }
                }
                if(y>x){
                    if (y>z){
                        System.out.println(y);
                    }
                }
//                if (z>x){
//                    if (z>y){
//                        System.out.println(z);
                    }
                }




