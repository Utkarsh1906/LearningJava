package com.utkarsh.Maths;

public class IthBit {
    public static void main(String[] args) {
        int n=69;
        int i=5;
        System.out.println(ithBit(n,i));
    }
    static int ithBit(int n,int i)
    {
        int value=n & (1 << (i-1));
        if(value==0)
            return 0;
        else
            return 1;
    }
}
