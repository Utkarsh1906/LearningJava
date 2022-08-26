package com.utkarsh;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        for (int i=100;i<1000;i++) {
         checkArmstrong(i);
        }


   }

    private static void checkArmstrong(int num) {
        int n = num;
        int sum = 0;
        while (n > 0) {
            int c = n % 10;
            sum += c * c * c;
            n /= 10;
        }
        if (sum == num) {
            System.out.println(num);

        }
    }
}
