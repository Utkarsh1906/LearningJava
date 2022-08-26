package com.utkarsh.Maths;

public class SquareRoot {
    public static void main(String[] args) {
        int n=4357;
        int p=3;
        double ans=binarySearch(n);
        double increment=0.1;
        for(int i=0;i<p;i++) {
            while (ans < n / ans)
                ans += increment;
            ans -= increment;
            increment /= 10;
        }

        System.out.println(ans);
    }

    private static int binarySearch(int n) {
        int start=1;
        int end=n;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid>n/mid)
            {
                end=mid-1;
            }
            else if(mid<n/mid)
                start=mid+1;
            else
                return mid;
        }
        return end;
    }
}
