package com.utkarsh.Maths;

public class APowerB {
    public static void main(String[] args) {
        int a=4;
        int b=7;
        System.out.println(aPowerB(a,b));
    }
    static int aPowerB(int a,int b)
    {
        int base =a;
        int ans=1;
        while(b>0)
        {
            int temp=(b & 1);
            if(temp==1)
            {
                ans=ans*base;
            }
            base=base*base;
            b=b>>1;
        }
        return ans;
    }
}
