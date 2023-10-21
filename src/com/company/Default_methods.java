package com.company;

interface  Camera{
    void takeSnap();
    void recordVideo();
    //void phoneNumber();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting..");
    }
}

class SmartPhone extends CellPhone implements Wifi, Camera{
        public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Taking Video");
    }
public String[] getNetwrks(){
        System.out.println("Getting list of networks");
        return new String[]{"PM", "GG", "SS"};
    }

    public String[] getNetworks() {
        return new String[0];
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " +network);
    }
}
public class Default_methods {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        String[] ar = sp.getNetworks();
        for (String item:ar){
            System.out.println(item);
        }
        sp.record4KVideo();
    }
}
