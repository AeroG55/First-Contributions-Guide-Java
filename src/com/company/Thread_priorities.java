package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 30;
        System.out.println("Thank you "+this.getName());
        while (true){
//            System.out.println("I am a thread");
            System.out.println("Thank you "+this.getName());
        }
    }
}
public class Thread_priorities {
    public static void main(String[] args) {
        MyThr1 mt = new MyThr1("PM");
        MyThr1 tm = new MyThr1("GG");
        MyThr1 gm = new MyThr1("GM");
        MyThr1 nw = new MyThr1("TM");
        nw.setPriority(Thread.MAX_PRIORITY);
        mt.setPriority(Thread.MIN_PRIORITY);
        tm.setPriority(Thread.MIN_PRIORITY);
        gm.setPriority(Thread.MIN_PRIORITY);
        mt.start();
        tm.start();
        gm.start();
        nw.start();
    }
}
