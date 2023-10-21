//import java.awt.*;
//import java.util.Scanner;
//
//public class Circle extends Point  {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Point p1=new Point();
//        p1.x=sc.nextDouble();
//        p1.y=sc.nextDouble();
//        Point p2=new Point();
//        p2.x=sc.nextDouble();
//        p2.y=sc.nextDouble();
//        Circle c1=new Circle();
//        c1.distance(p1,p2);
//
//        class Point {
//            double x,y;
//            result = Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
//  System.out.println(result);
//  return result;
//        }
//    }
//
//}

// github.com/RodneyShag

//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        /* Save input */
//        Scanner scan = new Scanner(System.in);
//        String A = scan.next();
//        String B = scan.next();
//        scan.close();
//
//        /* Sum lengths */
//        System.out.println(A.length() + B.length());
//
//        /* Compare lexicographical ordering */
//        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
//
//        /* Print the Strings in desired format */
//        System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
//    }
//
//    private static String capFirstLetter(String str) {
//        if (str == null || str.length() == 0) {
//            return "";
//        } else {
//            return str.substring(0,1).toUpperCase() + str.substring(1);
//        }
//    }
//}

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String A=scan.next();
        String B=scan.next();
        /* Enter your code here. Print output to STDOUT. */

        scan.close();

        System.out.println(A.length() + B.length());

        System.out.println(A.compareTo(B) > 0? "yes" : "no");

        System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
    }

    private static String capFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        } else {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
    }
}



