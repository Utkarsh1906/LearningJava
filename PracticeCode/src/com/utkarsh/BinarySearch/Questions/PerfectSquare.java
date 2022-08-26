package com.utkarsh.BinarySearch.Questions;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {

        int start=1;
        int end=num;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid>46340)
            {
                end=46340;
              // mid=start+(end-start)/2;
                continue;
            }
            if(mid*mid>num)
            {
                end=mid-1;
            }
            else if(mid*mid<num)
            {
                start=mid+1;
            }
            else
            {
                return true;
            }
        }
        return false;

    }
}
