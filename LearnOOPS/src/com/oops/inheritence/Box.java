package com.oops.inheritence;

public class Box {
    double l;
    double w;
    double h;
    Box(){
        l=-1;
        w=-1;
        h=-1;
    }
    static void greeting(){
        System.out.println("Hey I am in Box class greeting method");
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old)
    {
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
}
