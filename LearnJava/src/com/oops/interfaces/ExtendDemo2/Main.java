package com.oops.interfaces.ExtendDemo2;

public class Main implements A, B {

    //Talking about access modifier,nothing less restrictive can be available in the override method
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
