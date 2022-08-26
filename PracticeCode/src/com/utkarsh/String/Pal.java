package com.utkarsh.String;

public class Pal {
    public static void main(String[] args) {
        String str="abccba";
        int start=0;
        int end=str.length()-1;
        while(start<=end)
        {
            if(str.charAt(start)==str.charAt(end))
            {
                start++;
                end--;
            }
            else
                break;
        }
        if(start>end)
            System.out.println("palindrome");
        else
            System.out.println("Not a palindrome");

    }
}
