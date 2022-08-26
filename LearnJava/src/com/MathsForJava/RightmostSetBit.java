package com.utkarsh.Maths;

public class RightmostSetBit {
    public static void main(String[] args) {
        int n=68;
        System.out.println(rightShift(n));

    }
    static int rightShift(int n)
    {
        int ans=1;
        while (true)
        {
            if ((n & 1) == 1)
                return ans;
            n = n >> 1;
            ans = ans + 1;

            }
    }
}
