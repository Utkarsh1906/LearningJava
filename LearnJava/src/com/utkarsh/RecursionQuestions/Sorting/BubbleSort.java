package com.utkarsh.RecursionQuestions.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={43,54,12,44,23,56,45};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int i, int j) {
        if(i==0)
            return;
        if(j<i)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            bubbleSort(arr,i,j+1);
        }
        else
            bubbleSort(arr,i-1,0);
    }
}
