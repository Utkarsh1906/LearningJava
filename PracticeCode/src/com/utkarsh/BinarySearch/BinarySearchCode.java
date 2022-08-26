package com.utkarsh.BinarySearch;

import java.util.Scanner;

public class BinarySearchCode {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int t=in.nextInt();
        int s=0;
        int e=n-1;
        int flag=1;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(arr[m]==t)
            {
                System.out.println(m);
                flag=0;
                break;
            }
            else if(t>arr[m])
            {
                s=m+1;
            }
            else if(t<arr[m])
            {
                e=m-1;
            }
        }
        if(flag==1)
            System.out.println(-1);
    }
}
