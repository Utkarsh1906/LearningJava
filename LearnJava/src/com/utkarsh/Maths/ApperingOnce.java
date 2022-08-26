package com.utkarsh.Maths;

public class ApperingOnce {
    //Best solution is to xor all numbers IF NUMBERS ARE APPEARING EVEN TIMES
//    public static void main(String[] args) {
//        int[] arr={2,3,2,5,3,5,6,6,4,7,7};
//        System.out.println(xorAll(arr));
//    }
//    static int xorAll(int[] arr)
//    {
//        int ans=0;
//        for(int n:arr)
//        {
//            ans^=n;
//        }
//        return ans;
//    }

    //This code works only for positive numbers
    public static void main(String[] args) {
        int[] arr={2,2,3,2,7,7,8,7,3,3};
        System.out.println(FindNumberAppearingOnce(arr));
       // int max=maximum(arr);
//        int[] dummy=new int[max+1];
//        for(int i=0;i<arr.length;i++)
//        {
//            dummy[arr[i]]++;
//        }
//        for(int i=0;i<max+1;i++)
//        {
//            if(dummy[i]==1)
//            {
//                System.out.println(i);
//            }
//        }
    }
    static int maximum(int[] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        return max;
    }
    public static int FindNumberAppearingOnce(int[] numbers) {
        int[] bitSum = new int[32];
        for(int i = 0; i < 32; ++i) {
            bitSum[i] = 0;
        }

        for(int i = 0; i < numbers.length; ++i) {
            int bitMask = 1;
            for(int j = 31; j >= 0; --j) {
                int bit = numbers[i] & bitMask;
                if(bit != 0) {
                    bitSum[j] += 1;
                }

                bitMask = bitMask << 1;
            }
        }

        int result = 0;
        for(int i = 0; i < 32; ++i) {
            result = result << 1;
            result += bitSum[i] % 3;
        }

        return result;
    }
}
