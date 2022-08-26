package com.utkarsh.BinarySearch.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] numbers=new int[n];
        for(int i=0;i<n;i++)
        {
            numbers[i]=in.nextInt();
        }
        int target =in.nextInt();
        System.out.println(Arrays.toString(twoSum(numbers,target)));

    }
    static int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int comparor=minThenTarget(numbers,target);
        while(comparor>=1)
        {
            int start=0;
            int end=comparor;
            int search=target-comparor;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(numbers[mid]>search)
                {
                    end=mid-1;
                }
                else if(numbers[mid]<search)
                {
                    start=mid+1;
                }
                else
                {
                    ans[0]=mid+1;
                    ans[1]=comparor+1;
                    return ans;
                }
            }
            comparor--;
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;


    }
    static int minThenTarget(int[] numbers,int target)
    {
        int start=0;
        int end=numbers.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(numbers[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid;
            }
        }
        return start;
    }
}
