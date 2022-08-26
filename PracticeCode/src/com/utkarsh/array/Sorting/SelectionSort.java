package com.utkarsh.array.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={21,12,-32,0};
        sortingAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortingAlgo(int[] arr)
    {
        int length=arr.length-1;
        while(length>=1)
        {
            int max=arr[0];
            int index=0;
            for(int i=1;i<=length;i++)
            {
                if(arr[i]>max)
                {
                        max=arr[i];
                        index=i;
                }
            }
            arr[index]=arr[length];
            arr[length]=max;
            length--;


        }
    }
}
