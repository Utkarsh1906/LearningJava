package com.utkarsh.BinarySearch.Questions;

import java.util.Scanner;

public class SplitArraySum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }
        int m=in.nextInt();
        System.out.println(splitArray(nums,m));

    }
    static int splitArray(int[] nums, int m) {
        int start=startCalculate(nums);
        int end=endCalculate(nums);
        while(start<end)
        {
            int mid=start+(end-start)/2;
            int parts=1;
            int sum=0;
            for(int i=0;i<nums.length;i++)
            {
                if (sum + nums[i] > mid)
                {
                    sum = nums[i];
                    parts++;
                } else
                {
                    sum += nums[i];
                }


            }
            if(parts<=m)
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;

    }
    static int endCalculate(int[] nums)
    {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        return sum;
    }
    static int startCalculate(int[] nums)
    {
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        return max;
    }
}
