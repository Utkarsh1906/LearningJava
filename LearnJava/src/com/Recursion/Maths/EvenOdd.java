package com.utkarsh.Maths;

public class EvenOdd {
    public static void main(String[] args) {
        int n=75;
        System.out.println(isEven(n));
    }
    static boolean isEven(int n)
    {
        return (n & 1)==0;
    }
}
