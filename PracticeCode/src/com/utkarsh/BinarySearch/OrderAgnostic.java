package com.utkarsh.BinarySearch;

import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        int check = 0;
        if((arr[n-1]-arr[0])>=0)
            check=1;
        if((arr[n-1]-arr[0])<0)
            check=0;

        int ans=search(arr,target,check);
        System.out.println(ans);


    }
    static int search(int[] arr ,int target ,int check)
    {
            int s=0;
            int e=arr.length;
            while(s<=e)
            {
                int m = s + (e - s) / 2;
                if (check == 1)
                {
                    if (target > arr[m])
                    {
                        s = m + 1;
                    }
                    else if (target < arr[m])
                    {
                        e = m - 1;
                    }
                    else
                        return m;

                }
                if (check == 0)
                {
                    if (target > arr[m])
                    {
                        e=m-1;
                    }
                    else if (target < arr[m])
                    {
                        s=m+1;
                    }
                    else
                        return m;

                }

            }


        return -1;
    }
}
