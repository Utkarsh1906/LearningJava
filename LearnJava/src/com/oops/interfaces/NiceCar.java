package com.oops.interfaces;

public class NiceCar {
    //we are hiding these data to become not-accessible from other classes
    private Engine engine;
    private final Media player = new CDPlayer();

    //default constructor will be called to create an object of PowerEngine class
    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    //Whatever object the engine reference variable is referring to will implement its own start function
    public void start() {
        engine.start();
    }
    //Whatever object the engine reference variable is referring to will implement its own stop function
    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}