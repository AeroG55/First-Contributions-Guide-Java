package com.company;
class Threading extends Thread{
    public void run(){
        int i = 0;

        while (i<123){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class Threading2 extends Thread{
    public void run(){
//        while (true){
//            try {
//                Thread.sleep(5000);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}
public class PracticeSet_threads {
    public static void main(String[] args) {
        Threading T = new Threading();
        Threading2 TT = new Threading2();
//        T.setPriority(6);
        System.out.println(T.getPriority());
        System.out.println(TT.getPriority());
//        T.start();
        try {
            T.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        TT.start();
        System.out.println(TT.getState());
    }
}
