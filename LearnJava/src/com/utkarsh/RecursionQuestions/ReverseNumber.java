package com.utkarsh.RecursionQuestions;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=378346;
        int m=0;
        //reverse(n);
        n=reverse(m,n);
        System.out.println(n);
    }

    static int reverse(int m,int n)
    {
        if(n<=0)
            return m;
        m=m*10+(n%10);
        return reverse(m,n/10);
    }
    static void reverse(int n) {
        if(n<=0)
            return;
        System.out.print(n%10+" ");
        reverse(n/10);
    }
}
