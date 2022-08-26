package com.utkarsh.Maths;

import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            int start=0;
            int end=image[i].length-1;
            while(start<=end)
            {
                if(start==end)
                {
                    image[i][start]^=1;
                    start++;
                    end--;
                    continue;
                }
                image[i][start]^=1;
                image[i][end]^=1;
                int temp=image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp;
                start++;
                end--;
            }
        }
        return image;

    }
}
