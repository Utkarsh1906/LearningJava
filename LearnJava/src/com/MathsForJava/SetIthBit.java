package com.utkarsh.Maths;

public class SetIthBit {
    public static void main(String[] args) {
        int n=69;
        int i=5;
        n=setIthBit(n,i);
        System.out.println(n);
    }
    static int setIthBit(int n,int i)
    {
        n= n | (1<<(i-1));
        return n;
//        int value=n & (1 << (i-1));
//        if(value==0)
//        {
//            int adder=1;
//            for(int j=0;j<i-1;j++)
//            {
//                adder*=2;
//            }
//            return n+adder;
//        }
//        else
//            return n;
    }
}
