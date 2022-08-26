package com.utkarsh.BinarySearch.Questions;

import java.util.Scanner;

public class Mountainarray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print(mountainSearch(arr));

    }
    static int mountainSearch(int[] arr)
    {
        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            int m=s+(e-s)/2;

            if(arr[m+1]>arr[m])
            {
                s=m+1;
            }
            else
            {
                e=m;
            }
        }
        return s;
    }
}
