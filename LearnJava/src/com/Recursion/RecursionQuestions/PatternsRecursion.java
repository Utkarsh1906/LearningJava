package com.utkarsh.RecursionQuestions;

public class PatternsRecursion {
    public static void main(String[] args) {
        int n=4;
        printPattern(n,1);

    }
    static void printPattern(int row,int column)
    {
        if(row==0)
            return;
        if(column<=row)
        {
            System.out.print("* ");
            printPattern(row,column+1);
        }
        else
        {
            System.out.println("");
            printPattern(row-1,1);
        }


    }
}
