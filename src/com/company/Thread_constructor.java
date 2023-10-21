package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 30;
        System.out.println("Thank you");
//        while (true){
//            System.out.println("I am a thread");
//        }
    }
}
public class Thread_constructor {
    public static void main(String[] args) {
        MyThr mt = new MyThr("PM");
        MyThr tm = new MyThr("GG");
        mt.start();
        System.out.println("The id of the thread is "+ mt.getId());
        System.out.println("The name of the thread is "+ mt.getName());
        System.out.println("The id of the thread is "+ tm.getId());
        System.out.println("The name of the thread is "+ tm.getName());
    }
}
