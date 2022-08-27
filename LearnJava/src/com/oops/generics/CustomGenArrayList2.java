package com.oops.generics;

import java.util.Arrays;

public class CustomGenArrayList2<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;  //working as index value


    public CustomGenArrayList2() {
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

    //1st way to print your custom Arraylist
    @Override
    public String toString() {
        Object[] temp=new Object[size];
        // or ----> Object[] temp=new Object[size];
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
    public T getIndex(int index){
        return (T)data[index]; //Since return type is of type T, the object type is casted to type T
    }



    public static void main(String[] args) {
        CustomGenArrayList2<String> arr=new CustomGenArrayList2<>();
        arr.add("Utkarsh");
        for (int i = 0; i < 12; i++) {
            arr.add("good");
        }
        System.out.println(arr.getIndex(3));


        //arr.print();
        System.out.println(arr); //will call toString function internally
    }
}
