package com.utkarsh.functions;

import java.util.Scanner;


public class Q1CheckMaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("The maximum number is " + max(a,b,c));
        System.out.println("The minimum number is " + min(a,b,c));

    }

    static int min(int a, int b, int c) {
        if(a<b){
            if(a<c){
                return a;
            }
            return c;
        }
        if(b<c){
            return b;
        }
        return c;
    }
    static int max(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            return c;
        }
        if(b>c){
            return b;
        }
        return c;
    }
}
