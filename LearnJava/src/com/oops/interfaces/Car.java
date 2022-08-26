package com.oops.interfaces;

public class Car implements Engine,Brake{
    @Override
    public void brake() {
        System.out.println("I stop the car by applying brakes");
    }

    @Override
    public void start() {
        System.out.println("I normally start the car");
    }

    @Override
    public void stop() {
        System.out.println("I normally stop the car");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate the car normally");

    }
}
