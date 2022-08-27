package com.oops.generics;

import java.util.Arrays;

//Here T can either be Number or its subclasses
public class WildCardExample1<T extends Number> {
    private Object[] data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;  //working as index value


    public WildCardExample1() {
        this.data= new Object[DEFAULT_SIZE];
    }

    public void add(T value){
        if(isFull()){
            resize();
        }
        //first add num in data[size] and then increase the value of size
        data[size++]=value;
    }

    private void resize() {
        Object[] temp=new Object[2*data.length];

        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }


    @Override
    public String toString() {
        Object[] temp=new Object[size];
        // or ----> Object[] temp=new Object[size];
        for(int i=0;i<size;i++)
            temp[i]=data[i];
        return Arrays.toString(temp);
    }





    public static void main(String[] args) {
        WildCardExample1<Integer> arr=new WildCardExample1<>();
        arr.add(34);
        arr.add(44);
        arr.add(54);


        //arr.print();
        System.out.println(arr); //will call toString function internally
    }
}
