package com.utkarsh.Maths;


public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=40;
        boolean[] flag=new boolean[n+1];
        isPrime(flag,n);
        for(int i=2;i<=n;i++)
        {
            if(!flag[i])
                System.out.print(i+ " ");
        }

    }

    private static void isPrime(boolean[] flag, int n) {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
                int count=i*2;
                while(count<=n)
                {
                    flag[count]=true;
                    count+=i;
                }


        }
    }
}
