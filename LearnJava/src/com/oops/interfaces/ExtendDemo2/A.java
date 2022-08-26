package com.oops.interfaces.ExtendDemo2;

public interface A {
    // static interface methods should always have a body, It will be called using interface name
    static void greeting() {
        System.out.println("Hey I am a static method");
    }


    // default method will have a body, it will run in case no-one overrides it
    default void fun() {
        System.out.println("If none overrides me ,I will be executed");
    }
}
