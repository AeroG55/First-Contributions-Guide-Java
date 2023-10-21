package com.company;

class MyThr2 extends Thread{

    public void run(){
        int i=0;
        while (i<3333) {

            System.out.println("Thank you " + this.getName());
            i++;
        }
        while (true){
//            System.out.println("I am a thread");
            System.out.println("Thank you "+this.getName());
        }
    }
}
class MyThr3 extends Thread{
    public void run(){
        int i = 30;
        System.out.println("Thank you "+this.getName());
        while (true){
//            System.out.println("I am a thread");
            System.out.println("Thank you "+this.getName());
        }
    }
}
public class Thread_methods {
    public static void main(String[] args) {
        MyThr2 t1 = new MyThr2();
        MyThr3 t2 = new MyThr3();
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
