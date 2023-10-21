package com.company;

class MyThread extends Thread {
    public void run(){
        int i = 0;
        while (i<2000) {
            System.out.println("hello");
            System.out.println("World");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while (i<2000) {
            System.out.println("Thread 2");
            System.out.println("New thread");
            i++;
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
