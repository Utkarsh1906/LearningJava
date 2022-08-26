package com.oops.AbstractClasses;

//abstract class can't be final to let the class be inherited by other child class and to let its child class
//override its abstract functions
public abstract class Parent {

    //abstract methods
    abstract void career();
    abstract void partner();
    abstract void income();

    int age;
    final int VALUE;

    //declaration of constructor inside abstract classes
    public Parent(int age) {
        this.age = age;
        VALUE=45454533;
    }

//    abstract static methods can not be created inside abstract classes
    //abstract static void method();  -----> error

//    but

//    static methods can be created inside abstract classes
    static void hello(){
        System.out.println("hey");
    }

    //making normal non-static function
    void normal(){
        System.out.println("This is normal non static function");
    }

//    you can not call abstract constructor
    //abstract Parent();  ---> error

}
