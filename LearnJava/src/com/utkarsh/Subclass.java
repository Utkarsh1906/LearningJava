package com.utkarsh;

import com.oops.AccessModifier.A;

public class Subclass extends A {


    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(24,"Utkarsh");
        int n=obj.num;
    }
}
class SubSubclass2 extends Subclass {


    public SubSubclass2(int num, String name) {

        super(num, name);
    }
    SubSubclass obj2=new SubSubclass(25,"Prerna");
    //int n=obj2.num;
}
