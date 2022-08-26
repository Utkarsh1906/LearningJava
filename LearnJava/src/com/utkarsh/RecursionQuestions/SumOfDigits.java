package com.utkarsh.RecursionQuestions;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=508;
        int ans=0;
        System.out.println(sumDigits(n,ans));
    }

     static int sumDigits(int n,int ans) {
        if(n<=0)
            return ans;
        int adder=n%10;
        ans+=adder;
        return sumDigits(n/10,ans);

    }
}
