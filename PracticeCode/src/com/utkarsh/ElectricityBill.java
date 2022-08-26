package com.utkarsh;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter power of the Electric machine(watts): ");
        int power=input.nextInt();
        System.out.print("Enter number of hours it is used in a day: ");
        int time=input.nextInt();
        System.out.print("Enter price per unit: ");
        int price= input.nextInt();
        float unit=(float)power*time/1000;
        float bill=(float)(unit*30.0)*price;
        System.out.print("Electricity bill per month is: "+ bill);
        Integer a=10;

    }
}
