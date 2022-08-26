package com.utkarsh;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println(fibo(i));
        }
    }
    static int fibo(int m)
    {
        if(m==0)
            return 0;
        if(m==1)
            return 1;
        return fibo(m-1)+fibo(m-2);
    }
}
