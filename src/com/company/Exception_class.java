package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString();
        }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
public class Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if (a<9){
            try {
                throw new  MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
