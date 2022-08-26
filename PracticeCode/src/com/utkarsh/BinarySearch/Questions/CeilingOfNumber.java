package com.utkarsh.BinarySearch.Questions;

import java.util.Scanner;

public class CeilingOfNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        int ans=ceilingSearch(target,arr);
        System.out.println(ans);
    }
    static int ceilingSearch(int target,int[] arr)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(target<arr[0])
                return 0;
            if(target>arr[arr.length-1])
                return arr.length;
            if(target>arr[m])
            {
                if(target<arr[m+1])
                    return m+1;
                else
                    s=m+1;
            }
            else if(target<arr[m])
            {
                if(target>arr[m-1])
                    return m;
                else
                    e=m-1;
            }
            else
                return m;

        }
        return -1;
    }
}
