package com.oops.interfaces;

public interface Engine {
    //price is static and final by default
    int price=640000;

    //all methods are abstract methods
    void start();
    void stop();
    void acc();
}
