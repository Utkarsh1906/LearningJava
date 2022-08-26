package com.oops.AbstractClasses;

public class Daughter extends Parent{
    Daughter(int num){
        super(num);
    }
    @Override
    void career() {
        System.out.println("While Prerna wants to be an IAS officer");
    }

    @Override
    void partner() {
        System.out.println("She accepted Utkarsh's proposal");
    }
    @Override
    void income() {
        System.out.println("Income is 1lakh+respect");
    }
}
