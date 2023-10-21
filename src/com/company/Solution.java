//package com.company;
////
////import java.util.*;
////
////public class Solution {
////
////    public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
//////        int a = scan.nextInt();
////        // char myString = "Hi"
////        // String myString = "Hi";
////        // Complete this line
////        // int myInt = 5;
////        // Complete this line
////        int myInt = scan.nextInt();
////        int myInt2 = scan.nextInt();
////        int myInt3 = scan.nextInt();
////
////        // System.out.println(a);
////        // Complete this line
////        // System.out.println("myString is:" +myString);
////        // Complete this line
////        // System.out.println("myInt is:" +myInt);
////        System.out.println(myInt);
////        System.out.println(myInt2);
////        System.out.println(myInt3);
////    }
////}
//
////import java.util.Scanner;
////
////public class Solution {
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int N = sc.nextInt();
////        String ans = "";
//////        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
////        if (N%2==1){
//////            System.out.println("Weird");
////            ans = "Weird";
////        }
////        else if (2<=N && N<=5) {
//////            System.out.println("Not Wierd");
////            ans = "Not Weird";
////        } else if (6<=N && N<=20) {
////            ans = "Weird";
////        }
////        else{
////            ans = "Not Weird";
////        }
////        System.out.println(ans);
////    }
////}
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Solution {
//
//    static boolean isAnagram(String a, String b) {
//        // Complete the function
//        if (a.length() == b.length()) {
//            char[] charArray1 = a.toCharArray();
//            char[] charArray2 = b.toCharArray();
//
//            Arrays.sort(a.toCharArray());
//            Arrays.sort(b.toCharArray());
//        }
//
//    }
//
//}
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//    }
//}