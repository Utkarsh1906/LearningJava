package com.oops.ExceptionHandling;

/** There are five keywords of exception handling
 *   1) try
 *   2) catch
 *   3) finally
 *   4) throw
 *   5) throws
 *   we will learn all these keywords here*/
public class Main {
    public static void main(String[] args) {
        int a=4;
        int b=0;
        try{
            //int c=a/b;
            System.out.println(divide(a,b));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This keyword 'finally' will always run");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Do not divide by 0");
        }
        return a/b;
    }
}
