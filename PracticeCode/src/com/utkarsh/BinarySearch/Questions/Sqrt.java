package com.utkarsh.BinarySearch.Questions;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        System.out.println(mySqrt(x));


    }
    static int mySqrt(int x) {
        if(x<4 && x>0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int start=2;
        int end=x;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid>46339)
            {
                end=46340;
                continue;
            }

            if(mid*mid>x)
            {
                end=mid-1;
            }
            else if(mid*mid<x)
            {
                start=mid+1;
            }
            else
                return mid;
        }
        return end;
    }
}
