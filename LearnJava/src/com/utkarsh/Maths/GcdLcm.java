package com.utkarsh.Maths;

public class GcdLcm {
    public static void main(String[] args) {
        int a=7;
        int b=14;
        int hcf=gcd(a,b);
        System.out.println("HCF is "+ hcf);
        System.out.println("LCM is "+a*b/hcf);

    }
    static int gcd(int a,int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}
