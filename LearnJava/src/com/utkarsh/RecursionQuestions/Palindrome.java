package com.utkarsh.RecursionQuestions;

public class Palindrome {
    public static void main(String[] args) {
        int n=78998;
        int m=0;
        //reverse(n);
        if(n==reverse(m,n))
            System.out.println(true);
        else
            System.out.println(false);
    }
    static int reverse(int m,int n)
    {
        if(n<=0)
            return m;
        m=m*10+(n%10);
        return reverse(m,n/10);
    }
}
