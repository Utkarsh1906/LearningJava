package com.utkarsh.RecursionQuestions.RecursionWithArrays;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr={37,61,69,69,89,76,43};
        int target=69;
        ArrayList<Integer> list=new ArrayList<>();
        //System.out.println(search(arr,0,target));
        System.out.println(findAllTarget(arr,target,0,list));
        System.out.println(list);
    }

    static ArrayList findAllTarget(int[] arr, int target, int i, ArrayList<Integer> list) {
        if(i==arr.length)
            return list;
        if(arr[i]==target)
            list.add(i);
        return findAllTarget(arr,target,i+1,list);
    }

    static int search(int[] arr,int i,int target)
    {
        if(i==arr.length)
            return -1;

        if(arr[i]==target)
            return i;

        return search(arr,i+1,target);
    }
}
