package com.utkarsh.array.Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={3,5,1,2,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort(int[] arr)
    {
        int i=0;
        while(i<=arr.length-1)
        {
            if(arr[i]-1!=i)
            {
                swap(arr,i,arr[i]-1);
            }
            else
            {
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
