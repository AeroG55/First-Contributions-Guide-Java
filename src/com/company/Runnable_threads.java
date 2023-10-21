package com.company;

class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println("Running thread");
    }

}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("Running thread 2");
    }

}
public class Runnable_threads {
    public static void main(String[] args) {
        MyThreadRunnable mth = new MyThreadRunnable();
        Thread pm = new Thread(mth);

        MyThreadRunnable2 mth2 = new MyThreadRunnable2();
        Thread gg = new Thread(mth2);
        
        pm.start();
        gg.start();
    }
}
