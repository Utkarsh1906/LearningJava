package com.oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

/*NOTE:The problem with this CustomArrayList is that it can store only integer
        We will solve this problem using Generics*/
public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;  //working as index value


    public CustomArrayList() {
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        //first add num in data[size] and then increase the value of size
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[2*data.length];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    //1st way to print your custom Arraylist
    @Override
    public String toString() {
        int[] temp=new int[size];
        for(int i=0;i<size;i++)
            temp[i]=data[i];
        return Arrays.toString(temp);
    }

    //2nd way to print your custom Arraylist
    public void print(){
        System.out.print("[ ");
        for(int i=0;i<size-1;i++){
            System.out.print(data[i]+" ,");
        }
        for(int i=size-1;i==size-1;i++){
            System.out.println(data[i]+" ]");
        }
    }



    public static void main(String[] args) {
        CustomArrayList arr=new CustomArrayList();
        for(int i=0;i<23;i++){
            arr.add(i);
        }

        arr.print();
        System.out.println(arr); //will call toString function internally
    }


}
