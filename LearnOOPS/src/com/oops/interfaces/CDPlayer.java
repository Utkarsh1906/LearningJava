package com.oops.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Music system starts");
    }

    @Override
    public void stop() {
        System.out.println("Music system stops");
    }
}
