package com.Recursion;


public class BSUsingRecursion {
    public static void main(String[] args) {
        int[] arr={12,23,45,67,78,98,104,123,145};
        int target=103;
        int start=0;
        int end=arr.length-1;
        System.out.println(binarySearch(arr,target,start,end));
    }
    static int binarySearch(int[] arr,int target,int start,int end)
    {
        if(start>end)
            return -1;

        int mid=start+(end-start)/2;
        if(target>arr[mid])
        {
            return binarySearch(arr,target,mid+1,end);
        }
        else if(target<arr[mid])
        {
            return binarySearch(arr,target,start,mid-1);
        }
        else
            return mid;
    }
}
