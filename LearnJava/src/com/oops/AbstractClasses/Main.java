package com.oops.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son boy=new Son(30);
        boy.career();
        boy.partner();

        Daughter girl=new Daughter(26);
        girl.career();
        girl.partner();

        //We can't create an object of abstract class
        //Parent father=new Parent();   -----> error

        //But we can create reference variable of type parent class referencing to object of some other class
        Parent mom=new Son(35);
        mom.income();

        //Calling static method of Parent abstract class
        Parent.hello();
    }
}
