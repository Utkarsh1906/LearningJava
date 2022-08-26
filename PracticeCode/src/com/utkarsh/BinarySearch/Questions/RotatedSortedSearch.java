package com.utkarsh.BinarySearch.Questions;

import java.util.Scanner;

public class RotatedSortedSearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }
        int target=in.nextInt();
        System.out.println(search(nums,target));
    }
     static int search(int[] nums, int target) {
        int peak=peakElement(nums);
         System.out.println(peak);
        int ans=-1;
        ans=searchBetween(nums,target,0,peak);
        if(ans==-1)
        {
            ans=searchBetween(nums,target,peak+1,nums.length-1);
        }
        return ans;

    }
    static int peakElement(int[] nums)
    {
        int s=0;
        int e=nums.length-1;
        while(s<e)
        {
            int m=s+(e-s)/2;


            if(nums[m+1]<nums[m])
            {
                e=m;
            }
            else
            {
                s=m+1;
            }
        }
        return s;

    }
    static int searchBetween(int[] nums,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }

        }
        return -1;
    }
}
