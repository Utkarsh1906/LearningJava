package com.oops;

public class InnerClasses {

    public static void main(String[] args) {
        Test a=new Test("Utkarsh");
        Test b=new Test("Prerna");
        System.out.println(a);
    }
}
class Test{
    String name;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
