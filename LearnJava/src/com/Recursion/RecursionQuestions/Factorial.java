package com.utkarsh.RecursionQuestions;

public class Factorial {
    public static void main(String[] args) {
        int n=4;
        int ans=1;
        System.out.println(factorial(n,ans));
    }

    static int factorial(int n, int ans) {
        if(n<=1)
            return ans;
        ans+=n;
        return factorial(n-1,ans);
    }
}
