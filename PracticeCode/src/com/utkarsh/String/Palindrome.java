package com.utkarsh.String;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str="";
        System.out.println(palCheck(str));

    }

    static boolean palCheck(String str) {
        str=str.toLowerCase();
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
                return false;
        }
        return true;

    }

}
