package com.utkarsh.functions;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Q7CheckPrime {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = in.nextInt();
//        System.out.println("result: " + isPrime(num));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter second number: ");
        int num2=in.nextInt();
        for(int i=num1;i<=num2;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }

    static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }

        for(int i=2;i<=sqrt(num);i++){
            if(num%i==0){
                return false;
            }

        }
        return true;

    }
}
