package com.utkarsh;

import java.util.Scanner;

public class BSusingRecursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        int start=0;
        int end=n-1;
        System.out.println(search(arr,target,start,end));
    }
    static int search(int[] arr,int target,int start,int end)
    {
        if(start>end)
            return -1;
        int mid=start+(end-start)/2;
        if (target>arr[mid])
        {
            return search(arr,target,mid+1,end);
        }
        else if(target<arr[mid])
        {
            return search(arr,target,start,mid-1);
        }
        else
            return mid;


    }
}
