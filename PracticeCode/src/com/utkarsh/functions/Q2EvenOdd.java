package com.utkarsh.functions;

import java.util.Scanner;

public class Q2EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("The number is " + check(num));
    }

    static String check(int num) {
        if(num%2==0){
            return "even";
        }
        return "odd";

    }
}
