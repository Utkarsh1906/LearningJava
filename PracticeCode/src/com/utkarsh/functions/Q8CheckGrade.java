package com.utkarsh.functions;

import java.util.Scanner;

public class Q8CheckGrade {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num =in.nextInt();
        System.out.println(checkGrade(num));
    }

     static String checkGrade(int num) {
         if(num<=100 && num>=91) {
             return "AA";
         }
         if(num<=90 && num>=81) {
             return "AB";
         }
         if(num<=80 && num>=71) {
             return "BB";
         }
         if(num<=70 && num>=61) {
             return "BC";
         }
         if(num<=60 && num>=51) {
             return "CD";
         }
         if(num<=50 && num>=41) {
             return "DD";
         }
         else{
             return "Fail";
         }
    }
}
