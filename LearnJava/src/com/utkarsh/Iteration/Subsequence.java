package com.utkarsh.Iteration;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<ArrayList<Integer>> subset=new ArrayList<>();
        subset.add(new ArrayList<>());
        for (int num : arr) {
            int n = subset.size();
            for (int j = 0; j < n; j++) {
                //constructor will copy entire subset arraylist
                ArrayList<Integer> internal = new ArrayList<>(subset.get(j));
                internal.add(num);
                subset.add(internal);
            }
        }
        System.out.println(subset);

    }
}
