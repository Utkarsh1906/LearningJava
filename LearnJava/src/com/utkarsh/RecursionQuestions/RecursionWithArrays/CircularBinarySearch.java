package com.utkarsh.RecursionQuestions.RecursionWithArrays;

public class CircularBinarySearch {
    public static void main(String[] args) {
        int[] arr={34,55,67,89,97,98,99,12,21,26,28,33};
        int target=99;
        System.out.println(circularBS(arr,target,0,arr.length-1));
    }

    static int circularBS(int[] arr,int target, int start, int end)
    {

        if(start>end)
            return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
            return mid;

        if(arr[mid]>arr[start])
        {
            if(target>=arr[start] && target<=arr[mid])
                return circularBS(arr,target,start,mid-1);
            else
               return  circularBS(arr,target,mid+1,end);

        }
        else
        {
            if(target>=arr[mid] && target<=arr[end])
                return circularBS(arr,target,mid+1,end);
            else
                return  circularBS(arr,target,start,mid-1);
        }

    }
}
