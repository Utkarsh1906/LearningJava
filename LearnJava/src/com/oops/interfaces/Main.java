package com.oops.interfaces;

public class Main {
    public static void main(String[] args) {

        //It can also be written like this(variable of interface type)

//        Engine car2=new Car();
//
//        Car car=new Car();
//        car.acc();
//        car.start();
//        car.stop();

        //for car1 object, engine will initially refer to object of PowerEngine class
        NiceCar car1=new NiceCar();

        //for car1 object, engine will initially refer to object of ElectricEngine class
        NiceCar car2 = new NiceCar(new ElectricEngine());

        car1.start();
        car1.startMusic();
        car1.stopMusic();
        car1.stop();
        car1.upgradeEngine();
        car2.start();
        car2.startMusic();
        car2.stopMusic();
        car2.stop();

    }
}
