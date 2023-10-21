package com.company;
//
//abstract class Base{
//    public Base(){
//        System.out.println("I am constructor of base class");
//    }
//    public void sayHello(){
//        System.out.println("Hello");
//    }
//    abstract public void greet();
//}
//class Base1 extends Base{
//    @Override
//    public void greet(){
//        System.out.println("Good Morning");
//    }
//    public void greet1(){
//        System.out.println("Salaam valikum");
//    }
//}
//public class abstract_method {
//    public static void main(String[] args) {
////        Base b = new Base();       // Cannot create an object since it is an abstract class
//        Base1 B = new Base1();
//        B.greet1();
//        B.sayHello();
//        B.greet();
//    }
//}

abstract class Base{
    abstract void fun1();
    void fun2(){
        System.out.println("A in fun2");
    }
}
class a extends Base{

    @Override
    void fun1() {
        System.out.println("A in base");
    }
}

class b extends Base{

    @Override
    void fun1() {
        System.out.println("B in base");
    }
}

public class abstract_method {
    public static void main(String[] args){
        a A = new a();
        b B = new b();

        A.fun1();
        A.fun2();
        B.fun1();
        B.fun2();
    }
}
