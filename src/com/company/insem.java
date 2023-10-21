package com.company;

// Methods

//import java.util.Scanner;
//
//public class insem {
//    public static int insem(int x , int y)
//    {
//        if (x<y){
////            System.out.println("x is smaller");
//            return x;
//        }
//        else {
////            System.out.println("x is greater");
//            return y;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner st = new Scanner(System.in);
//        System.out.println("Enter value of x : ");
//        int x = st.nextInt();
//        System.out.println("Enter value of y : ");
//        int y = st.nextInt();
//        int z = insem(x,y);
//        System.out.println("The minimum value between a and b is : " +z);
//    }
//}

// Default constructor

//public class insem {
//    insem(){
//        System.out.println("insem");
//    }
//
//    public static void main(String[] args) {
//        insem in = new insem();
//    }
//}

// Parameterized constructor

//public class insem {
//    int id;
//    String city;
//    insem(int i, String c){
//        id = i;
//        city = c;
//    }
//    void display(){
//        System.out.println("Id is : " +id);
//        System.out.println("City is : " +city);
//
//    }
//
//    public static void main(String[] args) {
//        insem I1 = new insem(8,"pune");
//        insem I2 = new insem(9,"mumbai");
//        I1.display();
//        I2.display();
//    }
//
//}

// Constructor Overloading

//public class insem {
//
//    insem(){
//        System.out.println("Overloading");
//    }
//
//    String name;
//    insem(String n){
//        name = n;
//    }
//
//    int phno;
//    float marks;
//    insem(int p, float m){
//        phno = p;
//        marks = m;
//    }
//
//    void display(){
//        System.out.println("Name is: " +name);
//        System.out.println("Phone no : "+phno);
//        System.out.println("Marks are: "+marks);
//    }
//
//    public static void main(String[] args) {
//        insem i1 = new insem();
//        insem i2 = new insem("pratik");
//        insem i3 = new insem(100,90.7f);
//
//        i1.display();
//        i2.display();
//        i3.display();
//
//    }
//}

//  Write a Java program to design a class date, including the following
//members. [8]
//A) Data members :
//1) day
//2) month
//3) year
//B) Methods :
//1) Constructor to initialize the date object
//2) Display method to display date in format dd:mm:yyyy
//Write a program to invoke all the methods.

//public class insem {
//    // Data members
//    int day;
//     int month;
//     int year;
//
//    // Constructor to initialize the Date object
//     insem(int day, int month, int year) {
//        this.day = day;
//        this.month = month;
//        this.year = year;
//    }

    // Display method to display date in format dd:mm:yyyy
//     void displayDate() {
//        System.out.printf("%02d:%02d:%04d\n", day, month, year);
//    }
//
//    public static void main(String[] args) {
//        // Create a Date object
//        insem myDate = new insem(7, 9, 2023);
//
//        // Display the date using the displayDate method
//        System.out.print("Date: ");
//        myDate.displayDate();
//    }
//}

// Code for factorial

//public class insem {
//    public static void main(String[] args) {
//        int i,fact = 1;
//        int n = 5;
//        for ( i=1; i<=n; i++){
//            fact = fact * i;
//        }
//        System.out.println("Factoral of first 5 numbers is : " +fact);
//    }
//}

//import java.util.Scanner;
//
//public class insem {
//    public static void main(String[] args)
//    {
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Enter Purchase Price (p):");
//        double p=scan.nextDouble();
//        System.out.print("Enter years of service (y):");
//        int y=scan.nextInt();
//        System.out.print("Enter annual depreciation(d):");
//        double d=scan.nextDouble();
//        double salvageValue= p - d*y;
//        System.out.println("Salvage Value ="+salvageValue);
//    }
//}

// Print odd numbers from first 30 numbers

//public class insem{
//    public static void main(String[] args) {
//        int i;
//        for ( i = 1; i <= 30; i++){
//            if ( i%2 != 0){
//                System.out.println(" " +i);
//            }
//        }
//    }
//}

// Question : For a certain electrical circuit with an inductance L and resistance R, the damped
//frequency is given by
//Frequency = .
//1
//𝐿𝐶 −
//𝑅
//2
//4𝐶
//2
//Write a java program which will accept L,C and R values from the user and will display the
//frequency.

import javax.print.DocFlavor;
import java.util.Scanner;

public class insem {
    public static void main(String[] args)
    {
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Enter the Value of Inductance (L):");
//        double L=scan.nextDouble();
//        System.out.print("Enter the Value of Capacitor(C):");
//        int C=scan.nextInt();
//        System.out.print("Enter the Value of Register(R):");
//        double R=scan.nextDouble();
//        double a=1/(L*C);
//        double b=(R*R/4*C*C);
//        double c=a-b;
//        double frequencyValue= Math.sqrt(c);
//        System.out.println("Frequency Value ="+frequencyValue);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number = ");
//        int n = sc.nextInt();
//
//        for (int b = 1; b<=n; b++) {
//            System.out.print("Pratik" + " ");
////            System.out.print(" ");
//        }


                                       // LARGEST OF THREE NUMBERS


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first number = ");
//        int a = sc.nextInt();
//        System.out.print("Enter second number = ");
//        int b = sc.nextInt();
//        System.out.print("Enter third number = ");
//        int c = sc.nextInt();

//        if (a>b){
//            if (a>c){
//                System.out.println("First number is largest");
//            }
//        }
//        if (b>a){
//            if (b>c){
//                System.out.println("Second number is largest");
//            }
//        }
//        else {
//            System.out.println("Third number is largest");
//        }

//        int max = a;
//
//        if (b>max){
//            max = b;
//        }
//
//        if (c>max){
//            max = c;
//        }


//        int max = Math.max(c,Math.max(a,b));
//
//        System.out.println(max);


                                   // CASECHECK

//        Scanner sc = new Scanner(System.in);
////        String a = "Penny";
////        System.out.println(a.charAt(2));
//        char ch = sc.next().trim().charAt(0);
//
//        if (ch >= 'a' && ch<= 'z'){
//            System.out.println("Lower Case");
//        }
//        else {
//            System.out.println("Upper Case");
//        }
//        System.out.println(ch);


                          // FIBONACCI SERIES

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count<=n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}