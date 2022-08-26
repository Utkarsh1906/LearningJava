package com.utkarsh.Maths;

public class NoOfZeroes {
    public static void main(String[] args) {
        int n=7060740;
        int ans=0;
        System.out.println(func(n,ans));
    }
    static int func(int n,int ans)
    {
        if(n<=0)
            return ans;
        //int check=n%10;
        if(n%10==0)
            ans+=1;
        return func(n/10,ans);
    }
}
