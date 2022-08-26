package com.utkarsh.Maths;

public class NthMagic {
    public static void main(String[] args) {
        int n=345;
        System.out.println(nthMagicNumber(n));
    }
    static int nthMagicNumber(int n)
    {
        int bitmask=1;
        int ans=0;
        int base=1;
        //using bitmask and left shift operation
//        for(int i=1;i<=32;i++) //initially assumed that the value of n is not exceeding 2^31
//        {
//            base*=5;
//            if((n & bitmask)!=0)
//                ans+=base;
//            bitmask = bitmask << 1;
//        }

        //using right shift of numbers(better)
        while(n>0)
        {
            base*=5;
            if((n & 1)!=0)
                ans+=base;
            n=n>>1;
        }
        return ans;
    }
}
