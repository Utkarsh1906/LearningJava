package com.utkarsh;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=input.nextInt();
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            n/=10;
        }
        System.out.print("Sum of the digits given above is: "+ sum);
    }
}
