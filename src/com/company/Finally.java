package com.company;

public class Finally {
    public static int greet() {
        try {
            int a = 60;
            int b = 4;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is the end of this function");
        }
        return 0;
    }
    public static void main(String[] args) {
//        try {
//            int a = 5;
//            int b = 0;
//            int c = a/b;
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("This is the end of this program");
            int k = greet();
        System.out.println(k);
        }
    }

