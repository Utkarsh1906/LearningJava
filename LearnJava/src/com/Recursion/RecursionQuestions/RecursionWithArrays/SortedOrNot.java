package com.utkarsh.RecursionQuestions.RecursionWithArrays;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr={3,5,6,9};
        System.out.println(sortedOrNot(arr,0));
    }
    private static boolean sortedOrNot(int[] arr,int i)
    {
        if(i==arr.length-1)
            return true;
        return (arr[i]<=arr[i+1])&& sortedOrNot(arr,i+1);
    }

    private static boolean sortedOrNot(int[] arr,int first,int second) {
        if(second==arr.length-1 && arr[first]<=arr[second])
            return true;

        if(arr[first]<=arr[second])
            return sortedOrNot(arr,first+1,second+1);
        else
            return false;

    }
}
