package com.utkarsh.RecursionQuestions.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,9,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int first, int last) {
        if(last<=first)
            return;
        int start=first;
        int end=last;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while(start<=end)
        {
            while(arr[start]<pivot)
                start++;
            while(arr[end]>pivot)
                end--;
            if(start<=end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

        }
        quickSort(arr,first,end);
        quickSort(arr,start,last);
    }
}
