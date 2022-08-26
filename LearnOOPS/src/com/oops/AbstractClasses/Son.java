package com.oops.AbstractClasses;

public class Son extends Parent{
    Son(int num){
        super(num);
    }

    @Override
    void normal(){
        super.normal();
    }
    @Override
    void career() {
        System.out.println("Utkarsh says: I want to be an engineer");
    }

    @Override
    void partner() {
        System.out.println("His life partner is Prerna");
    }
    @Override
    void income() {
        System.out.println("Income is 1lakh");
    }
}
