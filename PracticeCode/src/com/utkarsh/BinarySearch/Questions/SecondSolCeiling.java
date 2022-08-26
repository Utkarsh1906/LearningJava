package com.utkarsh.BinarySearch.Questions;

import java.util.Scanner;

public class SecondSolCeiling {
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
            if(target>arr[m])
            {
                s=m+1;
            }
            else if(target<arr[m])
            {
                e=m-1;
            }
            else
                return m;

        }
        return s;
    }
}
