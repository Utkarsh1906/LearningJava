package com.utkarsh.RecursionQuestions.RecursionWithArrays;

import java.util.ArrayList;

public class SearchWithoutPassingArgument {
    public static void main(String[] args) {
        int[] arr={37,61,69,69,89,76,69,43,69};
        int target=69;
        System.out.println(findAllTarget(arr,target,0));
    }
    static ArrayList findAllTarget(int[] arr, int target, int i) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> adder;
        if(i==arr.length)
            return list;
        if(arr[i]==target)
            list.add(i);
        adder=findAllTarget(arr,target,i+1);
        //if(!list.isEmpty())
            list.addAll(adder);
        return list;
    }
}
