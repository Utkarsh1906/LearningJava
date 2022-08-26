package com.utkarsh.Maths;

public class SetBitsNumber {
    public static void main(String[] args) {
        int n=7765;
        System.out.println(Integer.toBinaryString(n));
        //System.out.println(setBits(n));
        System.out.println(setBits2(n));
    }
    static int setBits2(int n)
    {
        int count=0;
        while(n>0)
        {
            //n=n-(n&(-n));  //1st method
            n=n&(n-1);       //2nd method
            count++;
        }
        return count;
    }
    static int setBits(int n)  //3rd method
    {
        int ans=0;
        while(n>0)
        {
            int check=n & 1;
            if(check==1)
            {
                ans+=1;
            }
            n>>=1;

        }
        return ans;
    }
}
