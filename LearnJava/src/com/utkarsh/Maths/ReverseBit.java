package com.utkarsh.Maths;

public class ReverseBit {
    public static void main(String[] args) {
        int n=0;
        System.out.println(reverseBit(n));
    }
    static int reverseBit(int n){
        int m=n;
        int index=0;
        while(m>0) {
            index++;
            m>>=1;
        }
        int temp=1;
        for(int i=0;i<index;i++) {
            n^=temp;
            temp<<=1;
        }
        return n;

    }
}
