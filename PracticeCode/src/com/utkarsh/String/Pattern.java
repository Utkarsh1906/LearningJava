package com.utkarsh.String;

public class Pattern {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(4);
        //pattern3(5);
        //pattern4(5);
        //pattern5(6);
        //pattern6(5);
       // pattern7(5);
        //pattern8(5);
       // pattern9(6);
        //pattern28(5);
        //pattern30(5);
        //pattern17(4);
       // pattern5new(5);
       // pattern28new(5);
       // pattern30new(3);
        //pattern17new(4);
       // pattern31(9);
        pattern17new2(4);
    }
    static void pattern17new2(int n)
    {
        for(int row=1;row<=2*n-1;row++)
        {
//            int noOfSpaces=row>n ? row-n : n-row;
            int c =row>n ? 2*n-row:row;
            for (int space=1;space<=n-c;space++)
            {
                System.out.print("  ");
            }
            for (int column=c;column>=1;column--)
            {
                System.out.print(column+" ");
            }
            for(int column=2;column<=c;column++)
            {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n)
    {
        int originalN=n;
        n=2*n;
        for(int row=0;row<n-1;row++)
        {
            for(int column=0;column<n-1;column++)
            {
                int atEveryIndex=originalN-Math.min(Math.min(row,column),Math.min(n-2-row,n-2-column));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void pattern17new(int n)
    {
        for(int row=1;row<2*n;row++)
        {
            int noOfSpaces= row>n ? row-n:n-row;
            int noOfNumbers=2*(n-noOfSpaces)-1;
            for(int space=1;space<=noOfSpaces;space++)
            {
                System.out.print(" ");
            }
            int num=row>n ? 2*n-row : row;
            for(int column=1;column<=noOfNumbers;column++)
            {
                System.out.print(num);
                if(noOfSpaces+column<n)
                    num--;
                else
                    num++;
            }
            System.out.println();
        }
    }
    static void pattern30new(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int noOfSpaces=n-row;
            int noOfNumbers=2*(n-noOfSpaces)-1;
            for(int space=1;space<=noOfSpaces;space++)
            {
                System.out.print(" ");
            }
            int num=row;
            for(int column=1;column<=noOfNumbers;column++)
            {
                System.out.print(num);
                if(noOfSpaces+column<n)
                    num--;
                else
                    num++;

            }
            System.out.println();
        }
    }
    static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=n;column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=row;column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=n-row+1;column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=row;column++)
            {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n)
    {
        for(int row=1;row<=(n/2)+1;row++)
        {
            for(int column=1;column<=row;column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=n/2;row++)
        {
            for(int column=1;column<=n/2-row+1;column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=n;column++)
            {
               if(column<=n-row)
               {
                   System.out.print("  ");
               }
               else
                   System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=n;column++)
            {
                if(column>=row)
                {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<n*2;column++)
            {
                if(column<=n-row || column>=n+row)
                {
                    System.out.print("  ");
                }
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<2*n;column++)
            {
                if(column<row || column>2*n -row)
                {
                    System.out.print("  ");
                }
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<2*n;column++)
            {
                if(column<=n-row || column>=n+row)
                {
                    System.out.print("  ");
                }
                else
                {
                    if(row%2==column%2)
                    {
                        System.out.print("* ");
                    }
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row=n-1;row>=1;row--)
        {
            for(int column=1;column<2*n;column++)
            {
                if(column<=n-row || column>=n+row)
                {
                    System.out.print("  ");
                }
                else
                {
                    if(row%2==column%2)
                    {
                        System.out.print("* ");
                    }
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void pattern30(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int num=row;
            for(int column=1;column<2*n;column++)
            {

                if(column<=n-row || column>=n+row)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(num+" ");
                    if(column<n)
                        num--;
                    else
                        num++;
                }
            }
            System.out.println();
        }
    }
    static void pattern17(int n)
    {
        for(int row=1;row<2*n;row++)
        {
            int num=row;
            for(int column=1;column<2*n;column++)
            {

                if(column<=n-row || column>=n+row)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(num+" ");
                    if(column<n)
                        num--;
                    else
                        num++;
                }
            }
            System.out.println();
        }

    }
    static void pattern5new(int n)
    {
        for(int row=1;row<2*n;row++)
        {
            int c=row>n ? 2*n-row : row;
            for(int column=1;column<=c;column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28new(int n)
    {
        for(int row=1;row<2*n;row++)
        {
            int noOfColumns=row>n ? 2*n-row : row;
            int noOfSpaces=n-noOfColumns;
            for(int space=1;space<=noOfSpaces;space++)
            {
                System.out.print(" ");
            }
            for(int column=1;column<=noOfColumns;column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
