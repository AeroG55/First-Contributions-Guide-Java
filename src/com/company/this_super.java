            // Inheritance using super keyword


//package com.company;
//
//class Base1{
//    Base1(){
//        System.out.println("I am a constructor");
//    }
//    Base1(int x){
//        System.out.println("I am an overloaded constructor with value of x as: " + x);
//    }
//}
//class Derived1 extends Base1{
//    Derived1(){
//        //super(0);
//        System.out.println("I am a derived class constructor");
//    }
//    Derived1(int x, int y){
//        super(x);
//        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
//    }
//}
//
//class ChildOfDerived extends  Derived1{
//    ChildOfDerived(){
//        System.out.println("I am a child of derived constructor");
//    }
//    ChildOfDerived(int x, int y, int z){
//        super(x, y);
//        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
//    }
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        // Base1 b = new Base1();
//        // Derived1 d = new Derived1();
//        // Derived1 d = new Derived1(14, 9);
//        // ChildOfDerived cd = new ChildOfDerived();
//        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
//    }
//}

            // Inheritance using this keyword


package com.company;

class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int v){
            this.a=v;
        }
    public int returnone(){
        return  1;
    }
}
public class this_super {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(4);
        System.out.println(e.getA());

    }
}
