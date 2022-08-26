package com.utkarsh.Maths;

public class XorAToB {
    public static void main(String[] args) {
        int a=5;
        int b=9;
        int xorA=xorTillGivenNum(a-1);
        int xorB=xorTillGivenNum(b);
        System.out.println((xorA)^(xorB));
    }

    private static int xorTillGivenNum(int n)
    {
        int ans=0;
        if(n%4==0)
            ans=n;
        if(n%4==1)
            ans=1;
        if(n%4==2)
            ans=n+1;
        if(n%4==3)
            ans=0;
        return ans;
    }


}
