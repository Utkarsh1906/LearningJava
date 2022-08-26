package com.utkarsh.RecursionQuestions;

public class OneToNAndNToOne {
    public static void main(String[] args) {
        int m=5;
        int n=1;
        fun(n,m);
        //fun(n,n);
    }

    static void fun(int n,int m) {

        if(n==m)
        {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        fun(n+1,m);
        System.out.print(n+" ");
    }
//    static void fun(int n,int m)
//    {
//        if(n==0)
//            return;
//        System.out.println(n);
//        fun(n-1,n-1);
//    }
}
