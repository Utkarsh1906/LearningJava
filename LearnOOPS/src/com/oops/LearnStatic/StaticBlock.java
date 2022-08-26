package com.oops.LearnStatic;

public class StaticBlock {
    static int a=4;
    static int b;
    static
    {
        System.out.println("static block");
        b=a*5;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        int c=9;
    }
}
