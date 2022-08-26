package com.utkarsh.BinarySearch.Questions;

import java.util.Scanner;

public class KthPositive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int k=in.nextInt();
        System.out.println(findKthPositive(arr,k));

    }
    static int findKthPositive(int[] arr, int k) {
        int[] check=new int[arr.length +k+1];
        for(int i=0;i<arr.length-1;i++)
        {
            check[arr[i]]=1;
        }
        int count=0;
        for(int i=1;i<=check.length;i++)
        {
            if(check[i]==0)
            {
                count++;
            }
            if(count==k)
            {
                return i;
            }
        }
        return -1;

    }
}
