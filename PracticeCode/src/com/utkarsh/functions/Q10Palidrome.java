package com.utkarsh.functions;

import java.util.Scanner;

public class Q10Palidrome {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num= in.nextInt();
//        System.out.println(checkPalindrome(num));
        for(int i=1000;i<10000;i++)
        {
            if(checkPalindrome(i)){
                System.out.println(i);
            }
        }
    }

     static boolean checkPalindrome(int num) {
        int rev=0;
        int n=num;
        while(n>0){
            int c=n%10;
            rev=rev*10 + c;
            n/=10;
        }
        if(rev==num){
            return true;
        }
        return false;
    }
}
