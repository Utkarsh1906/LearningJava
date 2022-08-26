package com.utkarsh;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=input.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        System.out.print("Factorial of given number is "+ ans);

    }
}
