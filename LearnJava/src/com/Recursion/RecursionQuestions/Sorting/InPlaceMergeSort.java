package com.utkarsh.RecursionQuestions.Sorting;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr={50,45,304,22,111};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(array));
    }
    static void mergeSort(int[] arr,int start,int end)
    {
        if(start==end)
            return;
        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);

        merge(arr,start,mid,end);
    }
    static void merge(int[] arr,int start,int mid,int end)
    {
        int[] mix=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end)
        {
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int m=0;m<mix.length;m++)
        {
            arr[start+m]=mix[m];
        }
    }
}
