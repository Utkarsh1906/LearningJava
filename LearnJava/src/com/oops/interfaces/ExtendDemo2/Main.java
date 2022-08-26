package com.oops.interfaces.ExtendDemo2;

public class Main implements A, B {

    //Talking about access modifier,nothing less restrictive can be available in the override method
    @Override
    public void greet() {

    }

    @Override
    public void fun(){
        System.out.println("I am overriding fun() function of interface A");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        A.greeting(); // static method inside interface will be called via interface name
    }
}
